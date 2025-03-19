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
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        
        int totalleidos=0;
        int pares=0;
        int numeroscon5=0;
        
        while(pares < 100 && numeroscon5 <80){
            System.out.print("Ingrese un número positivo: ");
            int num=entrada.nextInt();
            
            if(num < 0){
                System.out.println("Solo se permiten los números positivos.");
                continue;
            }
            totalleidos++;
            
            if(num % 2 == 0){
                pares++;
            }
            
            int numeroaux =num;
            
            while(numeroaux > 0){
                if(numeroaux % 10 == 5){
                    numeroscon5++;
                    break;
                }
            
                numeroaux/=10;
            }
        }
            
        System.out.println("Total de números leídos: "+totalleidos);
        System.out.println("Total de números pares encontrados: "+pares);
        System.out.println("Total de números con digito 5: "+numeroscon5);
            
    }        
      
}
