import java.sql.*;

public class Demo {
    private static Connection connection;

    public static void main(String[] args) throws SQLException {
        System.out.println("Hallo user!");
        try {
            openDatabaseconnection();
        } finally {
            closeDatabaseConnection();
        }
    }

    private static void openDatabaseconnection() throws SQLException {
        System.out.println("Connection to the database...");

        // String sql = "select * from products where product_name = 'Hemd'";
        String sql = " create table if not exists USERS (id int primary key, name varchar (255) not null);" +
                "truncate table USERS; " +
                "insert into USERS (id,name) values ('1','Marco'); " +
                "insert into USERS (id,name) values ('2','Lisa');";
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String username = "postgres";
        String password = "password";

        connection = DriverManager.getConnection(url, username, password);

        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(sql);
        rs.next();
        //String name = rs.getString(6);
        //System.out.println("Output is: " + name);
        System.out.println("Connection valid: " + connection.isValid(5));
    }


    private static void closeDatabaseConnection() throws SQLException {
        System.out.println("Closing database connection...");
        connection.close();
        System.out.println("Connection valid: " + connection.isValid(5));
    }

}
