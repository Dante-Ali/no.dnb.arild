package product.bizlayer;

import product.models.Product;

import java.util.Collection;

public interface ProductService {

    double calculateTotalValue();
    Collection<Product> getLowStockProducts(long threshold);
    double getAveragePrice();
    void adjustPriceByPercent(long id, double byPercent);
    void addTaxByPrice(long id, double taxByPrice);
    Collection<Product>  addVat();

}
