package adapter;

public interface LibraryApi {

    boolean isAvailable(String bookTitle);
    boolean reserve(String bookTitle, String pesel);
}
