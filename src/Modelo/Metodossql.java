/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


/**
 *
 * @author USUARIO
 */
public class Metodossql {
   public Metodossql()
   {
       
   }
   public static String buscarcliente(String id)
    {
        String busqueda=null;
        Connection con=null;
        PreparedStatement sentencia;
        ResultSet resultado;
        try {
            con = conectar.conectar();
            String sentencia_buscar=("SELECT idcliente FROM clientes WHERE idcliente = '"+id+"'");
            sentencia = (PreparedStatement) con.prepareStatement(sentencia_buscar);
            resultado = sentencia.executeQuery();
            if(resultado.next())
            {
                busqueda = "encontrado";
            }else
            {
                busqueda = "no encontrado";
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return busqueda;
    }
    public void guardarcliente(String id, String nombres, String apellidos, String direccion, String telefono, String tipocliente)
    {
        
        
        
        try {
            conectar c=new conectar();
            Connection cone=null;
            cone = conectar.conectar();
            String sentencia_guardar ="INSERT INTO clientes VALUES ('"+id+"','"+nombres+"','"+apellidos+"','"+direccion+"','"+telefono+"','"+tipocliente+"')";
            
            PreparedStatement se= (PreparedStatement) cone.prepareStatement(sentencia_guardar);
            se.executeUpdate();
            
            
           
        } catch (Exception e) {
            System.out.println(e);
        }
       
    }
    public static String buscarvehiculo(String matricula)
    {
        String busqueda=null;
        Connection con=null;
        PreparedStatement sentencia;
        ResultSet resultado;
        try {
            con = conectar.conectar();
            String sentencia_buscar=("SELECT idmatricula FROM vehiculos WHERE idmatricula = '"+matricula+"'");
            sentencia = (PreparedStatement) con.prepareStatement(sentencia_buscar);
            resultado = sentencia.executeQuery();
            if(resultado.next())
            {
                busqueda = "encontrado";
            }else
            {
                busqueda = "no encontrado";
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return busqueda;
    }
    public void guardarvehiculo(String matricula, String tipovehiculo, String modelo, String color, String fecha, String idcliente)
    {
        
        
        
        try {
            conectar c=new conectar();
            Connection cone=null;
            cone = conectar.conectar();
            String sentencia_guardar ="INSERT INTO vehiculos VALUES ('"+matricula+"','"+tipovehiculo+"','"+modelo+"','"+color+"','"+fecha+"','"+idcliente+"')";
            
            PreparedStatement se= (PreparedStatement) cone.prepareStatement(sentencia_guardar);
            se.executeUpdate();
            
            
           
        } catch (Exception e) {
            System.out.println(e);
        }
       
    }
    public static String buscarvehiculoreg(String matricula)
    {
        String busqueda=null;
        Connection con=null;
        PreparedStatement sentencia;
        ResultSet resultado;
        try {
            con = conectar.conectar();
            String sentencia_buscar=("SELECT idmatricula FROM vehiculosreg WHERE idmatricula = '"+matricula+"'");
            sentencia = (PreparedStatement) con.prepareStatement(sentencia_buscar);
            resultado = sentencia.executeQuery();
            if(resultado.next())
            {
                busqueda = "encontrado";
            }else
            {
                busqueda = "no encontrado";
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return busqueda;
    }
    public void guardarvehiculoreg(String matricula, String tipovehiculo, String modelo, String color,  String idcliente)
    {
        
        
        
        try {
            conectar c=new conectar();
            Connection cone=null;
            cone = conectar.conectar();
            String sentencia_guardar ="INSERT INTO vehiculosreg VALUES ('"+matricula+"','"+tipovehiculo+"','"+modelo+"','"+color+"','"+idcliente+"')";
            
            PreparedStatement se= (PreparedStatement) cone.prepareStatement(sentencia_guardar);
            se.executeUpdate();
            
            
           
        } catch (Exception e) {
            System.out.println(e);
        }
       
    }
    
    public static String buscarempleado(String id, String contraseña)
    {
        String busqueda=null;
        Connection con=null;
        PreparedStatement sentencia;
        ResultSet resultado;
        try {
            con = conectar.conectar();
            String sentencia_buscar=("SELECT idempleado,contraseña FROM empleados WHERE idempleado = '"+id+"' && contraseña = '"+contraseña+"'");
            sentencia = (PreparedStatement) con.prepareStatement(sentencia_buscar);
            resultado = sentencia.executeQuery();
            if(resultado.next())
            {
                busqueda = "encontrado";
            }else
            {
                busqueda = "no encontrado";
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return busqueda;
    }
    public static String buscarmecanico(String id, String contraseña)
    {
        String busqueda=null;
        Connection con=null;
        PreparedStatement sentencia;
        ResultSet resultado;
        try {
            con = conectar.conectar();
            String sentencia_buscar=("SELECT idmecanico,contraseña FROM mecanicos WHERE idmecanico = '"+id+"' && contraseña = '"+contraseña+"'");
            sentencia = (PreparedStatement) con.prepareStatement(sentencia_buscar);
            resultado = sentencia.executeQuery();
            if(resultado.next())
            {
                busqueda = "encontrado";
            }else
            {
                busqueda = "no encontrado";
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return busqueda;
    }
    public static ResultSet llenartabla(String consulta)
    {
        String busqueda=null;
        Connection con=null;
        PreparedStatement sentencia;
        ResultSet resultado=null;
        Statement se;
        try {
            con= conectar.conectar();
            se = con.createStatement();
            resultado=se.executeQuery(consulta);
        } catch (Exception e) {
        }
        return resultado;
    }
    public void guardarasignado(String idmecanico, String idmatricula, String idcliente)
    {
        
        
        
        try {
            conectar c=new conectar();
            Connection cone=null;
            cone = conectar.conectar();
            String sentencia_guardar ="INSERT INTO mecanicoasignado (idmecanico,idmatricula,idcliente) VALUES ('"+idmecanico+"','"+idmatricula+"','"+idcliente+"')";
            
            PreparedStatement se= (PreparedStatement) cone.prepareStatement(sentencia_guardar);
            se.executeUpdate();
            
            
           
        } catch (Exception e) {
            System.out.println(e);
        }
       
    }
    public void guardarreporte(String descripcion, String tipo, String idrepuesto, int valor, String mecanico, String matricula, String cliente)
    {
        
        
        
        try {
            conectar c=new conectar();
            Connection cone=null;
            cone = conectar.conectar();
            String sentencia_guardar ="INSERT INTO reportes (descripción,tiposervicio,idrepuesto,valor,idmecanico,idmatricula,idcliente) VALUES ('"+descripcion+"','"+tipo+"','"+idrepuesto+"','"+valor+"','"+mecanico+"','"+matricula+"','"+cliente+"')";
            
            PreparedStatement se= (PreparedStatement) cone.prepareStatement(sentencia_guardar);
            se.executeUpdate();
            
            
           
        } catch (Exception e) {
            System.out.println(e);
        }
       
    }
    public void guardarcambio(String descripcion, int reporte, String repuesto)
    {
        
        
        
        try {
            conectar c=new conectar();
            Connection cone=null;
            cone = conectar.conectar();
            String sentencia_guardar ="INSERT INTO cambio (descripcion,idrepuesto) VALUES ('"+descripcion+"','"+repuesto+"')";
            
            PreparedStatement se= (PreparedStatement) cone.prepareStatement(sentencia_guardar);
            se.executeUpdate();
            
            
           
        } catch (Exception e) {
            System.out.println(e);
        }
       
    }
    public void guardarreparacion(String descripcion, int reporte)
    {
        
        
        
        try {
            conectar c=new conectar();
            Connection cone=null;
            cone = conectar.conectar();
            String sentencia_guardar ="INSERT INTO reparacion (descripción) VALUES ('"+descripcion+"')";
            
            PreparedStatement se= (PreparedStatement) cone.prepareStatement(sentencia_guardar);
            se.executeUpdate();
            
            
           
        } catch (Exception e) {
            System.out.println(e);
        }
       
    }
    public void guardardiagnostico(String descripcion, int reporte)
    {
        
        
        
        try {
            conectar c=new conectar();
            Connection cone=null;
            cone = conectar.conectar();
            String sentencia_guardar ="INSERT INTO diagnostico (analisis) VALUES ('"+descripcion+"')";
            
            PreparedStatement se= (PreparedStatement) cone.prepareStatement(sentencia_guardar);
            se.executeUpdate();
            
            
           
        } catch (Exception e) {
            System.out.println(e);
        }
       
    }
    public static ResultSet Buscarreporte()
    {
        String busqueda=null;
        Connection con=null;
        PreparedStatement sentencia;
        ResultSet resultado=null;
        Statement se;
        String consulta="SELECT MAX(idreporte) ultimo FROM reportes; ";
        try {
            con= conectar.conectar();
            se = con.createStatement();
            resultado=se.executeQuery(consulta);
        } catch (Exception e) {
        }
        return resultado;
    }
    public void eliminarasignado(int idasignado)
    {
        
        
        
        try {
            conectar c=new conectar();
            Connection cone=null;
            cone = conectar.conectar();
            String sentencia_guardar ="delete from mecanicoasignado where idasignado = '"+idasignado+"'";
            
            PreparedStatement se= (PreparedStatement) cone.prepareStatement(sentencia_guardar);
            se.executeUpdate();
            
            
           
        } catch (Exception e) {
            System.out.println(e);
        }
       
    }
    public void guardarfactura(String fecha, int valor, String matricula, String cliente, String mecanico, String repuesto)
    {
        
        
        
        try {
            conectar c=new conectar();
            Connection cone=null;
            cone = conectar.conectar();
            String sentencia_guardar ="INSERT INTO facturas (fecha,valor,idmatricula,idcliente,idmecanico,idrepuesto) VALUES ('"+fecha+"','"+valor+"','"+matricula+"','"+cliente+"','"+mecanico+"','"+repuesto+"')";
            
            PreparedStatement se= (PreparedStatement) cone.prepareStatement(sentencia_guardar);
            se.executeUpdate();
            
            
           
        } catch (Exception e) {
            System.out.println(e);
        }
       
    }
    public void eliminarvehiculo(String idmatricula)
    {
        
        
        
        try {
            conectar c=new conectar();
            Connection cone=null;
            cone = conectar.conectar();
            String sentencia_guardar ="delete from vehiculos where idmatricula = '"+idmatricula+"'";
            
            PreparedStatement se= (PreparedStatement) cone.prepareStatement(sentencia_guardar);
            se.executeUpdate();
            
            
           
        } catch (Exception e) {
            System.out.println(e);
        }
       
    }
     public void actualizarrepuesto(String idrepuesto, int cantidad)
    {
        
        
        
        try {
            conectar c=new conectar();
            Connection cone=null;
            cone = conectar.conectar();
            String sentencia_guardar ="update repuestos set cantidadstock  = '"+cantidad+"' where idrepuestos = '"+idrepuesto+"'";
            
            PreparedStatement se= (PreparedStatement) cone.prepareStatement(sentencia_guardar);
            se.executeUpdate();
            
            
           
        } catch (Exception e) {
            System.out.println(e);
        }
       
    }
     public void actualizarcliente(String id, String nombres, String apellidos, String direccion, String telefono, String tipocliente)
    {
        
        
        
        try {
            conectar c=new conectar();
            Connection cone=null;
            cone = conectar.conectar();
            String sentencia_guardar ="update clientes set idcliente  = '"+id+"',nombres  = '"+nombres+"',apellidos  = '"+apellidos+"',direccion  = '"+direccion+"',telefono  = '"+telefono+"',tipocliente  = '"+tipocliente+"' where idcliente = '"+id+"'";
            
            PreparedStatement se= (PreparedStatement) cone.prepareStatement(sentencia_guardar);
            se.executeUpdate();
            
            
           
        } catch (Exception e) {
            System.out.println(e);
        }
       
    }
     public void eliminarclientes(String id)
    {
        
        
        
        try {
            conectar c=new conectar();
            Connection cone=null;
            cone = conectar.conectar();
            String sentencia_guardar ="delete from clientes where idcliente = '"+id+"'";
            
            PreparedStatement se= (PreparedStatement) cone.prepareStatement(sentencia_guardar);
            se.executeUpdate();
            
            
           
        } catch (Exception e) {
            System.out.println(e);
        }
       
    }
     public void eliminarmecanico(String id)
    {
        
        
        
        try {
            conectar c=new conectar();
            Connection cone=null;
            cone = conectar.conectar();
            String sentencia_guardar ="delete from mecanicos where idmecanico = '"+id+"'";
            
            PreparedStatement se= (PreparedStatement) cone.prepareStatement(sentencia_guardar);
            se.executeUpdate();
            
            
           
        } catch (Exception e) {
            System.out.println(e);
        }
       
    }
     public void actualizarmecanicos(String id, String nombres, String apellidos, String direccion, String telefono, String contraseña, int sueldo)
    {
        
        
        
        try {
            conectar c=new conectar();
            Connection cone=null;
            cone = conectar.conectar();
            String sentencia_guardar ="update mecanicos set idmecanico  = '"+id+"',nombres  = '"+nombres+"',apellidos  = '"+apellidos+"',direccion  = '"+direccion+"',telefono  = '"+telefono+"',contraseña  = '"+contraseña+"',sueldo  = '"+sueldo+"' where idmecanico = '"+id+"'";
            
            PreparedStatement se= (PreparedStatement) cone.prepareStatement(sentencia_guardar);
            se.executeUpdate();
            
            
           
        } catch (Exception e) {
            System.out.println(e);
        }
       
    }
     public static String buscarmecanico2(String id)
    {
        String busqueda=null;
        Connection con=null;
        PreparedStatement sentencia;
        ResultSet resultado;
        try {
            con = conectar.conectar();
            String sentencia_buscar=("SELECT idmecanico FROM mecanicos WHERE idmecanico = '"+id+"'");
            sentencia = (PreparedStatement) con.prepareStatement(sentencia_buscar);
            resultado = sentencia.executeQuery();
            if(resultado.next())
            {
                busqueda = "encontrado";
            }else
            {
                busqueda = "no encontrado";
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return busqueda;
    }
    public void guardarmecanico(String id, String nombres, String apellidos, String direccion, String telefono, String contraseña, int sueldo)
    {
        
        
        
        try {
            conectar c=new conectar();
            Connection cone=null;
            cone = conectar.conectar();
            String sentencia_guardar ="INSERT INTO mecanicos VALUES ('"+id+"','"+nombres+"','"+apellidos+"','"+direccion+"','"+telefono+"','"+contraseña+"','"+sueldo+"')";
            
            PreparedStatement se= (PreparedStatement) cone.prepareStatement(sentencia_guardar);
            se.executeUpdate();
            
            
           
        } catch (Exception e) {
            System.out.println(e);
        }
       
    }
    public void eliminarempleado(String id)
    {
        
        
        
        try {
            conectar c=new conectar();
            Connection cone=null;
            cone = conectar.conectar();
            String sentencia_guardar ="delete from empleados where idempleado = '"+id+"'";
            
            PreparedStatement se= (PreparedStatement) cone.prepareStatement(sentencia_guardar);
            se.executeUpdate();
            
            
           
        } catch (Exception e) {
            System.out.println(e);
        }
       
    }
     public void actualizarempleado(String id, String nombres, String apellidos, String direccion, String telefono, String contraseña, int sueldo)
    {
        
        
        
        try {
            conectar c=new conectar();
            Connection cone=null;
            cone = conectar.conectar();
            String sentencia_guardar ="update empleados set idempleado  = '"+id+"',nombres  = '"+nombres+"',apellidos  = '"+apellidos+"',direccion  = '"+direccion+"',telefono  = '"+telefono+"',contraseña  = '"+contraseña+"',sueldo  = '"+sueldo+"' where idmecanico = '"+id+"'";
            
            PreparedStatement se= (PreparedStatement) cone.prepareStatement(sentencia_guardar);
            se.executeUpdate();
            
            
           
        } catch (Exception e) {
            System.out.println(e);
        }
       
    }
     public static String buscarempleado2(String id)
    {
        String busqueda=null;
        Connection con=null;
        PreparedStatement sentencia;
        ResultSet resultado;
        try {
            con = conectar.conectar();
            String sentencia_buscar=("SELECT idempleado FROM empleados WHERE idempleado = '"+id+"'");
            sentencia = (PreparedStatement) con.prepareStatement(sentencia_buscar);
            resultado = sentencia.executeQuery();
            if(resultado.next())
            {
                busqueda = "encontrado";
            }else
            {
                busqueda = "no encontrado";
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return busqueda;
    }
    public void guardarempleado(String id, String nombres, String apellidos, String direccion, String telefono, String contraseña, int sueldo)
    {
        
        
        
        try {
            conectar c=new conectar();
            Connection cone=null;
            cone = conectar.conectar();
            String sentencia_guardar ="INSERT INTO empleados VALUES ('"+id+"','"+nombres+"','"+apellidos+"','"+direccion+"','"+telefono+"','"+contraseña+"','"+sueldo+"')";
            
            PreparedStatement se= (PreparedStatement) cone.prepareStatement(sentencia_guardar);
            se.executeUpdate();
            
            
           
        } catch (Exception e) {
            System.out.println(e);
        }
       
    }
    public void actualizarvehiculo(String id, String modelo, String color, String idcliente)
    {
        
        
        
        try {
            conectar c=new conectar();
            Connection cone=null;
            cone = conectar.conectar();
            String sentencia_guardar ="update vehiculosreg set idmatricula  = '"+id+"',modelo  = '"+modelo+"',color  = '"+color+"',idcliente  = '"+idcliente+"' where idmatricula = '"+id+"'";
            
            PreparedStatement se= (PreparedStatement) cone.prepareStatement(sentencia_guardar);
            se.executeUpdate();
            
            
           
        } catch (Exception e) {
            System.out.println(e);
        }
       
    }
    public void eliminarvehiculoreg(String id)
    {
        
        
        
        try {
            conectar c=new conectar();
            Connection cone=null;
            cone = conectar.conectar();
            String sentencia_guardar ="delete from vehiculosreg where idmatricula= '"+id+"'";
            
            PreparedStatement se= (PreparedStatement) cone.prepareStatement(sentencia_guardar);
            se.executeUpdate();
            
            
           
        } catch (Exception e) {
            System.out.println(e);
        }
       
    }
    public void actualizardistribuidor(String id, String nombre, String localidad, String telefono, String email)
    {
        
        
        
        try {
            conectar c=new conectar();
            Connection cone=null;
            cone = conectar.conectar();
            String sentencia_guardar ="update distribuidor set iddistribuidor  = '"+id+"',nombre  = '"+nombre+"',localidad  = '"+localidad+"',telefono  = '"+telefono+"',email  = '"+email+"' where iddistribuidor = '"+id+"'";
            
            PreparedStatement se= (PreparedStatement) cone.prepareStatement(sentencia_guardar);
            se.executeUpdate();
            
            
           
        } catch (Exception e) {
            System.out.println(e);
        }
       
    }
    public void eliminardistribuidor(String id)
    {
        
        
        
        try {
            conectar c=new conectar();
            Connection cone=null;
            cone = conectar.conectar();
            String sentencia_guardar ="delete from destribuidor where iddistribuidor= '"+id+"'";
            
            PreparedStatement se= (PreparedStatement) cone.prepareStatement(sentencia_guardar);
            se.executeUpdate();
            
            
           
        } catch (Exception e) {
            System.out.println(e);
        }
       
    }
     public static String buscardistribuidor(String id)
    {
        String busqueda=null;
        Connection con=null;
        PreparedStatement sentencia;
        ResultSet resultado;
        try {
            con = conectar.conectar();
            String sentencia_buscar=("SELECT iddistribuidor FROM distribuidor WHERE iddistribuidor = '"+id+"'");
            sentencia = (PreparedStatement) con.prepareStatement(sentencia_buscar);
            resultado = sentencia.executeQuery();
            if(resultado.next())
            {
                busqueda = "encontrado";
            }else
            {
                busqueda = "no encontrado";
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return busqueda;
    }
    public void guardardistribuidor(String id, String nombre, String localidad, String telefono, String email)
    {
        
        
        
        try {
            conectar c=new conectar();
            Connection cone=null;
            cone = conectar.conectar();
            String sentencia_guardar ="INSERT INTO distribuidor VALUES ('"+id+"','"+nombre+"','"+localidad+"','"+telefono+"','"+email+"')";
            
            PreparedStatement se= (PreparedStatement) cone.prepareStatement(sentencia_guardar);
            se.executeUpdate();
            
            
           
        } catch (Exception e) {
            System.out.println(e);
        }
       
    }
    public static String buscarrepuesto(String id)
    {
        String busqueda=null;
        Connection con=null;
        PreparedStatement sentencia;
        ResultSet resultado;
        try {
            con = conectar.conectar();
            String sentencia_buscar=("SELECT idrepuestos FROM repuestos WHERE idrepuestos = '"+id+"'");
            sentencia = (PreparedStatement) con.prepareStatement(sentencia_buscar);
            resultado = sentencia.executeQuery();
            if(resultado.next())
            {
                busqueda = "encontrado";
            }else
            {
                busqueda = "no encontrado";
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return busqueda;
    }
    public void guardarrepuesto(String id, String marca, String modelo, String referencia, int precio, int valor, int cantidad, String iddistribuidor)
    {
        
        
        
        try {
            conectar c=new conectar();
            Connection cone=null;
            cone = conectar.conectar();
            String sentencia_guardar ="INSERT INTO repuestos VALUES ('"+id+"','"+marca+"','"+modelo+"','"+referencia+"','"+precio+"','"+valor+"','"+cantidad+"','"+iddistribuidor+"')";
            
            PreparedStatement se= (PreparedStatement) cone.prepareStatement(sentencia_guardar);
            se.executeUpdate();
            
            
           
        } catch (Exception e) {
            System.out.println(e);
        }
       
    }
     public void actualizarrepuesto(String id, String marca, String modelo, String referencia, int precio, int valor, int cantidad, String iddistribuidor)
    {
        
        
        
        try {
            conectar c=new conectar();
            Connection cone=null;
            cone = conectar.conectar();
            String sentencia_guardar ="update repuestos set marca  = '"+marca+"',modelo  = '"+modelo+"',referencia  = '"+referencia+"',preciounidad = '"+precio+"',valor = '"+valor+"',cantidadstock = '"+cantidad+"',iddistribuidor = '"+iddistribuidor+"' where idrepuestos = '"+id+"'";
            
            PreparedStatement se= (PreparedStatement) cone.prepareStatement(sentencia_guardar);
            se.executeUpdate();
            
            
           
        } catch (Exception e) {
            System.out.println(e);
        }
       
    }
     public void guardarpedido(String idd, String idr, int cantidad)
    {
        
        
        
        try {
            conectar c=new conectar();
            Connection cone=null;
            cone = conectar.conectar();
            String sentencia_guardar ="INSERT INTO pedido (iddistribuidor,idrepuesto,cantidad) VALUES ('"+idd+"','"+idr+"','"+cantidad+"')";
            
            PreparedStatement se= (PreparedStatement) cone.prepareStatement(sentencia_guardar);
            se.executeUpdate();
            
            
           
        } catch (Exception e) {
            System.out.println(e);
        }
       
    }
     public void eliminarreporte(int id)
    {
        
        
        
        try {
            conectar c=new conectar();
            Connection cone=null;
            cone = conectar.conectar();
            String sentencia_guardar ="delete from reportes where idreporte= '"+id+"'";
            
            PreparedStatement se= (PreparedStatement) cone.prepareStatement(sentencia_guardar);
            se.executeUpdate();
            
            
           
        } catch (Exception e) {
            System.out.println(e);
        }
       
    }
    
}
