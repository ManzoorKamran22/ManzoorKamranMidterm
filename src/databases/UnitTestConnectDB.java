package databases;
import org.testng.Assert;

public class UnitTestConnectDB {
    public static void main(String[] args) throws Exception{
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();

        Assert.assertEquals(connectToSqlDB.readDataBase("studentInfo","name"),
                            connectToSqlDB.readDataBase("studentInfo","name"));

    }
}
