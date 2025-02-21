/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author APRENDIZ
 */
public class Contructor {
    public String nombreTitular;
    public String apellidoTitular;
    public int numeroCuenta;
    public int tipoCuenta;
    public String contrasena;
    private static List<Contructor> usuarios = new ArrayList<>();


    public void agregarUsuario(Contructor usuario) {
        usuarios.add(usuario);
        JOptionPane.showMessageDialog(null, "Usuario agregado exitosamente!");
    }
    
    public Contructor(String nombreTitular, String apellidoTitular, int numeroCuenta, int tipoCuenta, String contrasena) {
        this.nombreTitular = nombreTitular;
        this.apellidoTitular = apellidoTitular;
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.contrasena = contrasena;
    }
    

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public String getApellidoTitular() {
        return apellidoTitular;
    }

    public void setApellidoTitular(String apellidoTitular) {
        this.apellidoTitular = apellidoTitular;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(int tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }
    
    public int generarTarjeta(){
    
    int numTarjeta =(int) (Math.random() * (10000000 - 1000000 + 1) + 1000000);
    
        JOptionPane.showMessageDialog(null, "Su numero de tarjeta es: " + numTarjeta + "\n NO LO PIERDA");
        
    return numTarjeta;
    }
    
    public void mostrarUsuarios() {
        for (Contructor usuario : usuarios) {
            JOptionPane.showMessageDialog(null, "Usuario: " + usuario.getNombreTitular() + " " + usuario.getApellidoTitular());
        }
    }
    
    
    public Contructor validarUsuario(int numCuenta, String contrasena) {
    for (Contructor usuario : usuarios) {
        if (usuario.getNumeroCuenta() == numCuenta && usuario.getContrasena().equals(contrasena)) {
            return usuario; // Usuario encontrado
        }
    }
    return null; // No se encuentra el usuario
}
    
}
