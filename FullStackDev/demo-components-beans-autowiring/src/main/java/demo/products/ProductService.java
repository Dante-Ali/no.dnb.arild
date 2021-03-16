package demo.products;

public interface ProductService {
    void addProductToInventory(int productId, double productPrice, String productName);
    boolean deleteProductFromInventory(int productId);
    boolean findProductInInventory (int productId);
}



