package product.datalayer;


import product.models.Product;

import java.util.Collection;

public interface ProductRepository {
    // Create, Read, Update, Delete

    Collection<Product> getAllProducts();
    Product getProductById(long id);

    Product insertProduct(Product product);
    boolean updateProduct(Product product);
    void updateProduct2(Product product);
    boolean deleteProduct(long id);
}