package singleton;

public class main {

    public static void main(String[] args) {

        DbConnection dbConnection = DbConnection.getInstance();
        DbConnection dbConnection1 = DbConnection.getInstance();

        dbConnection1.setDatabaseName("Fajna nazwa");
        System.out.println(dbConnection.getDatabaseName());
    }
}
