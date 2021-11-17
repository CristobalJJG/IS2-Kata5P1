package Ejercicios_Pre_Kata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class Ejercicio_5 {
    private Connection connect() {
        // Cadena de conexión SQLite
        String url = "jdbc:sqlite:mail.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
    
    // Método para insertar datos en la tabla direcc_email
    public void insert(String email) {
        String sql = "INSERT INTO direcc_email(direccion) VALUES(?)";
        try (Connection conn = this.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, email);
            pstmt.executeUpdate();
            System.out.println(email + " ha sido añadido...");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
