package no.reskill.products.demo;

import java.util.Collection;
import java.util.List;

//TODO - rename to do* something

public interface ProductRepository {


    Collection<Product> getAllProducts();
    Product  getAllProductsByID(long id);

    // have added ID the orinal product with ID set.
    Product insertProduct(Product product);
    boolean updateProduct(Product product);
    boolean deleteProduct(long id);

}
