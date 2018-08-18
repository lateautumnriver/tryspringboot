package jp.lateautumnriver.tryspringboot.payroll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

    private final EmployeeRepository repository;

    @Autowired
    public DatabaseLoader(EmployeeRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception {
        this.repository.save(new Employee("Frodo", "Baggins", "ring bearer"));
        this.repository.save(new Employee("Scott", "Abraham", "garbage cleaner"));
        this.repository.save(new Employee("James", "Dacotta", "cooker"));
        this.repository.save(new Employee("Peter", "Harmann", "trainer"));
        this.repository.save(new Employee("Adams", "Conwell", "director"));
    }
}
