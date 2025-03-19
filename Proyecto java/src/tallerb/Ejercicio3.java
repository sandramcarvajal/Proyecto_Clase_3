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
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        
        System.out.print("Ingrese un digito: ");
        int n=entrada.nextInt();
        
        //Utilice la libreria Integer.parseInt para convertir una cadena de texto(String) en un número entero(int)
        int nn=Integer.parseInt(""+n+n);
        
        int nnn=Integer.parseInt(""+n+n+n);
        
        int suma=n+nn+nnn;
        
        System.out.println("Numeros generados: "+n+ ", " +nn+ " y "+nnn);
        System.out.println("La suma total es: "+suma);
        
       
        
        
        
        
    }
    
}
