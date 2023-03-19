
package Repeticao;
import java.util.Scanner;
public class App {
 
    public static void main(String[] args) {
   
        char permissao = 's';
        Scanner leitorScanner = new Scanner(System.in);
        
        
        while(permissao == 's' || permissao == 'S'){
            System.out.println("Digite um número:");
            int numero = leitorScanner.nextInt();
            if(numero == 0){
                System.out.println("Este número é igual a 0");
            }else{
               if(numero >0){
                   System.out.println("Este numero é maior que 0");
               }else{
                   System.out.println("Este numero é menor que 0");
                   
               }
            }
            System.out.println("Deseja continuar digite s p/ sim ou n p/ não?");
            permissao = leitorScanner.next().charAt(0);
        }
}
}