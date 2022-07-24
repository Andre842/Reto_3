
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
    //1. Crear instancia de la clase connection
    Connection connection;
    //Atributos 
    String driver = "com.mysql.cj.jdbc.Driver";
    String cadenaConexion = "jdbc:mysql://localhost:3306/reto_3";
    String usuario = "root";
    String contrasena = "";
    
    //2. Añadir el constructor sin argumentos de la clase 

    public Conexion() {
        //3. Intentar conectar con la base de datos
        try{
            Class.forName(driver);
            connection = DriverManager.getConnection(cadenaConexion, usuario, contrasena);
            //4. Verificamos si la conexion devuleve algo
            if(connection != null){
                System.out.println("Conexión exitosa con la base de datos");
            }  
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("No se pudo establecer conexión con la base de datos");
        } 
    }
    //5. Crear función que retorna la clase connection
    public Connection getConnection(){
        return connection;
    }
}
