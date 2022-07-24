
package principal;
import Vistas.*;
import Modelo.*;

public class Main {


    public static void main(String[] args) {
        //1. Creamos la instancia de la vista login 
        Login login = new Login();
        //El método setVisible hace visible la ventana
        login.setVisible(true);
        //2. Crear instancia de la clase conexion
        Conexion conexion = new Conexion();
        conexion.getConnection();
    }
    
}
