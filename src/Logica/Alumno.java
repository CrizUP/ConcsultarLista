/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

/**
 * Descripcion
 * @author Cristhian Ubaldo Promotor
 * @author Expression compa is undefined on line 13, column 14 in Templates/Classes/Class.java.
 * @version fecha 
 */
public class Alumno {

    private String nombre;
    private String apellidos;
    private String matricula;

    public Alumno() {
    }
    
    public Alumno(String nombre, String apellidos, String matricula) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    
}
