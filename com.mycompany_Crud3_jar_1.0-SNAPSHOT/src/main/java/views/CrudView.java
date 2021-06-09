/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;
import DAL.Fabrica;
import DAL.IConsulta;
import controller.AlumnosDAOImpl;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.AlumnosModel;
/**
 *
 * @author sergio
 */
public class CrudView extends javax.swing.JFrame {
    DefaultTableModel model = new DefaultTableModel();
    IConsulta con = Fabrica.construir("Modificar");
    /**
     * Creates new form CrudView
     */
    public CrudView() {
        initComponents();
        obtenerAlumnos();
    }
    private void obtenerAlumnos(){
        List<AlumnosModel> lstAlum = new ArrayList<AlumnosModel>();
        AlumnosDAOImpl alum = new AlumnosDAOImpl();
        model = (DefaultTableModel) tbAlumnos.getModel();
        Object obj[] = null; 
        lstAlum = alum.listarAlumnos();
        for(int i = 0; i < lstAlum.size(); i++){
            AlumnosModel A = (AlumnosModel)lstAlum.get(i);
            model.addRow(obj);
            tbAlumnos.setValueAt(A.getId(), i, 0);
            tbAlumnos.setValueAt(A.getMatricula(), i, 1);
            tbAlumnos.setValueAt(A.getNombre(), i, 2);
            tbAlumnos.setValueAt(A.getSemestre(), i, 3);
        }
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbAlumnos = new javax.swing.JTable();
        txtSemestre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(24, 61, 97));

        jLabel1.setForeground(new java.awt.Color(246, 246, 246));
        jLabel1.setText("CRUD Alumnos");

        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setText("Matricula:");

        jLabel3.setForeground(new java.awt.Color(250, 254, 255));
        jLabel3.setText("Nombre:");

        jLabel4.setForeground(new java.awt.Color(250, 253, 254));
        jLabel4.setText("Semestre:");

        txtMatricula.setActionCommand("<Not Set>");
        txtMatricula.setCursor(new java.awt.Cursor(java.awt.Cursor.W_RESIZE_CURSOR));
        txtMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMatriculaActionPerformed(evt);
            }
        });

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        tbAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Matricula", "Nombre", "Semestre"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbAlumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbAlumnosMouseClicked(evt);
            }
        });
        tbAlumnos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbAlumnosKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tbAlumnos);

        jLabel5.setForeground(new java.awt.Color(254, 254, 254));
        jLabel5.setText("Id:");

        txtId.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtId.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(284, 284, 284)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAgregar)
                        .addGap(32, 32, 32)
                        .addComponent(btnModificar)
                        .addGap(29, 29, 29)
                        .addComponent(btnEliminar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txtSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtMatricula, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel5))
                            .addComponent(txtId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgregar)
                            .addComponent(btnModificar)
                            .addComponent(btnEliminar))
                        .addGap(45, 45, 45))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(71, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMatriculaActionPerformed

    private void tbAlumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbAlumnosMouseClicked
        int index = tbAlumnos.rowAtPoint(evt.getPoint());
        txtId.setText(String.valueOf(tbAlumnos.getValueAt(index, 0)));
        txtMatricula.setText(String.valueOf(tbAlumnos.getValueAt(index, 1)).trim());
        txtNombre.setText(String.valueOf(tbAlumnos.getValueAt(index, 2)).trim());
        txtSemestre.setText(String.valueOf(tbAlumnos.getValueAt(index, 3)).trim());
    }//GEN-LAST:event_tbAlumnosMouseClicked

    private void tbAlumnosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbAlumnosKeyReleased
        if((evt.getKeyCode() == 38) || (evt.getKeyCode() == 40)){
            txtId.setText(String.valueOf(tbAlumnos.getValueAt(tbAlumnos.getSelectedRow(), 0)));
            txtMatricula.setText(String.valueOf(tbAlumnos.getValueAt(tbAlumnos.getSelectedRow(), 1)).trim());
            txtNombre.setText(String.valueOf(tbAlumnos.getValueAt(tbAlumnos.getSelectedRow(), 2)).trim());
            txtSemestre.setText(String.valueOf(tbAlumnos.getValueAt(tbAlumnos.getSelectedRow(), 3)).trim());
        }
    }//GEN-LAST:event_tbAlumnosKeyReleased

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if(txtMatricula.getText().equals("") || txtNombre.getText().equals("") || txtSemestre.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Debes llenar todos los campos");
        }else{
            AlumnosModel alum = new AlumnosModel();                       
            alum.setMatricula(txtMatricula.getText());
            alum.setNombre(txtNombre.getText());
            alum.setSemestre(txtSemestre.getText());
            IConsulta con = Fabrica.construir("Insertar");
            if(con.consulta(alum)){
                JOptionPane.showMessageDialog(rootPane, "Alumno agregado!");
                model.setRowCount(0);
                obtenerAlumnos();
            }else{
                JOptionPane.showMessageDialog(rootPane, "A ocurrido un error :(");
            }
            
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if(txtMatricula.getText().equals("") || txtNombre.getText().equals("") || txtSemestre.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Debes llenar todos los campos");
        }else{        
            AlumnosModel alum = new AlumnosModel();           
            int id = Integer.parseInt(txtId.getText());
            alum.setId(id);
            alum.setMatricula(txtMatricula.getText());
            alum.setNombre(txtNombre.getText());
            alum.setSemestre(txtSemestre.getText());
            IConsulta con = Fabrica.construir("Modificar");
            if(con.consulta(alum)){
                JOptionPane.showMessageDialog(rootPane, "Alumno actualizado!");
                model.setRowCount(0);
                obtenerAlumnos();
            }else{
                JOptionPane.showMessageDialog(rootPane, "A ocurrido un error :(");
            }
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if(txtMatricula.getText().equals("") || txtNombre.getText().equals("") || txtSemestre.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Debes llenar todos los campos");
        }else{
            AlumnosModel alum = new AlumnosModel();
            int id = Integer.parseInt(txtId.getText());
            alum.setId(id);
            alum.setMatricula(txtMatricula.getText());
            alum.setNombre(txtNombre.getText());
            alum.setSemestre(txtSemestre.getText());
            IConsulta con = Fabrica.construir("Eliminar");
            if(con.consulta(alum)){
                JOptionPane.showMessageDialog(rootPane, "Alumno eliminado!");
                model.setRowCount(0);
                obtenerAlumnos();
            }else{
                JOptionPane.showMessageDialog(rootPane, "A ocurrido un error :(");
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(CrudView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrudView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrudView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrudView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrudView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbAlumnos;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSemestre;
    // End of variables declaration//GEN-END:variables
}