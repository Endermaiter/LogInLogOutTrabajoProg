/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodos_sql;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Endermaiter
 */
public class ConexionBD {
    public static String url = "jdbc:mysql://localhost/trabajoprog";
    public static String usuario ="root";
    public static String contraseña ="marcosydavid1.";
    public static String clase ="com.mysql.jdbc.Driver";
    
    public static Connection conectar(){
        Connection conexion = null;
        
        try {
            Class.forName(clase);
            conexion = (Connection) DriverManager.getConnection(url,usuario,contraseña);
            System.out.println("Conexion Establecda");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex);
              
        }
        return conexion;
    }
}
