package kata5.main.DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

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
        String sql = """
                     CREATE TABLE IF NOT EXISTS EMAIL (
                      Id integer PRIMARY KEY AUTOINCREMENT,
                      Mail text NOT NULL);
                     """;
        try (Connection conn = DBConnection.connect();
            Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("Tabla creada");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void insert(List<String> emails) {
        String sql = "INSERT INTO EMAIL(Mail) VALUES(?)";
        try (Connection conn = DBConnection.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            for (String email : emails) {
                pstmt.setString(1, email);
                pstmt.executeUpdate();
                System.out.println(email + " ha sido añadido...");
            }
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
