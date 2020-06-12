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
public class Menumecanicos extends javax.swing.JFrame {

    /**
     * Creates new form Menumecanicos
     */
    Calendar fe=new GregorianCalendar();
    public final Escogervehiculo obj;
    String mecanico;
    String matricula;
    String cliente;
    String idasignado;
    public Menumecanicos(Escogervehiculo obj) {
       initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        this.obj=obj;
        mostrar();
        k2.setCalendar(fe);
        
    }
public void mostrar()
    {
        DefaultTableModel modelo=new DefaultTableModel();
        ResultSet re=obj.obj.n2.llenartabla("select * from repuestos");
        modelo.setColumnIdentifiers(new Object[]{"idrepuesto","marca","modelo","referencia","valor","cantidad","iddistribuidor"});
        try {
            while(re.next())
            {
                modelo.addRow(new Object[]{re.getString(1),re.getString(2),re.getString(3),re.getString(4),re.getString(5),re.getString(6),re.getString(7)});
            }
            tabla.setModel(modelo);
        } catch (Exception e) {
        }
    }

 public void mostrar2(String id)
    {
        DefaultTableModel modelo=new DefaultTableModel();
        ResultSet re=obj.obj.n2.llenartabla("select * from repuestos where referencia ='"+id+"'");
        modelo.setColumnIdentifiers(new Object[]{"idrepuesto","marca","modelo","referencia","valor","cantidad","iddistribuidor"});
        try {
            while(re.next())
            {
                modelo.addRow(new Object[]{re.getString(1),re.getString(2),re.getString(3),re.getString(4),re.getString(5),re.getString(6),re.getString(7)});
            }
            tabla.setModel(modelo);
        } catch (Exception e) {
        }
    }
 public void mostrar3()
    {
        DefaultTableModel modelo=new DefaultTableModel();
         ResultSet re=obj.obj.n2.llenartabla("select max(idfactura) ultimo from facturas");
        try {
                     while(re.next())
                     {
                         
                 
                ResultSet re2=obj.obj.n2.llenartabla("select * from comprar where idfactura='"+re.getInt(1)+"'");
        modelo.setColumnIdentifiers(new Object[]{"idcompra","idrepuesto","idfactura"});
        try {
            while(re2.next())
            {
                modelo.addRow(new Object[]{re2.getString(1),re2.getString(2),re2.getString(3)});
            }
            tabla2.setModel(modelo);
        } catch (Exception e) {
        }
                     }
            
                 
        
                 
                 
        } catch (Exception e) {
        }
        
    }
 public void mostrar4()
    {
        DefaultTableModel modelo=new DefaultTableModel();
        
                         
                 
                ResultSet re=obj.obj.n2.llenartabla("select * from facturas ");
        modelo.setColumnIdentifiers(new Object[]{"idfactura","fecha","valor","matricula","cliente","mecanico"});
        try {
            while(re.next())
            {
                modelo.addRow(new Object[]{re.getString(1),re.getString(2),re.getString(3),re.getString(4),re.getString(5),re.getString(6)});
            }
            tabla3.setModel(modelo);
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

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        c1 = new javax.swing.JComboBox<>();
        k2 = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        t2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla3 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1113, 13, 90, 30));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DESCRIPCION:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));
        getContentPane().add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 210, 28));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("TIPO DE SERVICIO:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 138, -1, -1));

        c1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "cambio", "reparacion", "diagnostico" }));
        getContentPane().add(c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 210, 32));
        getContentPane().add(k2, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 70, 280, 30));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, 290));

        t2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t2MouseClicked(evt);
            }
        });
        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });
        t2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t2KeyReleased(evt);
            }
        });
        getContentPane().add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 210, 33));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("REFERENCIA:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 188, -1, -1));

        jButton2.setText("Generar reporte");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, 170, 48));

        jButton3.setText("Agregar repuesto");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, 170, 45));

        tabla2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tabla2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, 267, 290));

        tabla3.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tabla3);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 230, -1, 290));

        jButton4.setText("Generar factura");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setText("MENÚ MECÁNICOS");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/7d514ce90eed62493f6938af1c26a477.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -280, 900, 1090));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/P2.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, -60, 370, 630));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/P2.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void t2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t2MouseClicked
        
    }//GEN-LAST:event_t2MouseClicked

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
       
    }//GEN-LAST:event_tablaMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int fila=tabla.getSelectedRow();
        int revision=2;
        int checkeado=1;
        String descripcion=t1.getText();
       String tipo=c1.getSelectedItem().toString();
       
                 String id2=(String.valueOf(tabla.getValueAt(fila, 0)));
                 String valor=(String.valueOf(tabla.getValueAt(fila, 5)));
                 String cantidad=(String.valueOf(tabla.getValueAt(fila, 6)));
                 int valorx=Integer.parseInt(valor);
                 int can=Integer.parseInt(cantidad);
        if(fila>=0)
        {
            if(can>0)
                 {
       if(!descripcion.isEmpty())
       {
          if(tipo.equals("cambio"))
           {
               
                 obj.obj.n2.guardarreporte(descripcion, tipo, valorx, mecanico, matricula, cliente, checkeado);
                 ResultSet re=obj.obj.n2.Buscarreporte();
                 try {
                 while(re.next())
            {
                obj.obj.n2.guardarcambio(descripcion, re.getInt(1), id2);
            }
                int id3=Integer.parseInt(idasignado);
                obj.obj.n2.actualizaasignado(idasignado,revision);
                
                obj.obj.n2.actualizarrepuesto(id2, can);
                obj.mostrar(mecanico);
                obj.setVisible(true);
                this.dispose();
            
               } catch (Exception e) {
               }
                 
           
          
              
          }}}else
            {
                JOptionPane.showMessageDialog(this, "No hay repuestos de este tipo");
            }
        }else
        {
            if(tipo.equals("diagnostico"))
           {
               
               String no="0";
               int no2=0;
                 obj.obj.n2.guardarreporte(descripcion, tipo, no2, mecanico, matricula, cliente, checkeado);
                 ResultSet re=obj.obj.n2.Buscarreporte();
                 try {
                   while(re.next())
            {
                obj.obj.n2.guardardiagnostico(descripcion, re.getInt(1));
            }
                int id=Integer.parseInt(idasignado);
                obj.obj.n2.actualizaasignado(idasignado,revision);
                obj.mostrar(mecanico);
                obj.setVisible(true);
                this.dispose();
            
               } catch (Exception e) {
               }
           }else if(tipo.equals("reparacion"))
           {
               String no="0";
               int no2=0;
               obj.obj.n2.guardarreporte(descripcion, tipo, no2, mecanico, matricula, cliente, checkeado);
                 ResultSet re=obj.obj.n2.Buscarreporte();
                 try {
                   while(re.next())
            {
                obj.obj.n2.guardarreparacion(descripcion, re.getInt(1));
            }
                int id=Integer.parseInt(idasignado);
                obj.obj.n2.actualizaasignado(idasignado,revision);
                obj.mostrar(mecanico);
                obj.setVisible(true);
                this.dispose();
            
               } catch (Exception e) {
               }
           }else if(tipo.equals("cambio"))
           {
               JOptionPane.showMessageDialog(this, "Error");
           }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t2ActionPerformed

    private void t2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t2KeyReleased
        String ref=t2.getText();
        mostrar2(ref);
    }//GEN-LAST:event_t2KeyReleased

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int fila=tabla.getSelectedRow();
        String id2=(String.valueOf(tabla.getValueAt(fila, 0)));
                 String valor=(String.valueOf(tabla.getValueAt(fila, 4)));
                 String cantidad=(String.valueOf(tabla.getValueAt(fila, 5)));
                 String fecha=((JTextField)k2.getDateEditor().getUiComponent()).getText();
                 int valorx=Integer.parseInt(valor)+10000;
                 int can=Integer.parseInt(cantidad);
                 int valort=0;
                 ResultSet re=obj.obj.n2.llenartabla("select max(idfactura) ultimo from facturas");
                 
                     
                   
                   
                     
                     
                 
         
                 try {
                     while(re.next())
                     {
                         obj.obj.n2.guardarcompra(id2, re.getInt(1), valorx);
                        
                         ResultSet re2=obj.obj.n2.llenartabla("select valor ultimo from comprar where idfactura ='"+re.getInt(1)+"'");
                         try {
                             while(re2.next())
                             {
                                 valort+=re2.getInt(1);
                                 obj.obj.n2.actualizafactura(re.getInt(1), valort);
                             }
                         } catch (Exception e) {
                         }
                         mostrar3();
                 
                 mostrar();mostrar4();
                     }
            
                 
        
                 
                 
        } catch (Exception e) {
        }
                    
                 
                
                 
                 
                 
                 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         
                 String fecha=((JTextField)k2.getDateEditor().getUiComponent()).getText();
                 int valorx=10000;
                 
        
           
                   
                     obj.obj.n2.guardarfactura(fecha, valorx, matricula, cliente, mecanico);
                     
                   
            mostrar4();
                  
       
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> c1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private com.toedter.calendar.JDateChooser k2;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTable tabla;
    private javax.swing.JTable tabla2;
    private javax.swing.JTable tabla3;
    // End of variables declaration//GEN-END:variables
}
