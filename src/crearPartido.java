
import java.awt.event.KeyEvent;

/**
 * Clase Vista encargada de la creación de partidos; extendida de JFrame
 *
 * @author Isidro Manuel Linares Camarena
 * @version 1.0
 * @since 1.0
 */
public class crearPartido extends javax.swing.JFrame {

    /**
     * Objeto de la clase Apuesta (ventana)
     */
    private Apuesta v;

    /**
     * Constructor sin parámetros que inicializa los componentes gráficos
     * (textos, fondos, colores, etc)
     */
    public crearPartido() {
        initComponents();
    }

    /**
     * Constructor con parámetro que inicializa los componentes gráficos
     * (textos, fondos, colores, etc)
     *
     * @param ventana Objeto de tipo Apuesta
     */
    public crearPartido(Apuesta ventana) {
        initComponents();
        // Asignar objeto recibido al de esta clase
        v = ventana;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pFuncionalidad = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tPartido = new javax.swing.JTextField();
        bAgregarPartido = new javax.swing.JButton();
        pInformacion = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pFuncionalidad.setBackground(java.awt.Color.white);
        pFuncionalidad.setLayout(new java.awt.BorderLayout());

        jLabel1.setText("Partido:");
        pFuncionalidad.add(jLabel1, java.awt.BorderLayout.WEST);

        tPartido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tPartidoKeyPressed(evt);
            }
        });
        pFuncionalidad.add(tPartido, java.awt.BorderLayout.CENTER);

        bAgregarPartido.setText("Aceptar");
        bAgregarPartido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAgregarPartidoActionPerformed(evt);
            }
        });
        pFuncionalidad.add(bAgregarPartido, java.awt.BorderLayout.LINE_END);

        getContentPane().add(pFuncionalidad, java.awt.BorderLayout.NORTH);

        pInformacion.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pInformacion.setLayout(new java.awt.BorderLayout());

        jLabel2.setText("Advertencia: ventana de subprograma");
        pInformacion.add(jLabel2, java.awt.BorderLayout.PAGE_START);

        getContentPane().add(pInformacion, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Método que llama al método <code>partidoNuevo</code> para añadir un nuevo
     * partido
     *
     * @param p Cadena de caracteres con el nombre del partido
     */
    public void añadePartido(String p) {
        // Crear partido
        v.partidoNuevo(p);
        // Vaciar campo del nombre del partido
        tPartido.setText("");
        // Establecer el foco en el campo de texto
        tPartido.requestFocus();
    }

    /**
     * Método para realizar la llamada para agregar partidos; se ejecuta al
     * pulsar el botón Aceptar del pequeño formulario
     *
     * @param evt Evento obtenido de tipo ActionEvent
     */
    private void bAgregarPartidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAgregarPartidoActionPerformed
        añadePartido(tPartido.getText());
    }//GEN-LAST:event_bAgregarPartidoActionPerformed

    /**
     * Método para realizar la llamada para agregar partidos; se ejecuta al
     * pulsar la tecla "INTRO" del reclado
     *
     * @param evt Evento obtenido de tipo ActionEvent
     */
    private void tPartidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tPartidoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            añadePartido(tPartido.getText());
        }
    }//GEN-LAST:event_tPartidoKeyPressed

    /**
     * Método inicial que crea y muestra el formulario
     *
     * @param args Array con cadenas de caracteres
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
            java.util.logging.Logger.getLogger(crearPartido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(crearPartido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(crearPartido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(crearPartido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new crearPartido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAgregarPartido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel pFuncionalidad;
    private javax.swing.JPanel pInformacion;
    private javax.swing.JTextField tPartido;
    // End of variables declaration//GEN-END:variables
}
