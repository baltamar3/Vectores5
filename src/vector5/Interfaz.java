/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vector5;

import javax.swing.JOptionPane;

/**
 *
 * @author baltamar
 */
public class Interfaz extends javax.swing.JFrame {

    double v[];
    public Interfaz() {
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtLongitud = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        cmdCrear = new javax.swing.JButton();
        cmdLlenaManualr = new javax.swing.JButton();
        cmdLenarAutomatico = new javax.swing.JButton();
        cmdCalcular = new javax.swing.JButton();
        cmdborrar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtSumatoria = new javax.swing.JTextField();
        txtProductoria = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("OPERACIONES CON UN VECTOR PARTIDO A LA MITAD");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Iniciales"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Longitud Vector:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        txtLongitud.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLongitudKeyTyped(evt);
            }
        });
        jPanel2.add(txtLongitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 40, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 160, 60));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdCrear.setText("Crear");
        cmdCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCrearActionPerformed(evt);
            }
        });
        jPanel4.add(cmdCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 130, -1));

        cmdLlenaManualr.setText("LLenar Manual");
        cmdLlenaManualr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLlenaManualrActionPerformed(evt);
            }
        });
        jPanel4.add(cmdLlenaManualr, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 130, -1));

        cmdLenarAutomatico.setText("LLenar Automatico");
        cmdLenarAutomatico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLenarAutomaticoActionPerformed(evt);
            }
        });
        jPanel4.add(cmdLenarAutomatico, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 130, -1));

        cmdCalcular.setText("Calcular");
        cmdCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCalcularActionPerformed(evt);
            }
        });
        jPanel4.add(cmdCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 130, -1));

        cmdborrar.setText("Borrar");
        cmdborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdborrarActionPerformed(evt);
            }
        });
        jPanel4.add(cmdborrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 130, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 150, 240));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultados"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Sumatoria De La Segunda Mitad Del Vector");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel4.setText("Productoria De La Primera Mitad Del Vector");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 210, -1));

        txtSumatoria.setEditable(false);
        jPanel3.add(txtSumatoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 110, -1));

        txtProductoria.setEditable(false);
        jPanel3.add(txtProductoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 110, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 230, 180));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtLongitudKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLongitudKeyTyped
        char c=evt.getKeyChar();

        if(!Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_txtLongitudKeyTyped

    private void cmdCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCrearActionPerformed
        int longitud;

        if(txtLongitud.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this,"Ingrese la longitud del vector", "Error",JOptionPane.ERROR_MESSAGE);
            txtLongitud.requestFocusInWindow();
        }
        else if(txtLongitud.getText().trim().equals("0")){
            JOptionPane.showMessageDialog(this, "EL tamaño del vector no puede ser 0", "Error", JOptionPane.ERROR_MESSAGE);
            txtLongitud.requestFocusInWindow();
            txtLongitud.selectAll();
        }
        else if (Integer.parseInt(txtLongitud.getText().trim())==0) {
            JOptionPane.showMessageDialog(this, "La longitud no puede ser cero", "Error", JOptionPane.ERROR_MESSAGE);
            txtLongitud.requestFocusInWindow();
            txtLongitud.selectAll();
        }
        else if (Integer.parseInt(txtLongitud.getText())%2!=0) {
            JOptionPane.showMessageDialog(this, "La longitud del vector debe ser par", "Error", JOptionPane.ERROR_MESSAGE);
            txtLongitud.requestFocusInWindow();
            txtLongitud.selectAll();
        }
        else{
            longitud=Integer.parseInt(txtLongitud.getText());
            v=new double[longitud];
            JOptionPane.showMessageDialog(this, "Vector creado correctamente", "Informacion",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_cmdCrearActionPerformed

    private void cmdLlenaManualrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLlenaManualrActionPerformed
        double n;
        for (int i = 0; i < v.length; i++) {
            n=Double.parseDouble(JOptionPane.showInputDialog(this, "digite el elemento numero "+(i+1)));
            v[i]=n;
        }
    }//GEN-LAST:event_cmdLlenaManualrActionPerformed

    private void cmdLenarAutomaticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLenarAutomaticoActionPerformed
        double n;
        for (int i = 0; i < v.length; i++) {
            n=(int)(Math.random()* 50 + 1);
            v[i]=n;
        }
        JOptionPane.showMessageDialog(this, "Vector llenado correctamente");
    }//GEN-LAST:event_cmdLenarAutomaticoActionPerformed

    private void cmdCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalcularActionPerformed
        double suma=0,producto=1;
        
        for (int i = 0; i < v.length/2; i++) {
            
            producto=producto*v[i];
        }
        for (int i = v.length/2; i < v.length; i++) {
            
            suma=suma+v[i];
        }
        String productoria=String.valueOf(producto);
        txtProductoria.setText(productoria);
        String sumatoria=String.valueOf(suma);
        txtSumatoria.setText(sumatoria);  
    }//GEN-LAST:event_cmdCalcularActionPerformed

    private void cmdborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdborrarActionPerformed
        txtLongitud.setText("");
        txtProductoria.setText("");
        txtSumatoria.setText("");
        txtLongitud.requestFocusInWindow();
        v=null;
    }//GEN-LAST:event_cmdborrarActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdCalcular;
    private javax.swing.JButton cmdCrear;
    private javax.swing.JButton cmdLenarAutomatico;
    private javax.swing.JButton cmdLlenaManualr;
    private javax.swing.JButton cmdborrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField txtLongitud;
    private javax.swing.JTextField txtProductoria;
    private javax.swing.JTextField txtSumatoria;
    // End of variables declaration//GEN-END:variables
}
