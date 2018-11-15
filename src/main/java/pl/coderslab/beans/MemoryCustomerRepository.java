package pl.coderslab.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MemoryCustomerRepository implements CustomerRepository {

    private List<Customer> customersList;
    private CustomerLogger customerLogger;

    @Autowired
    public MemoryCustomerRepository(List<Customer> customersList, CustomerLogger customerLogger) {
        this.customersList = new ArrayList<>();
        this.customerLogger = customerLogger;
    }

    @Override
    public void addCustomer(Customer customer) {
        customersList.add(customer);
        customerLogger.log();
    }

    @Override
    public void deleteCustomer(Customer customer) {
        for(Customer cust: customersList){
            if(cust.getId() == customer.getId()){
                customersList.remove(cust);
            }
        }
        customerLogger.log();
    }

    @Override
    public void getCustomersList() {
        customerLogger.log();
    }

//    2. Utwórz klasę `MemoryCustomerRepository` implementującą interfejs `CustomerRepository`.
//        3. Klasa powinna zapisywać dane do wewnętrznie zdefiniowanej listy obiektów `Customer` - skorzystaj z `ArrayList`.
//        4. Klasa ma zawierać pole typu `CustomerLogger`, wstrzyknij odpowiednią zależność.
//        5. Zmodyfikuj metody klasy  `MemoryCustomerRepository` dodając logowanie w każdej z metod. (wywołaj metodę `log()`).
//        6. W metodzie main pobierz ziarno repozytorium, utwórz użytkownika a następnie zapisz go używając metody z repozytorium.
}
