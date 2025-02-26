/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Modelo.Contructor;
import java.util.List;
import javax.swing.ButtonModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author APRENDIZ
 */
public class Interfaz_Principal extends javax.swing.JFrame {

   
    private Contructor usuarioActual;
    public int numeroCuenta;
    
    public Interfaz_Principal(Contructor usuario) {
        
        this.usuarioActual = usuario;
        initComponents();
        mostrarSaldo();
        
        
    }
    DefaultListModel listaUsuarios = new DefaultListModel();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txSaludo = new javax.swing.JLabel();
        btImprimir = new javax.swing.JButton();
        btAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ltUsuarios = new javax.swing.JList<>();
        btCerrarSesion = new javax.swing.JButton();
        tfNumCuenta = new javax.swing.JTextField();
        txSaludo1 = new javax.swing.JLabel();
        tfSaldo = new javax.swing.JTextField();
        btAgregarSaldo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txSaludo.setText("Numero de Cuenta");

        btImprimir.setText("Imprimir Usuarios");
        btImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btImprimirActionPerformed(evt);
            }
        });

        btAgregar.setText("Agregar Usuario");
        btAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAgregarActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(ltUsuarios);

        btCerrarSesion.setText("Cerrar Sesión");
        btCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCerrarSesionActionPerformed(evt);
            }
        });

        tfNumCuenta.setEnabled(false);
        tfNumCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNumCuentaActionPerformed(evt);
            }
        });

        txSaludo1.setText("Saldo");

        tfSaldo.setEnabled(false);

        btAgregarSaldo.setText("Agregar Saldo");
        btAgregarSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAgregarSaldoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txSaludo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNumCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txSaludo1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 463, Short.MAX_VALUE)
                        .addComponent(btCerrarSesion)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btAgregarSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(50, 50, 50))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txSaludo)
                        .addComponent(tfNumCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txSaludo1)
                        .addComponent(tfSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btCerrarSesion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAgregarSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(155, 155, 155))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAgregarActionPerformed

        Crear_Usuario ca = new Crear_Usuario();
        ca.setVisible(true);
    }//GEN-LAST:event_btAgregarActionPerformed

    private void btImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btImprimirActionPerformed

     // Obtén la lista de usuarios
    List<String> usuariosList = Contructor.mostrarUsuarios();
    
    // Limpiar el modelo antes de agregar nuevos elementos
    listaUsuarios.clear();

    // Agregar cada usuario de la lista a la lista en el JList
    for (String usuario : usuariosList) {
        listaUsuarios.addElement(usuario);
    }

    // Establecer el modelo de la lista para el JList
    ltUsuarios.setModel(listaUsuarios);

    }//GEN-LAST:event_btImprimirActionPerformed

    private void btCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCerrarSesionActionPerformed

        Contructor usuarioEjemplo = new Contructor("Ejemplo", "Ejemplo", 123456, 1, "password", 0);
        Ingreso_Usuarios iu = new Ingreso_Usuarios(usuarioEjemplo);
        iu.setVisible(true);
        
        this.dispose();

    }//GEN-LAST:event_btCerrarSesionActionPerformed

    private void tfNumCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNumCuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNumCuentaActionPerformed

    private void btAgregarSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAgregarSaldoActionPerformed

        numeroCuenta = Integer.parseInt(JOptionPane.showInputDialog(null, "Escriba el numero de cuenta" ));
        
        
        
    }//GEN-LAST:event_btAgregarSaldoActionPerformed

    public class GestorUsuarios {
    public void mostrarTodosLosUsuarios() {
        List<Contructor> listaUsuarios = Contructor.getUsuarios(); // Llamamos al método getUsuarios()

        if (listaUsuarios.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay usuarios registrados.");
        } else {
            for (Contructor usuario : listaUsuarios) {
                System.out.println("Nombre: " + usuario.getNombreTitular() +
                                   ", Apellido: " + usuario.getApellidoTitular() +
                                   ", Número de Cuenta: " + usuario.getNumeroCuenta());
            }
        }
    }
}
    
    
   private void mostrarSaldo() {
    int[] resultado = Contructor.consultarSaldo(usuarioActual.getNumeroCuenta()); // Consultamos saldo y número de cuenta
    tfSaldo.setText(String.valueOf(resultado[0]));  // El saldo está en la primera posición
    tfNumCuenta.setText(String.valueOf(resultado[1]));  // El número de cuenta está en la segunda posición
}
    
    
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAgregar;
    private javax.swing.JButton btAgregarSaldo;
    private javax.swing.JButton btCerrarSesion;
    private javax.swing.JButton btImprimir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> ltUsuarios;
    private javax.swing.JTextField tfNumCuenta;
    private javax.swing.JTextField tfSaldo;
    private javax.swing.JLabel txSaludo;
    private javax.swing.JLabel txSaludo1;
    // End of variables declaration//GEN-END:variables
}
