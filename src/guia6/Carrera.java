package guia6;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Carrera extends javax.swing.JFrame {
private Map<Integer, Long> tiemposPorCarro = new HashMap<>();

    public void agregarTiempo(int carro, long tiempo) {
        tiemposPorCarro.put(carro, tiempo);
    }
    public Carrera() {
        initComponents();
    carro1.setName("1");
    carro2.setName("2");
    carro3.setName("3");
    carro4.setName("4");
    carro5.setName("5");
    carro6.setName("6");
    carro7.setName("7");
    carro8.setName("8");
    carro9.setName("9");
    carro10.setName("10");
    }
    public JLabel getcarro1(){
        return carro1;
    }
    public JLabel getcarro2(){
        return carro2;
    }
    public JLabel getcarro3(){
        return carro3;
    }
    public JLabel getcarro4(){
        return carro4;
    }
    public JLabel getcarro5(){
        return carro5;
    }
    public JLabel getcarro6(){
        return carro6;
    }
    public JLabel getcarro7(){
        return carro7;
    }
    public JLabel getcarro8(){
        return carro8;
    }
    public JLabel getcarro9(){
        return carro9;
    }
    public JLabel getcarro10(){
        return carro10;
    }
    public JLabel getmeta(){
        return meta;
    }
    public JTextArea getText(){
        return llegadas;
    }
   private void mostrarResultadosOrdenados() {
JTextArea llegadas = getText();
        llegadas.setText("");

        // Crear una lista para almacenar los tiempos ordenados
        List<Long> tiemposOrdenados = new ArrayList<>(tiemposPorCarro.values());
        Collections.sort(tiemposOrdenados);

        // Mostrar los tiempos ordenados por carro
        for (int i = 0; i < tiemposOrdenados.size(); i++) {
            for (Map.Entry<Integer, Long> entry : tiemposPorCarro.entrySet()) {
                if (entry.getValue() == tiemposOrdenados.get(i)) {
                    llegadas.append("Carro " + entry.getKey() + ": " + entry.getValue() + "ms\n");
                    break;
                }
            }
        }
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        carro1 = new javax.swing.JLabel();
        carro2 = new javax.swing.JLabel();
        carro3 = new javax.swing.JLabel();
        carro4 = new javax.swing.JLabel();
        carro5 = new javax.swing.JLabel();
        carro6 = new javax.swing.JLabel();
        carro7 = new javax.swing.JLabel();
        carro8 = new javax.swing.JLabel();
        carro9 = new javax.swing.JLabel();
        carro10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        meta = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        llegadas = new javax.swing.JTextArea();
        Resultados = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setForeground(new java.awt.Color(102, 102, 102));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        carro1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carro1.png"))); // NOI18N

        carro2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carro2.png"))); // NOI18N

        carro3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carro3.png"))); // NOI18N

        carro4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carro4.png"))); // NOI18N

        carro5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carro5.png"))); // NOI18N

        carro6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carro6.png"))); // NOI18N

        carro7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carro7.png"))); // NOI18N

        carro8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carro8.png"))); // NOI18N

        carro9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carro9.png"))); // NOI18N

        carro10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carro10.png"))); // NOI18N

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pista.png"))); // NOI18N

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/meta.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(carro6)
                        .addComponent(carro7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(carro8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(carro10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(carro9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(carro5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(carro3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(carro4)
                        .addComponent(carro2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(carro1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 733, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addComponent(meta)
                .addGap(64, 64, 64))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(meta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(carro1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(carro2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(carro3)
                .addGap(18, 18, 18)
                .addComponent(carro4)
                .addGap(18, 18, 18)
                .addComponent(carro5)
                .addGap(18, 18, 18)
                .addComponent(carro6)
                .addGap(18, 18, 18)
                .addComponent(carro7)
                .addGap(18, 18, 18)
                .addComponent(carro8)
                .addGap(18, 18, 18)
                .addComponent(carro9)
                .addGap(18, 18, 18)
                .addComponent(carro10))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Carrera De Autos");

        jButton1.setText("START");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Carro 1");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Carro 2");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Carro 3");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Carro 4");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Carro 5");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Carro 6");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Carro 7");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Carro 8");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Carro 9");

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Carro 10");

        llegadas.setColumns(20);
        llegadas.setRows(5);
        jScrollPane1.setViewportView(llegadas);

        Resultados.setText("Mostrar Resultados");
        Resultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResultadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(393, 393, 393)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(Resultados))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jButton1)))
                .addGap(0, 11, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel2)
                        .addGap(47, 47, 47)
                        .addComponent(jLabel3)
                        .addGap(54, 54, 54)
                        .addComponent(jLabel4)
                        .addGap(51, 51, 51)
                        .addComponent(jLabel5)
                        .addGap(52, 52, 52)
                        .addComponent(jLabel6)
                        .addGap(51, 51, 51)
                        .addComponent(jLabel7)
                        .addGap(47, 47, 47)
                        .addComponent(jLabel8)
                        .addGap(54, 54, 54)
                        .addComponent(jLabel9)
                        .addGap(54, 54, 54)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addGap(53, 53, 53))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jButton1)
                                .addGap(157, 157, 157)
                                .addComponent(Resultados)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(35, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        carro1.setLocation(0, carro1.getLocation().y);
        carro2.setLocation(0, carro2.getLocation().y);
        carro3.setLocation(0, carro3.getLocation().y);
        carro4.setLocation(0, carro4.getLocation().y);
        carro5.setLocation(0, carro5.getLocation().y);
        carro6.setLocation(0, carro6.getLocation().y);
        carro7.setLocation(0, carro7.getLocation().y);
        carro8.setLocation(0, carro8.getLocation().y);
        carro9.setLocation(0, carro9.getLocation().y);
        carro10.setLocation(0, carro10.getLocation().y);
        
    Guia6 c1 = new Guia6(carro1, this);
    Guia6 c2 = new Guia6(carro2, this);
    Guia6 c3 = new Guia6(carro3, this);
    Guia6 c4 = new Guia6(carro4, this);
    Guia6 c5 = new Guia6(carro5, this);
    Guia6 c6 = new Guia6(carro6, this);
    Guia6 c7 = new Guia6(carro7, this);
    Guia6 c8 = new Guia6(carro8, this);
    Guia6 c9 = new Guia6(carro9, this);
    Guia6 c10 = new Guia6(carro10, this);

    c1.start();
    c2.start();
    c3.start();
    c4.start();
    c5.start();
    c6.start();
    c7.start();
    c8.start();
    c9.start();
    c10.start();
        llegadas.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResultadosActionPerformed
mostrarResultadosOrdenados();
    }//GEN-LAST:event_ResultadosActionPerformed

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
            java.util.logging.Logger.getLogger(Carrera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Carrera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Carrera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Carrera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Carrera().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Resultados;
    private javax.swing.JLabel carro1;
    private javax.swing.JLabel carro10;
    private javax.swing.JLabel carro2;
    private javax.swing.JLabel carro3;
    private javax.swing.JLabel carro4;
    private javax.swing.JLabel carro5;
    private javax.swing.JLabel carro6;
    private javax.swing.JLabel carro7;
    private javax.swing.JLabel carro8;
    private javax.swing.JLabel carro9;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea llegadas;
    private javax.swing.JLabel meta;
    // End of variables declaration//GEN-END:variables
}
