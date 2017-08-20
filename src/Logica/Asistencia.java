/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

import java.util.Date;
import java.sql.Time;
import java.util.ArrayList;

/**
 * Descripcion
 * @author Cristhian Ubaldo Promotor
 * @author Expression compa is undefined on line 13, column 14 in Templates/Classes/Class.java.
 * @version fecha 
 */
public class Asistencia {
    private Time horaLlegada;
    private Date fecha;
    private Alumno alumno;

    public Asistencia() {
        this.alumno = new Alumno();
    }

    public Asistencia(Time horaLlegada, Date fecha, Alumno alumno) {
        this.horaLlegada = horaLlegada;
        this.fecha = fecha;
        this.alumno = alumno;
    }

    public Time getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(Time horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Alumno getAlumnos() {
        return alumno;
    }

    public void setAlumnos(Alumno alumno) {
        this.alumno = alumno;
    }
       
    
}
