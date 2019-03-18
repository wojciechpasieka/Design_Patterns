package facade;

public class Main {

    public static void main(String[] args) {

        WebOperations webOperations = new WebOperations();

        webOperations.authorize("Wojciech", "jedendwatrzy");
        webOperations.makeTransfer(333, 23452);
        webOperations.logout();

    }
}
