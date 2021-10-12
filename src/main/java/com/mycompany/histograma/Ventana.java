/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.histograma;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author david
 */
public class Ventana extends javax.swing.JFrame {

    //Atributos
    private String nombreArchivo;
    private ArrayList<String> palabras_histograma;
    
    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        texto_archivo = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        texto_histograma = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        nombre_archivo = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        leer = new javax.swing.JButton();
        guardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.Y_AXIS));

        jPanel3.setLayout(new java.awt.BorderLayout());

        texto_archivo.setColumns(20);
        texto_archivo.setRows(5);
        texto_archivo.setEnabled(false);
        jScrollPane1.setViewportView(texto_archivo);

        jPanel3.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jLabel1.setText("Archivo leido");
        jPanel3.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel1.add(jPanel3);

        jPanel4.setLayout(new java.awt.BorderLayout());

        texto_histograma.setColumns(20);
        texto_histograma.setRows(5);
        texto_histograma.setEnabled(false);
        jScrollPane2.setViewportView(texto_histograma);

        jPanel4.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jLabel2.setText("Histograma");
        jPanel4.add(jLabel2, java.awt.BorderLayout.PAGE_START);

        jPanel1.add(jPanel4);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel5.setLayout(new java.awt.BorderLayout());

        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.Y_AXIS));

        nombre_archivo.setText("Nombre del archivo");
        jPanel2.add(nombre_archivo);

        jPanel5.add(jPanel2, java.awt.BorderLayout.CENTER);

        jPanel6.setLayout(new javax.swing.BoxLayout(jPanel6, javax.swing.BoxLayout.LINE_AXIS));

        leer.setText("Leer txt");
        leer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leerActionPerformed(evt);
            }
        });
        jPanel6.add(leer);

        guardar.setText("Guardar csv");
        jPanel6.add(guardar);

        jPanel5.add(jPanel6, java.awt.BorderLayout.EAST);

        getContentPane().add(jPanel5, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void leerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leerActionPerformed
        
        //Leemos el texto que haya en el cajetin de texto
        nombreArchivo = nombre_archivo.getText();
        
        //Leemos el archivo linea a linea con un BufferedReader
        try(BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            
            //Usamos el iterador para recorrer cada linea
            Iterator<String> it = br.lines().iterator();
            while(it.hasNext()) {
                String linea = it.next();
                texto_archivo.append(linea+"\n");
                
                //Creo un array de Strings con todas la palabras
                String[] palabras = linea.split("\\ |\\?|\\!|\\¡|\\¿|\\.|\\,|\\-|\\;|\\:|\\(|\\)|\\[|\\]|\\\n");
                for(String palabra : palabras) {
                    //Comprobamos que la palabra tenga mas de dos caracteres
                    if(palabra.length() > 2 ) {
                        
                    }
                }
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_leerActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton leer;
    private javax.swing.JTextField nombre_archivo;
    private javax.swing.JTextArea texto_archivo;
    private javax.swing.JTextArea texto_histograma;
    // End of variables declaration//GEN-END:variables
}
