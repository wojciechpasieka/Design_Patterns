package adapter;

import java.time.LocalDate;

public class APIAdapter implements LibraryApi {


    private LibraryApiv2Implementation libraryApiv2Implementation;
    private User user;

    public APIAdapter(LibraryApiv2Implementation libraryApiv2Implementation, User user) {
        this.libraryApiv2Implementation = libraryApiv2Implementation;
        this.user = user;
    }

    @Override
    public boolean isAvailable(String bookTitle) {
        System.out.println("Api v2 zostało wywołane");
        int x = libraryApiv2Implementation.numberOfAvialableCopies(bookTitle);
        return x > 0;
    }

    @Override
    public boolean reserve(String bookTitle, String pesel) {
        if (isAvailable(bookTitle)) {
            return libraryApiv2Implementation.reserve(bookTitle, user.getFirstName(), user.getLastName(), user.getDateOfBirth());
        }
        return false;
    }
}
