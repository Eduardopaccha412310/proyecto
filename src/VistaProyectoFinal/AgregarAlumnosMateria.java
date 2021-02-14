/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistaProyectoFinal;

import Controlador.CtrlAlumno;
import Controlador.CtrlTxt;
import Controlador.ListaAlum;
import Controlador.ListaNomArchivos;
import VistaProyectoFinal.Tablas.TablaEstudiantes;
import javax.swing.JOptionPane;

/**
 *
 * @author Paccha
 */
public class AgregarAlumnosMateria extends javax.swing.JFrame {

    ListaAlum L = new ListaAlum();
    TablaEstudiantes T = new TablaEstudiantes();
    ListaNomArchivos Li = new ListaNomArchivos();
    public AgregarAlumnosMateria() {
        initComponents();

        jbtCrearNuevaLista.setVisible(false);
        this.setSize(476, 766);
    }   
    private void cargarTabla() {
        T.setList(L);
        jTableAlumnos.setModel(T);
        jTableAlumnos.updateUI();
    }
    
    private void LimpiarCampos(){
        txtEstudiante.setText("");
        txtApellido.setText("");
        txtCorreo.setText("");
        txtTelefono.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMateria = new javax.swing.JTextField();
        txtGrado = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAlumnos = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtEstudiante = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        AgregarLista = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Cargartxt = new javax.swing.JButton();
        Guardartxt = new javax.swing.JButton();
        jbtCrearNuevaLista = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Nombre Materia: ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 50, 97, 16);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(36, 83, 0, 0);

        jLabel3.setText("Nombre grado: ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 90, 100, 16);
        getContentPane().add(txtMateria);
        txtMateria.setBounds(120, 50, 120, 24);
        getContentPane().add(txtGrado);
        txtGrado.setBounds(120, 90, 120, 24);

        jLabel4.setText("Agregar Estudiante:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 160, 112, 16);

        jTableAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableAlumnos);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 420, 440, 177);

        jLabel5.setText("Telefono:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 290, 60, 10);
        getContentPane().add(txtEstudiante);
        txtEstudiante.setBounds(130, 190, 140, 24);

        jLabel6.setText("Apellido Estudiante:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 220, 111, 16);
        getContentPane().add(txtTelefono);
        txtTelefono.setBounds(130, 280, 140, 30);

        jLabel7.setText("Nombre Estudiante:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 190, 111, 16);
        getContentPane().add(txtApellido);
        txtApellido.setBounds(130, 220, 140, 24);

        jLabel8.setText("Correo:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 250, 42, 16);
        getContentPane().add(txtCorreo);
        txtCorreo.setBounds(130, 250, 140, 24);

        jLabel9.setText("Lista de estudiantes : ");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(50, 380, 200, 16);

        AgregarLista.setText("Agregar a la lista");
        AgregarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarListaActionPerformed(evt);
            }
        });
        getContentPane().add(AgregarLista);
        AgregarLista.setBounds(10, 330, 180, 32);

        jLabel10.setText("Ejem: TerceroA");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(250, 90, 90, 30);

        jLabel11.setText("    Registro de Alumnos en su respetiva materia");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel11);
        jLabel11.setBounds(110, 10, 280, 30);

        Cargartxt.setText("Cargar");
        Cargartxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargartxtActionPerformed(evt);
            }
        });
        getContentPane().add(Cargartxt);
        Cargartxt.setBounds(20, 640, 77, 32);

        Guardartxt.setText("Guadar ");
        Guardartxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardartxtActionPerformed(evt);
            }
        });
        getContentPane().add(Guardartxt);
        Guardartxt.setBounds(20, 600, 74, 32);

        jbtCrearNuevaLista.setText("Nuevo Curso");
        jbtCrearNuevaLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtCrearNuevaListaActionPerformed(evt);
            }
        });
        getContentPane().add(jbtCrearNuevaLista);
        jbtCrearNuevaLista.setBounds(20, 680, 120, 32);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AgregarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarListaActionPerformed
        // TODO add your handling code here:
        CtrlAlumno Al = new CtrlAlumno();
        Al.CrearAlumno(txtMateria.getText(), txtGrado.getText(), txtEstudiante.getText(), txtApellido.getText(), txtCorreo.getText(), txtTelefono.getText());
        L.Agregar(Al.getA());
        cargarTabla();
        LimpiarCampos();
        L.Ordenar(L, 0, L.tamaño()-1);
        txtGrado.setVisible(false);
        txtMateria.setVisible(false);
    }//GEN-LAST:event_AgregarListaActionPerformed

    private void GuardartxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardartxtActionPerformed
        CtrlTxt C = new CtrlTxt();
        String Nombre = "Lista";
        Nombre = Nombre + txtMateria.getText() + txtGrado.getText();
        C.GuardarTxt(L, Nombre);
        jbtCrearNuevaLista.setVisible(true);
    }//GEN-LAST:event_GuardartxtActionPerformed

    private void CargartxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargartxtActionPerformed
      if(txtGrado.getText().length() == 0 && txtMateria.getText().length() == 0 ){
          JOptionPane.showMessageDialog(null, "Rellene los campos de Materia y Grado");
      }else{
        CtrlTxt C = new CtrlTxt();
        String Nombre = "Lista";
        Nombre = Nombre + txtMateria.getText() + txtGrado.getText();
        L = C.CargarTxt(Nombre);
        cargarTabla();
      }
    }//GEN-LAST:event_CargartxtActionPerformed

    private void jbtCrearNuevaListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCrearNuevaListaActionPerformed
        int op = Integer.parseInt(JOptionPane.showInputDialog("¿ Desea Conservar la lista de alumnos actual \n (Esto no afectara sus datos actuales(  ?\n"
                + "1. Si"
                + "\n2. No"));
        if(op == 1){
        txtGrado.setVisible(true);
        txtGrado.setText("");
        txtMateria.setText("");
        txtMateria.setVisible(true);
        }else{
          L = new ListaAlum();
          cargarTabla();
          txtGrado.setVisible(true);
          txtMateria.setVisible(true);
          txtGrado.setText("");
          txtMateria.setText("");
          jbtCrearNuevaLista.setVisible(false);
        }
        
    }//GEN-LAST:event_jbtCrearNuevaListaActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarAlumnosMateria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarAlumnosMateria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarAlumnosMateria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarAlumnosMateria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarAlumnosMateria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarLista;
    private javax.swing.JButton Cargartxt;
    private javax.swing.JButton Guardartxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAlumnos;
    private javax.swing.JButton jbtCrearNuevaLista;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtEstudiante;
    private javax.swing.JTextField txtGrado;
    private javax.swing.JTextField txtMateria;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
