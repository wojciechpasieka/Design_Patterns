package facade;

public class WebOperations implements WebOperationSystem {

    private BankSystem bankSystem = new BankSystem();
    private BankLogin bankLogin = new BankLogin();


    public boolean authorize(String userName, String password) {
        return bankLogin.authorize(userName, password);
    }

    public void makeTransfer(int amount, long destAccountNumber) {
        bankSystem.makeTransfer(amount,destAccountNumber);
    }

    public boolean logout() {
        return bankLogin.logOut();
    }
}
