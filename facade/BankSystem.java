package facade;

public class BankSystem {

    public float checkAmountOnAccount(long cardNumber){
        if(cardNumber == 12345){
            return 1000f;
        }else {
            return 0f;
        }
    }

    public void withdawCash(int amount){
        System.out.println("Z konta wypłacono " + amount);
    }

    public void activateCard(long cardNumber){
        System.out.println("Aktywowano kartę " + cardNumber);
    }

    public void payInMobile(){
    }

    public void makeTransfer(int amount, long destAccountNumber){
        System.out.println("Wykonano przelew na kwotę: "+amount + " na numer konta" + destAccountNumber);
    }

}
