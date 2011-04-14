/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * VentanaPrincipal.java
 *
 * Created on 23/02/2011, 03:42:04 PM
 */
package tdr.vista;

import java.awt.BorderLayout;
import javax.swing.JScrollPane;

/**
 *
 * @author Lis
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /** Creates new form VentanaPrincipal */
    public VentanaPrincipal() {
        initComponents();
       
        panelDeInsercion.setLayout(new BorderLayout());
        GraphPanel graphPanel = new GraphPanel();
        //panelDeInsercion.setBounds(0, 0, 500, 300);
        panelDeInsercion.getRootPane().setDefaultButton(graphPanel.control.newButton);
       // graphPanel.setBounds(0, 0, 500, 300);
        panelDeInsercion.add(graphPanel.control, BorderLayout.NORTH);
        panelDeInsercion.add(new JScrollPane(graphPanel), BorderLayout.CENTER);
        graphPanel.setVisible(false);
        graphPanel.setVisible(true);
        this.pack();


    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelDeInsercion = new javax.swing.JPanel();
        controles = new javax.swing.JPanel();
        pListaDeVertices = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jMenuBar1 = new javax.swing.JMenuBar();
        file = new javax.swing.JMenu();
        edit = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelDeInsercion.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 162, 255), 3, true), "Panel De Inserción"));

        javax.swing.GroupLayout panelDeInsercionLayout = new javax.swing.GroupLayout(panelDeInsercion);
        panelDeInsercion.setLayout(panelDeInsercionLayout);
        panelDeInsercionLayout.setHorizontalGroup(
            panelDeInsercionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 524, Short.MAX_VALUE)
        );
        panelDeInsercionLayout.setVerticalGroup(
            panelDeInsercionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 406, Short.MAX_VALUE)
        );

        controles.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 162, 255), 3, true), "Controles"));

        javax.swing.GroupLayout controlesLayout = new javax.swing.GroupLayout(controles);
        controles.setLayout(controlesLayout);
        controlesLayout.setHorizontalGroup(
            controlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 113, Short.MAX_VALUE)
        );
        controlesLayout.setVerticalGroup(
            controlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 404, Short.MAX_VALUE)
        );

        pListaDeVertices.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 162, 255), 3, true), "Vértices Del Grafo"));

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Vértice 1", "Vértice 2", "Vértice 3", "Vértice 4", "Vértice 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout pListaDeVerticesLayout = new javax.swing.GroupLayout(pListaDeVertices);
        pListaDeVertices.setLayout(pListaDeVerticesLayout);
        pListaDeVerticesLayout.setHorizontalGroup(
            pListaDeVerticesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pListaDeVerticesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                .addContainerGap())
        );
        pListaDeVerticesLayout.setVerticalGroup(
            pListaDeVerticesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pListaDeVerticesLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
                .addContainerGap())
        );

        file.setText("File");
        jMenuBar1.add(file);

        edit.setText("Edit");
        jMenuBar1.add(edit);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelDeInsercion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pListaDeVertices, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(controles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pListaDeVertices, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelDeInsercion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(controles, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel controles;
    private javax.swing.JMenu edit;
    private javax.swing.JMenu file;
    private javax.swing.JList jList1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pListaDeVertices;
    private javax.swing.JPanel panelDeInsercion;
    // End of variables declaration//GEN-END:variables
}
