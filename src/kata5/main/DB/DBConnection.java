package kata5.main.DB;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class DBConnection {
    
    protected static Connection connect() {
        // Cadena de conexión SQLite
        String url = "jdbc:sqlite:./Kata5P1/KATA5.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
    
    protected static void disconect(Connection conn){
        try {
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
