package Logica;

import java.util.ArrayList;


/**
 * Descripcion
 * @author Cristhian Ubaldo Promotor
 *  
 */
public class Materia {

    private String nombreMateria;
    private String nrc;
    private ArrayList<Horario> horarioSemanal;

    public Materia() {
    }

    public Materia(String nombreMateria, String nrc, ArrayList<Horario> horarioSemanal) {
        this.nombreMateria = nombreMateria;
        this.nrc = nrc;
        this.horarioSemanal = horarioSemanal;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public String getNrc() {
        return nrc;
    }

    public void setNrc(String nrc) {
        this.nrc = nrc;
    }

    public ArrayList<Horario> getHorarioSemanal() {
        return horarioSemanal;
    }

    public void setHorarioSemanal(ArrayList<Horario> horarioSemanal) {
        this.horarioSemanal = horarioSemanal;
    }
    
    
}
