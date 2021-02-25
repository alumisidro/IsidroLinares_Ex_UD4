
import javax.swing.DefaultListModel;
import javax.swing.JDialog;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Clase que gestiona apuestas; permite añadir y eliminar partidos además de
 * realizar quinielas.
 *
 * @author Isidro Manuel Linares Camarena
 * @version 1.0
 * @since 1.0
 */
public class Apuesta extends javax.swing.JFrame {

    /**
     * Constructor sin parámetros de la clase Apuesta
     */
    public Apuesta() {
        // Inicializar componentes
        initComponents();
        // Bloquea la redimensión del JFrame
        this.setResizable(Boolean.FALSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pEtiquetaQuiniela = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pQuiniela = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaQuiniela = new javax.swing.JList();
        pBotones = new javax.swing.JPanel();
        bNuevo = new javax.swing.JButton();
        bEliminar = new javax.swing.JButton();
        bRealizar = new javax.swing.JButton();
        bResetear = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaResultados = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ejercicio 07");

        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel2.setText("Partidos");
        jPanel1.add(jLabel2, java.awt.BorderLayout.WEST);

        jLabel3.setText("Resultados");
        jPanel1.add(jLabel3, java.awt.BorderLayout.LINE_END);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        jLabel1.setForeground(java.awt.Color.red);
        jLabel1.setText("Quiniela");
        pEtiquetaQuiniela.add(jLabel1);

        getContentPane().add(pEtiquetaQuiniela, java.awt.BorderLayout.NORTH);

        pQuiniela.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pQuiniela.setLayout(new java.awt.BorderLayout());

        jScrollPane3.setMaximumSize(new java.awt.Dimension(150, 200));
        jScrollPane3.setMinimumSize(new java.awt.Dimension(150, 200));
        jScrollPane3.setPreferredSize(new java.awt.Dimension(150, 200));

        jScrollPane3.setViewportView(listaQuiniela);

        pQuiniela.add(jScrollPane3, java.awt.BorderLayout.WEST);

        pBotones.setMaximumSize(new java.awt.Dimension(125, 200));
        pBotones.setMinimumSize(new java.awt.Dimension(125, 200));
        pBotones.setPreferredSize(new java.awt.Dimension(125, 200));

        bNuevo.setText("Nuevo");
        bNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNuevoActionPerformed(evt);
            }
        });
        pBotones.add(bNuevo);

        bEliminar.setText("Eliminar");
        bEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEliminarActionPerformed(evt);
            }
        });
        pBotones.add(bEliminar);

        bRealizar.setText("Realizar quiniela");
        bRealizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRealizarActionPerformed(evt);
            }
        });
        pBotones.add(bRealizar);

        bResetear.setText("Resetear");
        bResetear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bResetearActionPerformed(evt);
            }
        });
        pBotones.add(bResetear);

        pQuiniela.add(pBotones, java.awt.BorderLayout.CENTER);

        jScrollPane2.setMaximumSize(new java.awt.Dimension(150, 200));
        jScrollPane2.setMinimumSize(new java.awt.Dimension(150, 200));
        jScrollPane2.setPreferredSize(new java.awt.Dimension(150, 200));

        jScrollPane2.setViewportView(listaResultados);

        pQuiniela.add(jScrollPane2, java.awt.BorderLayout.EAST);

        getContentPane().add(pQuiniela, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Método que utiliza la clase crearPartido para añadir un nuevo partido; se
     * abre una nueva ventana.
     *
     * @param evt Evento obtenido de tipo ActionEvent
     */
    private void bNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNuevoActionPerformed
        crearPartido agregarPartido = new crearPartido(this);
        // Establecer operación predeterminada al cerrar la ventana
        agregarPartido.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        // Establecer tamaño de la ventana
        agregarPartido.setSize(400, 75);
        // No permitir redimensión de la ventana
        agregarPartido.setResizable(Boolean.FALSE);
        // Establecer título de la ventana
        agregarPartido.setTitle("Agregar nuevo partido");
        // Establecer visibilidad de la ventana
        agregarPartido.setVisible(Boolean.TRUE);
    }//GEN-LAST:event_bNuevoActionPerformed

    /**
     * Borra un partido al recibir el evento de pulsar el botón Eliminar
     *
     * @param evt Evento obtenido de tipo ActionEvent
     */
    private void bEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEliminarActionPerformed
        borraPartido(listaQuiniela.getSelectedIndex());
    }//GEN-LAST:event_bEliminarActionPerformed

    /**
     * Método de reseteo: Vacía la lista de partidos creados y quinielas
     * realizadas.
     *
     * @param evt Evento obtenido de tipo ActionEvent
     */
    private void bResetearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bResetearActionPerformed
        DefaultListModel modelovacio = new DefaultListModel();
        this.listaQuiniela.setModel(modelovacio);
        this.listaResultados.setModel(modelovacio);
    }//GEN-LAST:event_bResetearActionPerformed

    /**
     * Genera un número aleatorio entre los dos parámetros recibidos
     *
     * @param n1 número mínimo a retornar
     * @param n2 número máximo a retornar
     * @return <code>int</code> número generado
     */
    public int cualquiera(int n1, int n2) {
        return (int) Math.floor((Math.random() * (n2 - n1 + 1) + n1));
    }

    /**
     * Método para realizar las quinielas; se ejecuta al pulsar el botón
     * Realizar Quiniela
     *
     * @param evt Evento obtenido de tipo ActionEvent
     */
    private void bRealizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRealizarActionPerformed
        DefaultListModel modeloquinielaresuelta = new DefaultListModel();
        // Bucle que recorre las quinielas realizadas
        for (int i = 0; i < this.listaQuiniela.getModel().getSize(); i++) {
            // Cadena de caracteres que contendrá el resultado de la quiniela
            String partidoresuelto = this.listaQuiniela.getModel().getElementAt(i).toString();

            // Se genera un número aleatorio y añade a la cadena de caracteres el resultado
            switch (cualquiera(0, 2)) {
                // Si el número es 0
                case 0:
                    partidoresuelto += " -> 1";
                    break;
                // Si el número es 1
                case 1:
                    partidoresuelto += " -> X";
                    break;
                // Si el número es 2
                case 2:
                    partidoresuelto += " -> 2";
                    break;
            }

            // Añadir a la quiniela la cadena de caracteres
            modeloquinielaresuelta.addElement(partidoresuelto);
        }

        // Asignar el modelo a la lista de resultados (JList)
        this.listaResultados.setModel(modeloquinielaresuelta);
    }//GEN-LAST:event_bRealizarActionPerformed

    /**
     * Método sin retorno que añade un nuevo partido
     *
     * @param partido cadena de caracteres con el nombre del partido
     */
    public void partidoNuevo(String partido) {
        // Crear nuevo modelo
        DefaultListModel modelonuevo = new DefaultListModel();

        // Bucle que recorre la lista de quinielas
        for (int i = 0; i < this.listaQuiniela.getModel().getSize(); i++) {
            // Añadir el elemento de la quiniela al modelo creado
            modelonuevo.addElement(this.listaQuiniela.getModel().getElementAt(i));
        }
        // Añadir la cadena de caracteres del partido al modelo
        modelonuevo.addElement(partido);

        // Asignar modelo a la lista de quiniela (JList)
        this.listaQuiniela.setModel(modelonuevo);
    }

    /**
     * Método sin retorno que borra un partido junto a todos sus datos
     * asociados: quinielas y resultados.
     *
     * @param indice número del partido
     */
    public void borraPartido(int indice) {
        // Crear modelo para las quinielas
        DefaultListModel modelonuevoquiniela = new DefaultListModel();
        // Crear modelo para los partidos
        DefaultListModel modelonuevoresultados = new DefaultListModel();

        // Bucle que recorre la quiniela
        for (int i = 0; i < this.listaQuiniela.getModel().getSize(); i++) {
            // Si el índice de la quiniela es diferente al indice del partido
            if (i != indice) {
                // Añadir al modelo el elemento de la quiniela (mantenerlo)
                modelonuevoquiniela.addElement(this.listaQuiniela.getModel().getElementAt(i));
            }
        }
        // Bucle que recorre los resultados
        for (int i = 0; i < this.listaResultados.getModel().getSize(); i++) {
            // Si el índice del resultado es diferente al indice del partido
            if (i != indice) {
                // Añadir al modelo el elemento de los resultados (mantenerlo)
                modelonuevoresultados.addElement(this.listaResultados.getModel().getElementAt(i));
            }
        }

        // Asignar modelo a la lista de quiniela (JList)
        this.listaQuiniela.setModel(modelonuevoquiniela);
        // Asignar modelo a la lista de resultados (JList)
        this.listaResultados.setModel(modelonuevoresultados);
    }

    /**
     * Método inicial que crea y muestra el formulario de apuestas
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
            java.util.logging.Logger.getLogger(Apuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Apuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Apuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Apuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Apuesta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bEliminar;
    private javax.swing.JButton bNuevo;
    private javax.swing.JButton bRealizar;
    private javax.swing.JButton bResetear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList listaQuiniela;
    private javax.swing.JList listaResultados;
    private javax.swing.JPanel pBotones;
    private javax.swing.JPanel pEtiquetaQuiniela;
    private javax.swing.JPanel pQuiniela;
    // End of variables declaration//GEN-END:variables
}
