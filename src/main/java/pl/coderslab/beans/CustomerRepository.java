package pl.coderslab.beans;

public interface CustomerRepository {
    void addCustomer(Customer customer);
    void deleteCustomer(Customer customer);
    void getCustomersList();

}
//1. Utwórz interfejs `CustomerRepository` zawierający metody:
//        * dodawanie klienta
//        * usuwanie klienta
//        * pobieranie listy klientów
//        2. Utwórz klasę `MemoryCustomerRepository` implementującą interfejs `CustomerRepository`.
//        3. Klasa powinna zapisywać dane do wewnętrznie zdefiniowanej listy obiektów `Customer` - skorzystaj z `ArrayList`.
//        4. Klasa ma zawierać pole typu `CustomerLogger`, wstrzyknij odpowiednią zależność.
//        5. Zmodyfikuj metody klasy  `MemoryCustomerRepository` dodając logowanie w każdej z metod. (wywołaj metodę `log()`).
//        6. W metodzie main pobierz ziarno repozytorium, utwórz użytkownika a następnie zapisz go używając metody z repozytorium.

