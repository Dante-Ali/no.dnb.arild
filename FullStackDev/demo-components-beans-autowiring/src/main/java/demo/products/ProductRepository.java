package demo.products;

//TODO - rename to do* something
public interface ProductRepository {
    void addProduct(int productId, double productPrice, String productName);
    boolean deleteProduct(int productId);
}
