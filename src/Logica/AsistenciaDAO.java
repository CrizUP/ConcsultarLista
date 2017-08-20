/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

import Datos.Conexion;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Descripcion
 * @author Cristhian Ubaldo Promotor
 */
public class AsistenciaDAO implements IAsistenciaDAO{

    
    public List<Asistencia> obtenerAsistencia(Date fecha, Materia materia) {
        
        List<Asistencia> asistenciaGeneral = new ArrayList();
        Conexion conexion = new Conexion();
        PreparedStatement sentencia = null;
        ResultSet resultado = null;
       
        
        conexion.obtenerConexion();
        String consultaSQL = "Select Alumno.nombre, alumno.apellidos, alumno.matricula,horallegada,fechaClase"
                + " from alumno, asiste, materia where matricula = matriculaAlumno and materia.nrc = asiste.nrc "
                + "and materia.nrc =?  and fechaClase=?";
        
        try{
            
            sentencia = conexion.obtenerConexion().prepareStatement(consultaSQL);           
            sentencia.setString(1,materia.getNrc());
            sentencia.setDate(2, fecha);
            resultado = sentencia.executeQuery();
            
            while(resultado.next()){
                
                Asistencia asistenciaIndividual = new Asistencia();                
                asistenciaIndividual.getAlumnos().setNombre(resultado.getString(1));
                asistenciaIndividual.getAlumnos().setApellidos(resultado.getString(2));
                asistenciaIndividual.getAlumnos().setMatricula(resultado.getString(3));
                asistenciaIndividual.setHoraLlegada(resultado.getTime(4));
                asistenciaIndividual.setFecha(resultado.getDate(5));
                
                asistenciaGeneral.add(asistenciaIndividual);
            }
            
            
            
        }catch(SQLException ex){
      
        }finally{
            conexion.cerrarConexion();
        }
        return asistenciaGeneral;
    }

    
}
