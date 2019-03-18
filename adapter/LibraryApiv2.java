package adapter;

import java.time.LocalDate;

public interface LibraryApiv2 {

    int numberOfAvialableCopies (String bookTitle);
    boolean reserve (String bookTitle, String firstName, String lastName, LocalDate dateOfBirth);
}
