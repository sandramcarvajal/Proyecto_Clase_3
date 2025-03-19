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
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
                
        System.out.print("Ingrese tres números separados por espacios: ");
            int n1=entrada.nextInt(); 
            int n2=entrada.nextInt();
            int n3=entrada.nextInt();
        
        //Se usa condicional para claseficar los números según su orden
         if(n1 < n2 && n2 < n3){
             System.out.print("\n"+n1+", "+n2+", "+n3+". ");
             System.out.println("Los números estan incrementando");
         }
         else if (n1 > n2 && n2 > n3){
             System.out.print("\n"+n1+", "+n2+", "+n3+". ");
             System.out.println("Los números estan disminuyendo");
         }
         else{
             System.out.print("\n"+n1+", "+n2+", "+n3+". ");
             System.out.println("Los números ni se incrementa ni se disminuye");
         }
            
        
        
    }
    
}
