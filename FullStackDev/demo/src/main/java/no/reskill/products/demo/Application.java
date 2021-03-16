package no.reskill.products.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(Application.class, args);

        ProductRepository repo = ctx.getBean(ProductRepositoryInMemory.class);

        repo.getAllProducts()
                .stream()
                .forEach(p->System.out.println(p));

    }
}
