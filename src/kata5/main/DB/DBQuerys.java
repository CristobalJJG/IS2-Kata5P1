package kata5.main.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBQuerys {
    
    public void selectAll(){
        String sql = "SELECT * FROM PEOPLE";
        try (Connection conn = DBConnection.connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)){
            while (rs.next()) {
                System.out.println(rs.getInt("Id") + "\t\t" +
                                rs.getString("Name") + "\t\t" +
                                rs.getString("Apellidos") + "\t\t" +
                                rs.getString("Departamento") + "\t\t");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void createTable(){        
        String sql = "CREATE TABLE IF NOT EXISTS EMAIL (\n"
                    + " Id integer PRIMARY KEY AUTOINCREMENT,\n"
                    + " Mail text NOT NULL);";
        try (Connection conn = DBConnection.connect();
            Statement stmt = conn.createStatement()) {
            // Se crea la nueva tabla
            stmt.execute(sql);
            System.out.println("Tabla creada");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
