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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        
        System.out.print("Ingrese un número: ");
        int numero=entrada.nextInt();
        
        //Si la condición se cumple se ejcuta una acción sino se ejecuta otra acción
        if (numero % 2==0){
            System.out.print("El número es par-");
            
        } else{
            System.out.print("El número es impar-");
        }
            
        if (numero >= 0){
            System.out.println("positivo");
            
        } else{
            System.out.println("negativo");
        }
    }
    
}
