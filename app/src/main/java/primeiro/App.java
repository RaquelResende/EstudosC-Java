/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package primeiro;

import java.util.Scanner;
public class App {
  
    public static void main(String[] args) {
         int numero;

       Scanner leitorScanner = new Scanner(System.in);
       System.out.println("Digite um numero");
       
       numero = leitorScanner.nextInt();
       
       if(numero>=10 && numero <= 20){
           System.out.println("Número válido");
       }else{
           System.out.println("Número inválido");
       }
       
        
    }
}
