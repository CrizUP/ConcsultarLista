/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Descripcion
 * @author Cristhian Ubaldo Promotor
 */
public class Conexion {

    private Connection conexionBD;

    public Conexion() {
    }


    public Connection obtenerConexion(){        
                
        try{
            
            Class.forName("com.mysql.jdbc.Driver").newInstance();

        }catch(ClassNotFoundException | InstantiationException | IllegalAccessException driverExcep){
            
           driverExcep.printStackTrace();
        }
        
        try{
            
            conexionBD = DriverManager.getConnection("jdbc:mysql://127.0.0.1/registrodeasistencia?user=juanc&password=primeraPractica");
            
     
            
        }catch(SQLException conexionExcep){
            
            conexionExcep.printStackTrace();
                        
        }
            
        return conexionBD;
    }
    
    /**
     * Sirve para cerrar las conexiones realizadas, evitando que se desperdicien recursos,
     * debe ir despues de haber llamado al método obtenerConexion
     * @return Retorna un MensajeBandera que nos da información mas presisa
     */
    public boolean cerrarConexion (){
        
        boolean confirmacion = false;
        
        try{
            
            conexionBD.close();
            confirmacion = true;      
        }  catch (SQLException errorCerrar) {
            
            errorCerrar.printStackTrace();
                      
        }
        
        return confirmacion;
    }
}
