package product.models;


// This is just a POJO, we create new instances of this class "just like normal".
// This will evolve into an "entity" class (ORM, object-relational mapping - JPA).

import javax.persistence.*;

// new Product(-1, "Sian", 2.2E6)
@Entity
@Table(name="PRODUCT")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id = -1;
    private String description;
    private double price;
    @Column(name = "instock")
    private long inStock;

    public Product() {}

    public Product(String description, double price, long inStock) {
        this(-1, description, price, inStock);
    }

    public Product(long id, String description, double price, long inStock) {
        this.id = id;
        this.description = description;
        this.price = price;
        this.inStock = inStock;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public long getInStock() {
        return inStock;
    }

    public void setInStock(long inStock) {
        this.inStock = inStock;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Product{");
        sb.append("id=").append(id);
        sb.append(", description='").append(description).append('\'');
        sb.append(", price=").append(price);
        sb.append(", inStock=").append(inStock);
        sb.append('}');
        return sb.toString();
    }

    public void adjustPriceByPercent(double percent) {
        price *= 1 + percent/100;
    }
// just in case
    public void adjustPriceByMva(double mva){
        price *=1 + mva/100;
    }
}