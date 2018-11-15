package pl.coderslab.beans;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class SimpleCustomerLogger implements CustomerLogger {

    @Autowired
    public SimpleCustomerLogger() {
    }

    public void log() {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now + " : Customer operation");

    }
//        1. Utwórz interfejs `CustomerLogger` zawierający metodę ``;
//3. Utwórz klasę `SimpleCustomerLogger` implementującą interfejs `CustomerLogger`.
//            4. W ciele metody `log` dodaj wyświetlanie na konsoli napisu `<Aktualna data i godzina>: Customer operation`;
//5. `SimpleCustomerLoggerImpl` - powinno być ziarnem zarządzanym przez Springa.
//            5. Utwórz initializer aplikacji Spring.
//            6. Utwórz obiekt kontekstu na podstawie konfiguracji.
//            7. Pobierz od kontekstu ziarno a następnie wywołaj na nim metodę log.
}
