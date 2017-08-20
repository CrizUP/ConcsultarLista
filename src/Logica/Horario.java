/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

import java.sql.Time;

/**
 * Descripcion
 * @author Cristhian Ubaldo Promotor
 * @author Expression compa is undefined on line 13, column 14 in Templates/Classes/Class.java.
 * @version fecha 
 */
public class Horario {

    private String diaSemana;
    private Time horaInicio;
    private Time horaFin;

    public Horario() {
    }

    public Horario(String diaSemana, Time horaInicio, Time horaFin) {
        this.diaSemana = diaSemana;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public Time getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Time horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Time getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Time horaFin) {
        this.horaFin = horaFin;
    }
    
    
}
