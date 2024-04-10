import java.util.Scanner;


public class Exercício03 { 

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.printf("Olá, meu nome é: ");
        String nome = scanner.nextLine();
 
        System.out.printf("\nInforme seu sobrenome: ");
        String sobrenome = scanner.nextLine();

        System.out.printf("Nome completo: %s %s", nome, sobrenome );

        scanner.close();

        


    }
}
