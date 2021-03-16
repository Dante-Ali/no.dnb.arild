package product;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigSimple {

    @Bean("low")
    public MyBeanVat VatLow() {
        MyBeanVat b = new MyBeanVat();
        b.setVat(25);
        return b;
    }

    @Bean("med")
    public MyBeanVat VatMed() {
        MyBeanVat b = new MyBeanVat();
        b.setVat(27);
        return b;
    }

    @Bean("high")
    public MyBeanVat VatHigh() {
        MyBeanVat b = new MyBeanVat();
        b.setVat(50);
        return b;
    }
}
