/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

import Datos.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * Descripcion
 * @author Cristhian Ubaldo Promotor
 * @author Expression compa is undefined on line 13, column 14 in Templates/Classes/Class.java.
 * @version fecha 
 */
public class AlumnoDAO implements IAlumnoDAO {

    
    public Alumno obtenerAlumno(Materia materia) {
        
        Alumno alumno = new Alumno();
        Conexion conexion = new Conexion();
        PreparedStatement sentencia = null;
        ResultSet resultado = null;

        conexion.obtenerConexion();
        String consultaSQL = "Select Alumno.nombre, alumno.apellidos, alumno.matricula,horallegada,fecha,nombreMateria from alumno, asiste, matricula "
                + "where matricula = matriculaAlumno and materia.nrc = asiste.nrc and materia.nrc = ? and fecha=?";
        
       /* try{
            
            sentencia = conexion.obtenerConexion().prepareStatement(consultaSQL);           
            sentencia.setString(????);
            resultado = sentencia.executeQuery();
            
        }catch(){
      
        }*/
        return alumno;
    }
    

}
