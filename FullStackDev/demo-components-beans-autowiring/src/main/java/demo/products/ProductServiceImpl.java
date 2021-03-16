package demo.products;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.lang.String;

@Service ("productService")
public abstract class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository repository;

    @Override
    public void addProductToInventory(int productId, double productPrice, String productName){
        System.out.printf("In ProductServiceImpl.addProductToInventory(%d, %.2f, %s)\n", productId, productPrice, productName);
        repository.addProduct(productId, productPrice, productName);
    }

    @Override
    public boolean deleteProductFromInventory(int productId) {
        System.out.printf("In ProductServiceImpl.deleteProductToInventory(%d)\n", productId);
        repository.deleteProduct(productId);
        return true;
    }
}
