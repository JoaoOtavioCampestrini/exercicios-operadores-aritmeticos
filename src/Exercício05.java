import java.util.Scanner;
 
public class Exercício05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.println("Informe o valor de A: ");
        double a = scanner.nextDouble();
 
        System.out.println("Informe o valor de B: ");
        double b = scanner.nextDouble();
       
        System.out.println("Informe o valor de C: ");
        double c = scanner.nextDouble();
 
        double soma = a + b + c;
 
        System.out.println(soma);
 
    scanner.close();
    }
}