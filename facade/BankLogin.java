package facade;

public class BankLogin {

    public boolean identify(long cardNumber, int pin){
        if(cardNumber == 123456 && pin == 1234){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean authorize(String userName, String password){
        if(userName.equals("admin") && password.equals("admin")){
            System.out.println("Zalogowano poprawnie");
        }
        System.out.println("Niepoprawne dane");
        return false;
    }
    public boolean logOut(){
        System.out.println("Wylogowano");
        return true;
    }



    public void identifyViaMobile(long cardNumber, int pin){
    }

}
