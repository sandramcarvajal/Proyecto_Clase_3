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
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        
        System.out.print("Ingrese el valor de n: ");
        int n=entrada.nextInt();
        
        System.out.print("Ingrese el valor de m: ");
        int m=entrada.nextInt();
        
        //Se usa la condicion if para que se cumpla y una variable para almacenar la suma
        if(m<=n){
            System.out.println("Error: m debe ser mayor a n.");
        }
        else{
            int suma=0;
            
        //Se usa bucle for para recorrer todos los numeros entre n y m y sumandolos
            for (int i = n+1; i < m; i++) {
                suma+=i;
            }
            
            System.out.println("La suma de los números entre "+n+ " y "+m+" es: "+suma);
            
        }
    }
    
}
