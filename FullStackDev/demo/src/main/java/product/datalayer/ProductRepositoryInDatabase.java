package product.datalayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import product.datalayer.ProductRepository;
import product.models.Product;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.Collection;
import java.util.List;

@Repository
public class ProductRepositoryInDatabase implements ProductRepository {

    // This is the "EntityManager" equivalent of @Autowired.
    // it uses the EntityManagerFactory bean implicitly to create an EntityManager object for us.

    @PersistenceContext
    private EntityManager entityManager;


    public long getProductCount() {
        String jpql = "select count(p) from Product p";
        TypedQuery<Long> query = entityManager.createQuery(jpql, Long.class);
        return query.getSingleResult();
    }

    public Product getProduct(long productId) {
            return entityManager.find(Product.class, productId);
    }

    public List<Product> getProducts() {
            String jpql = "select p from Product p";
            TypedQuery<Product> query = entityManager.createQuery(jpql, Product.class);
            return query.getResultList();
    }


    @Transactional
    public Product insertProduct(Product p) {
        entityManager.persist(p);
        return p;
    }

    @Override //just to keep interface consistent
    public boolean updateProduct(Product product) {
        return false;
    }

    @Transactional
    public void updateProduct2(Product p) {
        Product entity = entityManager.find(Product.class, p.getId());
        entity.setDescription(p.getDescription());
        entity.setPrice(p.getPrice());
        entity.setInStock(p.getInStock());
    }

    @Transactional
    public boolean deleteProduct(long productId) {
        Product p = entityManager.find(Product.class, productId);
        entityManager.remove(p);
        return true;
    }

    @Override
    public Collection<Product> getAllProducts() {
        return null;
    }

    @Override
    public Product getProductById(long id) {
        return null;
    }

}

