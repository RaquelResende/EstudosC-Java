
package ExRepeticaoFor;
import java.util.Scanner;
public class App {
    

    public static void main(String[] args) {
        String produto;
        float precoCusto;
        float precoVenda;
        
        float totalCusto= 0.0f;
        float totalVenda = 0.0f;
        Scanner leitorScanner = new Scanner(System.in);
        
        int i = 0;
        for(;i<3;i++){
        System.out.println("Digite o nome do produto:");
        produto = leitorScanner.nextLine();
        
        System.out.println("Digite o preço de custo:");
        precoCusto = leitorScanner.nextFloat();
        
        System.out.println("Digite o preço de venda:");
        precoVenda = leitorScanner.nextFloat();
       
        totalCusto = totalCusto + precoCusto;
        totalVenda = totalVenda + precoVenda; 
        
        if(precoCusto == precoVenda){
            System.out.println("Empate com preço de custo c/ da venda");
        }else{
            if(precoCusto > precoVenda){
                System.out.println("Prejuiso");
                
            }else{
                System.out.println("Lucro");
            }
                
            }
             System.out.println("O total de venda é de:"+totalVenda+ 
                     "e o total do custo é de:" +totalCusto);
        }
        System.out.println("A média do preço de custo é:" + (totalCusto/i));
            System.out.println("A média do preço da venda é :" + (totalVenda/i));
     
       
    }
   
}
