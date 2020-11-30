/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.menu.principal;

import java.util.Scanner;

/**
 *
 * @author DAM111
 */
public class CalculosComplejos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce una opcion");
        System.out.println("Si es  primo");
        System.out.println("Raiz cuadrada");
        System.out.println("Elevar al cuadrado");
        int opcion=teclado.nextInt();
        
        do{
            switch(opcion){
                case 1: 
                    System.out.println("Introduce un numero: ");
                    int num1=teclado.nextInt();
                    for (int i=0;i<=num1;i++)
                        if (num1%i>=0){
                            System.out.println(num1+ " no es un numero primo");
                        }else
                            System.out.println(num1+" es primo");
                    break;
                case 2: 
                    System.out.println("Introduce un numero: ");
                    double num2=teclado.nextInt();
                    num2=Math.sqrt(num2);
                    
                    break;
                case 3: 
                    System.out.println("Introduce un numero: ");
                    double num3=teclado.nextInt();
                    num3=Math.pow(num3,2);
                    break;
                case 4: 
                   
                    
                        
                            
                    break;
                    
                    
                
        
    }
             
        }while(opcion!=4);

    }
    
}
