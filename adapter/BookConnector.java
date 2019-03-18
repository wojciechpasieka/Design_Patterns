package adapter;

public class BookConnector {

    private User user;
    private LibraryApi libraryApi;

    public BookConnector(User user, LibraryApi libraryApi) {
        this.user = user;
        this.libraryApi = libraryApi;
    }

    public boolean checkAviability (String bookTitle){
        return libraryApi.isAvailable(bookTitle);
    }
}
