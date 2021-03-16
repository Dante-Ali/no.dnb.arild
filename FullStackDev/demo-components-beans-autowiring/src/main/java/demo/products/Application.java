package demo.products;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(demo.autowiring.Application.class, args);

        ProductService productService = ctx.getBean(ProductService.class);
        productService.addProductToInventory(1, 10.5, "cookies");
        productService.deleteProductFromInventory(2);
    }
}
