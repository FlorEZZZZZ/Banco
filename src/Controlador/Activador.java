/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Contructor;
import View.Primer_Paso;

/**
 *
 * @author APRENDIZ
 */
public class Activador {
    public static void main(String args[]) {
    
        Contructor.agregarUsuarioPorDefecto();
        Primer_Paso pp = new Primer_Paso();
        pp.setVisible(true);
    
    }
    
}
