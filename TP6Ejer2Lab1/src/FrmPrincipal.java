public class FrmPrincipal extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FrmPrincipal.class.getName());

    public FrmPrincipal() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Administracion = new javax.swing.JMenu();
        productosMI = new javax.swing.JMenuItem();
        Consultas = new javax.swing.JMenu();
        nombreMI = new javax.swing.JMenuItem();
        precioMI = new javax.swing.JMenuItem();
        rubroMI = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 683, Short.MAX_VALUE)
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 468, Short.MAX_VALUE)
        );

        Administracion.setText("Administración");

        productosMI.setText("Productos");
        productosMI.addActionListener(this::productosMIActionPerformed);
        Administracion.add(productosMI);

        jMenuBar1.add(Administracion);

        Consultas.setText("Consultas");

        nombreMI.setText("x Nombre");
        nombreMI.addActionListener(this::nombreMIActionPerformed);
        Consultas.add(nombreMI);

        precioMI.setText("x Precio");
        Consultas.add(precioMI);

        rubroMI.setText("x Rubro");
        Consultas.add(rubroMI);

        jMenuBar1.add(Consultas);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreMIActionPerformed
        FrmConsultaNombre ventana = new FrmConsultaNombre(FrmProductos.catalogo);
        ventana.setVisible(true);
    }//GEN-LAST:event_nombreMIActionPerformed

    private void productosMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productosMIActionPerformed
        FrmProductos ventana = new FrmProductos();
        ventana.setVisible(true);
    }//GEN-LAST:event_productosMIActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> new FrmPrincipal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Administracion;
    private javax.swing.JMenu Consultas;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem nombreMI;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JMenuItem precioMI;
    private javax.swing.JMenuItem productosMI;
    private javax.swing.JMenuItem rubroMI;
    // End of variables declaration//GEN-END:variables
}
