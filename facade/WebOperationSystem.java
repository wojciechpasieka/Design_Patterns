package facade;

public interface WebOperationSystem {

    boolean authorize(String userName, String password);

    void makeTransfer(int amount, long destAccountNumber);

    boolean logout();

}
