package demo.products;

import org.springframework.stereotype.Repository;
import java.lang.String;

@Repository
public class ProductRepositoryImpl implements ProductRepository {

    @Override
    public void addProduct(int productId, double productPrice, String productName){
        String message = String.format("Adding product %d into catalouge", productId);
        System.out.println("\tIn Poroduct RepositoryImpl.addProduct(), " + message);
    }


    public boolean deleteProduct (int productId) {
        String message = String.format("Deleteing product %d from catalouge", productId);
        System.out.println("\tIn Product RepositoryImpl.deleteProduct(), " + message);
        return true;
    }
}
