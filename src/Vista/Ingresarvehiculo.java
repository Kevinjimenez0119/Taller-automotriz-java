/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vista;
import java.sql.ResultSet;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author USUARIO
 */
public class Ingresarvehiculo extends javax.swing.JFrame {

    /**
     * Creates new form Ingresarvehiculo
     */
    String cliente;
    String nombres;
    String apellidos;
    String direccion;
    String telefono;
    String tipocliente;
    Calendar fe=new GregorianCalendar();
     public final Menuempleados obj;
    public Ingresarvehiculo(Menuempleados obj) {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        this.obj=obj;
        mostrar2(cliente);
        t4.setCalendar(fe);
    }
    
    public void mostrar2(String id)
    {
        DefaultTableModel modelo=new DefaultTableModel();
        ResultSet re=obj.obj.n2.llenartabla("select * from vehiculosreg where idcliente='"+id+"'");
        modelo.setColumnIdentifiers(new Object[]{"matricula","tipo de vehiculo","modelo","color","idcliente"});
        try {
            while(re.next())
            {
                modelo.addRow(new Object[]{re.getString(1),re.getString(2),re.getString(3),re.getString(4),re.getString(5)});
            }
            tabla.setModel(modelo);
        } catch (Exception e) {
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

        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        t4 = new com.toedter.calendar.JDateChooser();
        t3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        c1 = new javax.swing.JComboBox<>();
        b1 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        t10 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        getContentPane().add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 180, 35));
        getContentPane().add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 180, 36));
        getContentPane().add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 290, 40));

        t3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t3ActionPerformed(evt);
            }
        });
        getContentPane().add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 180, 36));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MATRICULA:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("TIPO VEHICULO:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("MODELO:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 132, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("COLOR:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 189, -1, -1));

        c1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Automovil", "Motocicleta" }));
        getContentPane().add(c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 180, 32));

        b1.setText("Ingresar");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));

        b3.setText("Cancelar");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        getContentPane().add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, -1, -1));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, -1, 167));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("BUSCAR POR MATRICULA:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, -1, -1));

        t10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t10KeyReleased(evt);
            }
        });
        getContentPane().add(t10, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 180, 32));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/7d514ce90eed62493f6938af1c26a477.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 980, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    private void t3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t3ActionPerformed

    private void t10KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t10KeyReleased
        String id=t10.getText();
        mostrar2(id);
    }//GEN-LAST:event_t10KeyReleased

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        obj.mostrar();
        obj.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_b3ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        Asignarmecanico obj1=new Asignarmecanico(this);
        String matricula=t1.getText();
        String tipo=c1.getSelectedItem().toString();
        String modelo=t2.getText();
        String color=t3.getText();
        String fecha=((JTextField)t4.getDateEditor().getUiComponent()).getText();
        String fechasb="1";
                
        if(obj.obj.n2.buscarvehiculo(matricula,fechasb).equals("no encontrado"))
        {
            
            if(obj.obj.n2.buscarvehiculoreg(matricula).equals("no encontrado"))
            {
                obj.obj.n2.guardarvehiculoreg(matricula, tipo, modelo, color, cliente);
            }
            JOptionPane.showMessageDialog(this, "Registro exitoso");
            mostrar2(cliente);
            obj.mostrar();
            
        }else
        {
            JOptionPane.showMessageDialog(this, "Hay un vehiculo con esa placa dentro del taller");
            obj.mostrar();
            
        }
    }//GEN-LAST:event_b1ActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        Asignarmecanico obj1=new Asignarmecanico(this);
        int seleccionar=tabla.rowAtPoint(evt.getPoint());
        obj1.matricula=(String.valueOf(tabla.getValueAt(seleccionar, 0)));
        String matricula=(String.valueOf(tabla.getValueAt(seleccionar, 0)));
        String tipo=(String.valueOf(tabla.getValueAt(seleccionar, 1)));
        String modelo=(String.valueOf(tabla.getValueAt(seleccionar, 2)));
        String color=(String.valueOf(tabla.getValueAt(seleccionar, 3)));
        String idcliente=(String.valueOf(tabla.getValueAt(seleccionar, 4)));
        String fecha=((JTextField)t4.getDateEditor().getUiComponent()).getText();
        String fechas="0";
        
        if(obj.obj.n2.buscarvehiculo(matricula,fechas).equals("no encontrado"))
        {
            obj.obj.n2.guardarvehiculo(matricula, tipo, modelo, color, fecha, fechas, idcliente);
            
            
            obj.mostrar();
            obj1.setVisible(true);
            this.dispose();
        }else
        {
            JOptionPane.showMessageDialog(this, "Hay un vehiculo con esa placa dentro del taller");
            obj.mostrar();
            
        }
    }//GEN-LAST:event_tablaMouseClicked

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b3;
    private javax.swing.JComboBox<String> c1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t10;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private com.toedter.calendar.JDateChooser t4;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
