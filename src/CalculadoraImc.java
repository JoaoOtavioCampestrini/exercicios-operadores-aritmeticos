import java.util.Scanner;


public class CalculadoraImc {

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
     

      //ENTRADA
      System.out.print("Digite seu peso em quilogramas:");
      double peso = scanner.nextDouble();

      System.out.print("Digite sua altura em metros:");
      double altura = scanner.nextDouble();


      //PROCESSAMENTO
      double inc = peso / (altura * altura);


      //SAIDA
      System.out.printf("Seu resultado é: " + inc);
      
      scanner.close();

    
   }
   
}