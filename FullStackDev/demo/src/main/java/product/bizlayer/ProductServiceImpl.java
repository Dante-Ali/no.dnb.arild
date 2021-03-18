package product.bizlayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import product.MyBeanVat;
import product.datalayer.ProductRepository;
import product.models.Product;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository repository;
    private final MyBeanVat myBeanVat;

    @Autowired
    public ProductServiceImpl(@Qualifier("productRepositoryInMemory") ProductRepository repository, @Qualifier("low") MyBeanVat myBeanVat ) {
        this.repository = repository;
        this.myBeanVat = myBeanVat;
    }

    @Override
    public double calculateTotalValue() {
        return repository.getAllProducts()
                .stream()
                .mapToDouble(p -> p.getPrice() * p.getInStock())
                .sum();

//        double total = 0.0;
//        for (Product p : repository.getAllProducts()) {
//            double linePrice = p.getPrice() * p.getInStock();
//            total += linePrice;
//        }
//        return total;
    }

    @Override
    public Collection<Product> getLowStockProducts(long threshold) {
        return repository.getAllProducts()
                .stream()
                .filter(p -> p.getInStock() < threshold)
                .collect(Collectors.toList());

//        List<Product> lowStockProducts = new ArrayList<>();
//        for (Product p : repository.getAllProducts()) {
//            if (p.getInStock() < threshold) {
//                lowStockProducts.add(p);
//            }
//        }
//        return lowStockProducts;
    }

    @Override
    public double getAveragePrice() {
        return repository.getAllProducts()
                .stream()
                .mapToDouble(p -> p.getPrice())
                .average()
                .orElse(0.0);
    }

    @Override
    public void adjustPriceByPercent(long id, double byPercent) {
        Product theProduct = repository.getProductById(id);
        if (theProduct == null) {
            return;
        }
        else {
            theProduct.adjustPriceByPercent(byPercent);
            repository.updateProduct(theProduct);
        }
    }

    @Override
    public void addTaxByPrice(long id, double taxByPrice) {
        Product theProduct = repository.getProductById(id);
        if (theProduct == null) {
            return;
        }
        else {
            theProduct.adjustPriceByPercent(taxByPrice);
            repository.updateProduct(theProduct);
        }


    }

// Does not compute correct.
    @Override
    public Collection<Product> addVat(){
        //List<Product> vat = new ArrayList<>();
        return repository.getAllProducts()
                .stream()
                .peek(p -> p.adjustPriceByMva(myBeanVat.getVat()))
                .collect(Collectors.toList());
    }

}
