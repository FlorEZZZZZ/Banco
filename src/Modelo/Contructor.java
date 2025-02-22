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
    public int Saldo;
    private static List<Contructor> usuarios = new ArrayList<>();
    


    public void agregarUsuario(Contructor usuario) {
        
        usuarios.add(usuario);
        JOptionPane.showMessageDialog(null, "Usuario agregado exitosamente!");
    }

    public Contructor(String nombreTitular, String apellidoTitular, int numeroCuenta, int tipoCuenta, String contrasena, int Saldo) {
        this.nombreTitular = nombreTitular;
        this.apellidoTitular = apellidoTitular;
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.contrasena = contrasena;
        this.Saldo = Saldo;
    }
    
   

    public int getSaldo() {
        return Saldo;
    }

    public void setSaldo(int Saldo) {
        this.Saldo = Saldo;
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
    
public static List<String> mostrarUsuarios() {
    List<String> resultado = new ArrayList<>();  
    for (Contructor usuario : usuarios) {
        String usuarioFinal = String.format("Nombre: %s Apellido: %s Numero Cuenta: %d Tipo de Cuenta: %d Contraseña: %s", 
            usuario.getNombreTitular(), 
            usuario.getApellidoTitular(), 
            usuario.getNumeroCuenta(), 
            usuario.getTipoCuenta(),  
            usuario.getContrasena());
        
        resultado.add(usuarioFinal);  // Agregar el usuario a la lista
    }
    return resultado;
}
    
    
    public Contructor validarUsuario(int numCuenta, String contrasena, int tipoCuenta) {
    for (Contructor usuario : usuarios) {
        if (usuario.getNumeroCuenta() == numCuenta && usuario.getContrasena().equals(contrasena) && usuario.getTipoCuenta() == tipoCuenta) {
            return usuario; 
        }
    }
    return null; 
}
    
    public static void agregarUsuarioPorDefecto() {
        // acá creo un usuario "Administrador" con el tipo de cuenta 3
        Contructor usuarioPorDefecto = new Contructor("Admin", "Admin", 00000000, 3, "Florez1", 1000000);
        
        usuarios.add(usuarioPorDefecto);
         }
    
}
