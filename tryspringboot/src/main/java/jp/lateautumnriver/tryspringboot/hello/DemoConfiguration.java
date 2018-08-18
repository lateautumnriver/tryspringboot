package jp.lateautumnriver.tryspringboot.hello;

import jp.lateautumnriver.tryspringboot.TryspringbootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoConfiguration {

    private static final Logger log = LoggerFactory.getLogger(TryspringbootApplication.class);

    @Bean
    public CommandLineRunner showDemo(ConfigurableApplicationContext ctx) {
        return (args) -> {
            CustomerRepository repository = ctx.getBean(CustomerRepository.class);
            repository.save(new Customer("Jack", "Bauer"));
            repository.save(new Customer("Chloe", "O'Brian"));
            repository.save(new Customer("Kim", "Bauer"));

            log.info("Customers found with findAll():");
            for (Customer customer: repository.findAll()) {
                log.info(customer.toString());
            }
            log.info("");

            repository.findById(1L).ifPresent(customer -> {
                log.info("customer(1L): " + customer.toString());
                log.info("");
            });

            log.info("Customer found with findByLastName('Bauer'):");
            repository.findByLastName("Bauer").forEach(bauer -> {
                log.info(bauer.toString());
            });
            log.info("");
        };
    }
}
