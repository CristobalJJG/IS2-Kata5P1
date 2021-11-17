package kata5.main.DB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBQuerys {
    
    public void selectAll(){
        String sql = "SELECT * FROM PEOPLE";
        try (Connection conn = DBConnection.connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)){
            // Bucle sobre el conjunto de registros.
            while (rs.next()) {
                System.out.println(rs.getInt("id") + "\t\t" +
                                rs.getString("Name") + "\t\t" +
                                rs.getString("Apellidos") + "\t\t" +
                                rs.getString("Departamento") + "\t\t");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
