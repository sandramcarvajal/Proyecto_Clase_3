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
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        
        //Primero se declaran las variables y array
        double [] notas=new double[5];
        double [] pesos={0.15,0.20,0.15,0.30,0.20};
        double notafinal=0;
        
        //Uso un bucle para pedir las 5 notas
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Ingrese la nota "+(i+1)+": ");
            notas [i]=entrada.nextDouble();
            notafinal+=notas[i]*pesos[i];
        }
        
        //Se imprime con el formato %.2f función para printf
        System.out.printf("Nota final: %.2f", notafinal);
        
        //Se evalua la nota final
        if(notafinal<2){
            System.out.println(". No puede habilitar");
        }
        else if(notafinal<3){
            System.out.println(". Reprobó");
        }
        else if(notafinal<4.4){
            System.out.println(". Aprobó");
        }else{
            System.out.println(". Feicitaciones por tus buenas calificaciones. ");
        }
        
        
        
        
    }
    
}
