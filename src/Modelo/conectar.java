/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import sun.rmi.server.InactiveGroupException;
/**
 *
 * @author USUARIO
 */
public class conectar {
    
    
    public static Connection conectar()
    {
        com.mysql.jdbc.Connection conexion=null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost/proyectobases", "root", "");
            System.out.println("conexion establecida");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        return conexion;
    }
}
