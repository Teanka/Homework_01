package pl.coderslab.beans;

import org.springframework.stereotype.Component;

@Component
public class Customer {
    private int id;
    private String firstName;
    private String lastName;

    public Customer() {
    }

    public Customer(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //    #### Zadanie 1
//
//            1. Stwórz klasę `Customer`, która ma spełniać następujące wymogi:
//
//    Klasa ma mieć prywatne atrybuty:
//            * `id` - atrybut ten powinien trzymać numer identyfikacyjny,
// * `firstName` - atrybut określający imię klienta,
// * `lastName` - atrybut określający nazwisko klienta,
//
//2. Ma posiadać konstruktor przyjmujący id, imię, nazwisko, pseudonim. Getery i settery dla pól, oraz bezparametrowy konstruktor.

}
