package product;


// Pojo - creates a bean that keeps the VAT.
public class MyBeanVat {

    private double myVat ;


    public double getVat() {
        return myVat;
    }

    public double setVat(double myVat) {
        return this.myVat = myVat;

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MyBean{");
        sb.append("myVAT=").append(myVat);
        sb.append('}');
        return sb.toString();
    }
}
