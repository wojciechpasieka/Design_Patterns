package singleton;

public class DbConnection {

    private String databaseName;

    private static DbConnection dbConnection;

    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    private DbConnection() {

    }

    public static DbConnection getInstance(){
        if(dbConnection == null){
            dbConnection = new DbConnection();
        }
        return dbConnection;
    }
}
