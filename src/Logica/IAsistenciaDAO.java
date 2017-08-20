/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.sql.Date;
import java.util.List;

/**
 *
 * @author Cristhian Ubaldo Promotor
 */
public interface IAsistenciaDAO {
    public List<Asistencia> obtenerAsistencia(Date fecha, Materia materia);
    
}
