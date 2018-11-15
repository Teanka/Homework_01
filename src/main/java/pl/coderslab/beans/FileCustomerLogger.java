package pl.coderslab.beans;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;

public class FileCustomerLogger implements CustomerLogger{
    @Override
    public void log() {
        LocalDateTime now = LocalDateTime.now();
        Path path = Paths.get("/fileLogger.txt");
        if(!Files.exists(path)){
            try {
                Files.createFile(path);
            } catch (IOException e) {
                System.out.println("Problem z zapisem do pliku.");
            }
        }
        System.out.println(now + " : Customer operation");
    }

//    1. Utwórz implementację interfejsu `CustomerLogger` o nazwie `FileCustomerLogger`.
//            2. Klasa ma logować zmiany na klientach do pliku.
//3. Dodaj w klasie właściwość `String` o nazwie `filename`, zmodyfikuj ziarno tak aby wstrzyknąć właściwość
//    prostą z nazwą pliku logu.// poprzez @ Value(")
//4. Zmodyfikuj definicje wstrzykiwania tak aby repozytorium korzystało z nowego loggera.
//            5. Jeżeli korzystasz z automatycznego skanowania komponentów użyj w tym celu adnotacji `@Primary`.
}
