package product;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import product.bizlayer.ProductService;
import product.datalayer.ProductRepository;


@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Application.class, args);

		SpringBootWithBakedBeans(ctx);
	}

	private static void SpringBootWithBakedBeans(ApplicationContext ctx) {

		ProductService service = ctx.getBean(ProductService.class);
		service.adjustPriceByPercent(1, 10);

		double totalValue = service.calculateTotalValue();
		System.out.println(totalValue);

		double averagePrice = service.getAveragePrice();
		System.out.println(averagePrice);

		ProductRepository repo = ctx.getBean("productRepositoryInMemory", ProductRepository.class);
		repo.getAllProducts()
			.stream()
			.forEach(p -> System.out.println(p));
	}

}