package Ejercicios_Pre_Kata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Ejercicio_1 {
    
    protected static void connect() {
        Connection conn = null;
        try {
                // parámetros de la BD
                String url = "jdbc:sqlite:Cosa.db";
                // creamos una conexión a la BD
                conn = DriverManager.getConnection(url);
                System.out.println("Connexión a SQLite establecida");
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
