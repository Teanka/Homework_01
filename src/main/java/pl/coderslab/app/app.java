package pl.coderslab.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.coderslab.beans.Customer;
import pl.coderslab.beans.CustomerLogger;
import pl.coderslab.beans.MemoryCustomerRepository;
import pl.coderslab.beans.SimpleCustomerLogger;
import pl.coderslab.config.AppConfig;

public class app {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        CustomerLogger logger = context.getBean(SimpleCustomerLogger.class);
        logger.log();
        MemoryCustomerRepository memoRepository = context.getBean(MemoryCustomerRepository.class);
        Customer customer = new Customer(1, "Jasio", "Kowalski");
        memoRepository.addCustomer(customer);
    }
//    5. `SimpleCustomerLoggerImpl` - powinno być ziarnem zarządzanym przez Springa.
//            5. Utwórz initializer aplikacji Spring.
//            6. Utwórz obiekt kontekstu na podstawie konfiguracji.
//            7. Pobierz od kontekstu ziarno a następnie wywołaj na nim metodę log.
}
