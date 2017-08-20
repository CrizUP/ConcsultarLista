/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Logica.Asistencia;
import Logica.AsistenciaDAO;
import Logica.Materia;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Cristhian Ubaldo Promotor
 */
public class ConsultarAsistencias extends javax.swing.JFrame {

    /**
     * Creates new form ConsultarAsistencias
     */
    public ConsultarAsistencias() {
        
        initComponents();
        System.out.println(cuadroFecha.getDateFormatString());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cuadroFecha = new com.toedter.calendar.JDateChooser();
        cuadroVisualizacion = new javax.swing.JScrollPane();
        areaVizualizacion = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cuadroFecha.setDateFormatString("yyyy/MM/d");
        cuadroFecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cuadroFechaMouseClicked(evt);
            }
        });

        areaVizualizacion.setColumns(20);
        areaVizualizacion.setRows(5);
        cuadroVisualizacion.setViewportView(areaVizualizacion);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(cuadroVisualizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(cuadroFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(jButton1)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cuadroFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(32, 32, 32)
                .addComponent(cuadroVisualizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cuadroFechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cuadroFechaMouseClicked
        
    }//GEN-LAST:event_cuadroFechaMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        Materia materia =new Materia("Tecnologias para la construción de software", "13246", null);
        List<Asistencia> asistenciaGeneral =new ArrayList();
        AsistenciaDAO asistencia = new AsistenciaDAO();
        
        
        
        Calendar fechaGeneral = cuadroFecha.getCalendar();
        String fechaString = fechaGeneral.get(Calendar.YEAR)+ "-" + (fechaGeneral.get(Calendar.MONTH) + 1) + "-" + fechaGeneral.get(Calendar.DATE);
        System.out.println(fechaString);
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        Date fecha =null;
        try{
            fecha = formato.parse(fechaString);
        } catch (ParseException ex) {
            Logger.getLogger(ConsultarAsistencias.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        areaVizualizacion.setText("");
        asistenciaGeneral = asistencia.obtenerAsistencia(new java.sql.Date(fecha.getTime()), materia);
        
        for(int i = 0; i < asistenciaGeneral.size(); i++){
            areaVizualizacion.append(asistenciaGeneral.get(i).getAlumnos().getNombre() + "\n");

        }
    }//GEN-LAST:event_jButton1ActionPerformed
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConsultarAsistencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarAsistencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarAsistencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarAsistencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultarAsistencias().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaVizualizacion;
    private com.toedter.calendar.JDateChooser cuadroFecha;
    private javax.swing.JScrollPane cuadroVisualizacion;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
