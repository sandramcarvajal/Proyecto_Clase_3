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
public class Ejercicio8 {
    //El método devuelve true si es un palíndromo y false si no lo es.
    public static boolean esPalindromo(String texto){
        
//Convierte todo a minúsculas (toLowerCase().Invierte el texto con StringBuilder.reverse().Compara el original con el invertido (equals()).
        texto = texto.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        String invertido = new StringBuilder(texto).reverse().toString();
        return texto.equals(invertido);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        
        System.out.print("Ingrese una frase: ");
        String texto=entrada.nextLine();
        
        //Se usa if para tomar una desicion según el resultado de la función
        if(esPalindromo(texto)){
            System.out.println("La frase es un palíndromo");
        }
        else{
            System.out.println("La frase no es palíndromo");
        }
  
        
        
    }
    
}
