package Modelo;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

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

    public int generarTarjeta() {
        int numTarjeta = (int) (Math.random() * (10000000 - 1000000 + 1) + 1000000);
        JOptionPane.showMessageDialog(null, "Su numero de tarjeta es: " + numTarjeta + "\n NO LO PIERDA");
        return numTarjeta;
    }

    public static List<String> mostrarUsuarios() {
        List<String> resultado = new ArrayList<>();
        for (Contructor usuario : usuarios) {
            String usuarioFinal = String.format("Nombre: %s Apellido: %s Numero Cuenta: %d Tipo de Cuenta: %d Contraseña: %s Saldo: %d", 
                usuario.getNombreTitular(), 
                usuario.getApellidoTitular(), 
                usuario.getNumeroCuenta(), 
                usuario.getTipoCuenta(),  
                usuario.getContrasena(),
                usuario.getSaldo());
            resultado.add(usuarioFinal);
        }
        return resultado;
    }

public static Contructor validarUsuario(int numCuenta, String contrasena, int tipoCuenta) {
        // Buscar en la lista de usuarios si el número de cuenta y la contraseña coinciden
        for (Contructor usuario : usuarios) {
            if (usuario.getNumeroCuenta()== numCuenta && usuario.getContrasena().equals(contrasena) && usuario.getTipoCuenta() == tipoCuenta) {
                return usuario;  // Retorna el usuario validado
            }
        }
        return null;  // Si no se encuentra, retorna null
    }

    public static void agregarUsuarioPorDefecto() {
        Contructor usuarioPorDefecto = new Contructor("Admin", "Admin", 12345678, 3, "Florez1", 1000000);
        usuarios.add(usuarioPorDefecto);
    }

public static int[] consultarSaldo(int numCuenta) {
    for (Contructor usuario : usuarios) {
        if (numCuenta == usuario.getNumeroCuenta()) {
            // Retorna un arreglo donde el primer valor es el saldo y el segundo el número de cuenta
            return new int[]{usuario.getSaldo(), usuario.getNumeroCuenta()};
        }
    }
    return new int[]{0, 0};  // Retorna un arreglo con 0 si no se encuentra el usuario
}

    
    public static int consultarNumero(int numCuenta) {
        for (Contructor usuario : usuarios) {
            if (numCuenta == usuario.getNumeroCuenta()) {
                return usuario.getSaldo();
            }
        }
        return 0;  // Retorna 0 si no se encuentra el usuario
    }
    
    public static List<Contructor> getUsuarios() {
    return usuarios;
}

    
}
