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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        
        System.out.print("Ingrese los segundos: ");
        int segundos=entrada.nextInt();
        
        int horas=segundos/3600;
        int minutos=(segundos%3600)/60;
        int seg=(segundos%60);
        
        System.out.println("Si son "+segundos);
        System.out.println("Resultado: "+horas+":"+minutos+":"+seg);
        
        
        
    }
    
}
