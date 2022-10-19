/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerocomplejos;

import java.util.Scanner;

/**
 *
 * @author SALA I
 */
public class NumeroComplejos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int menu=0;
        Complejo num1=new Complejo();
        Complejo num2=new Complejo();
        Scanner leer=new Scanner(System.in);
       System.out.println("Ingrese el primer numero Complejo");
       System.out.println("Ingrese la parte real");
       num1.setReal(leer.nextInt());
       System.out.println("Ingrese la ´parte imaginaria");
       num1.setImagnaria(leer.nextInt());
       System.out.println("Ingrese el Segundo numero Complejo");
        System.out.println("Ingrese la parte real");
       num2.setReal(leer.nextInt());
       System.out.println("Ingrese la ´parte imaginaria");
       num2.setImagnaria(leer.nextInt());
       
       while (menu!=3){
       System.out.println("Menu");
       System.out.println("1. Suma");
       System.out.println("2. Resta");
       System.out.println("3. Salir");
       System.out.println("Ingrese su opcion");
       menu=leer.nextInt();
          
       switch (menu) {

         case 1:
             Operaciones opera=new Operaciones(num1, num2);
             opera.Sumar();
             opera.Imprimir();
             break;
         case 2:           
               Operaciones opera1=new Operaciones(num1, num2);
               opera1.Restar();
               opera1.Imprimir();
               break;
         case 3:           
                System.out.println("Saliendo......");
               break;

         default:

             
        }
           
           
           
       }
    
    }
}
