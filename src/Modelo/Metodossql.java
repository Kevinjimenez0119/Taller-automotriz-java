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
    public static String buscarvehiculo(String matricula, String fechas)
    {
        String busqueda=null;
        Connection con=null;
        PreparedStatement sentencia;
        ResultSet resultado;
        try {
            con = conectar.conectar();
            String sentencia_buscar=("SELECT idmatricula FROM vehiculos WHERE idmatricula = '"+matricula+"' and fechasalida = '"+0+"'");
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
    public void guardarvehiculo(String matricula, String tipovehiculo, String modelo, String color, String fecha,String fechas, String idcliente)
    {
        
        
        
        try {
            conectar c=new conectar();
            Connection cone=null;
            cone = conectar.conectar();
            String sentencia_guardar ="INSERT INTO vehiculos VALUES ('"+matricula+"','"+tipovehiculo+"','"+modelo+"','"+color+"','"+fecha+"','"+fechas+"','"+idcliente+"')";
            
            PreparedStatement se= (PreparedStatement) cone.prepareStatement(sentencia_guardar);
            se.executeUpdate();
            
            
           
        } catch (Exception e) {
            System.out.println(e);
        }
       
    }
    public void guardarcompra(String repuesto, int factura, int valor)
    {
        
        
        
        try {
            conectar c=new conectar();
            Connection cone=null;
            cone = conectar.conectar();
            String sentencia_guardar ="INSERT INTO comprar (idrepuestos,idfactura,valor) VALUES ('"+repuesto+"','"+factura+"','"+valor+"')";
            
            PreparedStatement se= (PreparedStatement) cone.prepareStatement(sentencia_guardar);
            se.executeUpdate();
            
            
           
        } catch (Exception e) {
            System.out.println(e);
        }
       
    }
    public void actualizavehiculo2(String matricula, String fechas)
    {
        
        
        
        try {
            conectar c=new conectar();
            Connection cone=null;
            cone = conectar.conectar();
            String sentencia_guardar ="update vehiculos set fechasalida  = '"+fechas+"' where idmatricula = '"+matricula+"'";
            
            PreparedStatement se= (PreparedStatement) cone.prepareStatement(sentencia_guardar);
            se.executeUpdate();
            
            
           
        } catch (Exception e) {
            System.out.println(e);
        }
       
        
    }
     public void actualizafactura(int id, int valor)
    {
        
        
        
        try {
            conectar c=new conectar();
            Connection cone=null;
            cone = conectar.conectar();
            String sentencia_guardar ="update facturas set valor  = '"+valor+"' where idfactura = '"+id+"'";
            
            PreparedStatement se= (PreparedStatement) cone.prepareStatement(sentencia_guardar);
            se.executeUpdate();
            
            
           
        } catch (Exception e) {
            System.out.println(e);
        }
       
        
    }
    public void actualizacomprar(int id, int idfactura)
    {
        
        
        
        try {
            conectar c=new conectar();
            Connection cone=null;
            cone = conectar.conectar();
            String sentencia_guardar ="update comprar set idfactura  = '"+idfactura+"' where idcompra = '"+id+"'";
            
            PreparedStatement se= (PreparedStatement) cone.prepareStatement(sentencia_guardar);
            se.executeUpdate();
            
            
           
        } catch (Exception e) {
            System.out.println(e);
        }
       
        
    }
    public void actualizareporte(int reporte, int chec)
    {
        
        
        
        try {
            conectar c=new conectar();
            Connection cone=null;
            cone = conectar.conectar();
            String sentencia_guardar ="update reportes set checkeado  = '"+chec+"' where idreporte = '"+reporte+"'";
            
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
    public void guardarasignado(String idmecanico, String idmatricula, String idcliente, int revisado)
    {
        
        
        
        try {
            conectar c=new conectar();
            Connection cone=null;
            cone = conectar.conectar();
            String sentencia_guardar ="INSERT INTO mecanicoasignado (idmecanico,idmatricula,idcliente,revisado) VALUES ('"+idmecanico+"','"+idmatricula+"','"+idcliente+"','"+revisado+"')";
            
            PreparedStatement se= (PreparedStatement) cone.prepareStatement(sentencia_guardar);
            se.executeUpdate();
            
            
           
        } catch (Exception e) {
            System.out.println(e);
        }
       
    }
    public void actualizaasignado(String idasignado, int revision)
    {
        
        
        
        try {
            conectar c=new conectar();
            Connection cone=null;
            cone = conectar.conectar();
            String sentencia_guardar ="update mecanicoasignado set revisado  = '"+revision+"' where idasignado = '"+idasignado+"'";
            
            PreparedStatement se= (PreparedStatement) cone.prepareStatement(sentencia_guardar);
            se.executeUpdate();
            
            
           
        } catch (Exception e) {
            System.out.println(e);
        }
       
    }
    public void guardarreporte(String descripcion, String tipo, int valor, String mecanico, String matricula, String cliente, int chec)
    {
        
        
        
        try {
            conectar c=new conectar();
            Connection cone=null;
            cone = conectar.conectar();
            String sentencia_guardar ="INSERT INTO reportes (descripción,tiposervicio,valor,idmecanico,idmatricula,idcliente,checkeado) VALUES ('"+descripcion+"','"+tipo+"','"+valor+"','"+mecanico+"','"+matricula+"','"+cliente+"','"+chec+"')";
            
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
    
    public void guardarfactura(String fecha, int valor, String matricula, String cliente, String mecanico)
    {
        
        
        
        try {
            conectar c=new conectar();
            Connection cone=null;
            cone = conectar.conectar();
            String sentencia_guardar ="INSERT INTO facturas (fecha,valor,idmatricula,idcliente,idmecanico) VALUES ('"+fecha+"','"+valor+"','"+matricula+"','"+cliente+"','"+mecanico+"')";
            
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
     public static String buscarfactura(int id)
    {
        String busqueda=null;
        Connection con=null;
        PreparedStatement sentencia;
        ResultSet resultado;
        try {
            con = conectar.conectar();
            String sentencia_buscar=("SELECT idfactura FROM facturas WHERE idfactura = '"+id+"'");
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
    public void guardarrepuesto(String id, String marca, String modelo, String referencia, int valor, int cantidad, String iddistribuidor)
    {
        
        
        
        try {
            conectar c=new conectar();
            Connection cone=null;
            cone = conectar.conectar();
            String sentencia_guardar ="INSERT INTO repuestos VALUES ('"+id+"','"+marca+"','"+modelo+"','"+referencia+"','"+valor+"','"+cantidad+"','"+iddistribuidor+"')";
            
            PreparedStatement se= (PreparedStatement) cone.prepareStatement(sentencia_guardar);
            se.executeUpdate();
            
            
           
        } catch (Exception e) {
            System.out.println(e);
        }
       
    }
     public void actualizarrepuesto(String id, String marca, String modelo, String referencia, int valor, int cantidad, String iddistribuidor)
    {
        
        
        
        try {
            conectar c=new conectar();
            Connection cone=null;
            cone = conectar.conectar();
            String sentencia_guardar ="update repuestos set marca  = '"+marca+"',modelo  = '"+modelo+"',referencia  = '"+referencia+"',valor = '"+valor+"',cantidadstock = '"+cantidad+"',iddistribuidor = '"+iddistribuidor+"' where idrepuestos = '"+id+"'";
            
            PreparedStatement se= (PreparedStatement) cone.prepareStatement(sentencia_guardar);
            se.executeUpdate();
            
            
           
        } catch (Exception e) {
            System.out.println(e);
        }
       
    }
     public void guardarpedido(String idd, String idr, int cantidad, String marca, String modelo, String referencia, int preciounidad, int valor)
    {
        
        
        
        try {
            conectar c=new conectar();
            Connection cone=null;
            cone = conectar.conectar();
            String sentencia_guardar ="INSERT INTO pedido (iddistribuidor,idrepuesto,cantidad,marca,modelo,referencia,preciounidad,valor) VALUES ('"+idd+"','"+idr+"','"+cantidad+"','"+marca+"','"+modelo+"','"+referencia+"','"+preciounidad+"','"+valor+"')";
            
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
