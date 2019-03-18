package adapter;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        User user = new User("Jan", "Kowal", LocalDate.of(1993,12,12), "123123123");


        LibraryApiv2Implementation libraryAPIv2 = new LibraryApiv2Implementation();
        APIAdapter apiAdapter = new APIAdapter(libraryAPIv2, user);

        BookConnector connector = new BookConnector(user,apiAdapter);
        connector.checkAviability("Harry Potter i Zakon Feniksa");

    }
}
