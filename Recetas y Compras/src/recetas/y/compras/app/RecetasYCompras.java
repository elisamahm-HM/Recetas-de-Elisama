/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recetas.y.compras.app;

import recetas.y.compras.persistencia.ConexionBD;

/**
 *
 * @author hmyme
 */
public class RecetasYCompras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            
            ConexionBD.conectar();
            
            System.out.println("---Te has conectado a la base de datos---");
            
            
            
        } catch (Exception e) {
            
            System.out.println("La conexion no se ha realizado "+ e.getMessage());
        }
        
        
    }
    
}
