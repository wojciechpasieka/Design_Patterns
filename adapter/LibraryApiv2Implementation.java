package adapter;

import java.time.LocalDate;

public class LibraryApiv2Implementation implements LibraryApiv2 {

    @Override
    public int numberOfAvialableCopies(String bookTitle) {
        System.out.println("Ilość dostępnych sztuk tej książki to: ");
        return 1;
    }

    @Override
    public boolean reserve(String bookTitle, String firstName, String lastName, LocalDate dateOfBirth) {
        System.out.println("Książka została zarezerwowana");
        return true;
    }
}
