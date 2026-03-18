import java.util.Locale;
import java.util.Scanner;

public class CalculadoraApp {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         Double valorUm;
         Double valorDois;
         String operacao;
         boolean continuar;

         do {
             System.out.println("digite o valor um:");
             valorUm = scanner.nextDouble();

             System.out.println("digite a operação ( +, -, /, *): ");
             operacao = scanner.next();

             System.out.println("digite o valor dois:");
             valorDois = scanner.nextDouble();

             System.out.println("resultado: " + realizarCauculo(valorUm, valorDois, operacao));

             continuar = verificarNovaOperacao();
         }while (continuar);


    }
    public static  boolean verificarNovaOperacao(){
         Scanner sc = new Scanner(System.in);

         System.out.println("Deseja realizar uma nova operação ? (S ou N): ");
         return !sc.nextLine().toUpperCase(Locale.ROOT).equals("N");
    }

    public static  Double realizarCauculo(Double valorum, Double valorDois, String operacao){
        Double respostaCalculo = 0.0;

         switch (operacao){
             case "+":
                 respostaCalculo = valorum + valorDois;
                 break;
             case "-":
                 respostaCalculo = valorum - valorDois;
                 break;
             case "*":
                 respostaCalculo = valorum * valorDois;
                 break;
             case "/":
                 respostaCalculo = valorum / valorDois;
                 break;

             default:
                 System.out.println("operação é inválida =(')");
         }
        return respostaCalculo;
    }
}
