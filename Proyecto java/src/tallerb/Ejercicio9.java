/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tallerb;

import java.util.Scanner;

/**
 *
 * @author javier
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        
        int contador=0;
        int numero=1;
        
        //Se usa la condición while, mientras el contador sea menor de 10 sigue ejecutando
        while (contador<10){
            System.out.println(numero);
        
            numero+=2;
            contador++;
        }
    
    }
    
}
