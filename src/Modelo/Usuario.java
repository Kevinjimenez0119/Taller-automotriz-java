/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author USUARIO
 */
public class Usuario {
    String correo;
    String contraseña;
    int codigo;


    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Usuario(String correo, String contraseña, int codigo) {
        this.correo = correo;
        this.contraseña = contraseña;
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public Usuario()
    {
        
    }
    public void codigo()
    {
        int numero = (int)(Math.random()*9999+1000);
        setCodigo(numero);
    }
}
    

