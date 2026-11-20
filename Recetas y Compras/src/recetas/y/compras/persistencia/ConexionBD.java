/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recetas.y.compras.persistencia;
import java.sql.*;
/**
 *
 * @author hmyme
 */
public class ConexionBD {
    
    private static final String URL = "jdbc:mysql://localhost:3306/despensa_elisama";
    private static final String USUARIO = "root" ;
    private static final String CLAVE = "";
    
    public static Connection conectar() throws SQLException{
        
        return DriverManager.getConnection(URL, USUARIO, CLAVE);
        
        
    }
}
