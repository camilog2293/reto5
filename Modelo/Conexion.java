package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
    //1. Crear la instancia de la clase Connection del JAR JDBC
    Connection connection;
    String driver = "com.mysql.cj.jdbc.Driver";
    String cadenaConexion = "jdbc:mysql://localhost:3306/";
    String nombreBaseDatos = "reto1_g56_dbpro";
    String usuario = "root";
    String contrasena = "";
    
    //2. Añadimos el constructor de la clase sin argumentos
    public Conexion() {
        try {
            //4. Buscamos la clase dentro JAR que coincide con este nombre com.mysql.cj.jdbc.Driver
            Class.forName(driver);
            connection= DriverManager.getConnection(cadenaConexion + nombreBaseDatos, usuario, contrasena);
            if(connection != null){
                System.out.println("Conexión exitosa");
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Conexión fallida");
        }
    }
    
    //6. Creamos una función que retorn la Connection de la clase
    public Connection getConnection(){
        return connection;
    }
    
}
