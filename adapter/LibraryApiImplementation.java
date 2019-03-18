package adapter;

public class LibraryApiImplementation implements LibraryApi {

    @Override
    public boolean isAvailable(String bookTitle) {
        System.out.println("Książka jest dostępna");
        return true;
    }

    @Override
    public boolean reserve(String bookTitle, String pesel) {
        System.out.println("Książka została zarezerwowana");
        return true;
    }
}
