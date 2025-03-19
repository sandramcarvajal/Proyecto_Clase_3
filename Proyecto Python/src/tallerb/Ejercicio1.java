/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tallerb;

import java.util.Scanner;

/**
 *
 * @author estudiante.upb
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.print("Ingrese la masa del objeto en kg: ");
        double masa=entrada.nextDouble();
        
        System.out.print("Ingrese la velocidad del objeto en m/s: ");
        double velocidad=entrada.nextDouble();
        
        //Utilice la libreria Math.pow para exponente
        double energiacinetica= 0.5*masa*velocidad*Math.pow(velocidad,2);
        
        System.out.println("La energía cinética es "+energiacinetica+ " jules");
        
    }
    
}
