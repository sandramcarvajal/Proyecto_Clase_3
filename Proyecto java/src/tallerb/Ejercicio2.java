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
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.print("Ingrese el valor de x1: ");
        double x1=entrada.nextDouble();
        
        System.out.print("Ingrese el valor de y1: ");
        double y1=entrada.nextDouble();
        
        System.out.print("Ingrese el valor de x2: ");
        double x2=entrada.nextDouble();
        
        System.out.print("Ingrese el valor de y2: ");
        double y2=entrada.nextDouble();
        
        //Utilice las librerias Math.sqrt para raíz y Math.pow para exponente
        double distancia= Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
        
        System.out.println("La distancia entre los puntos es: "+distancia);
        
        
        
    }
    
}
