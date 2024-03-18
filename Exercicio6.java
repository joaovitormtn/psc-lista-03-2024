import java.util.Random;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Solicita e lê o primeiro número inteiro informado pelo usuário
        System.out.println("Digite o primeiro número inteiro:");
        int numero1 = scanner.nextInt();

        // Solicita e lê o segundo número inteiro informado pelo usuário
        System.out.println("Digite o segundo número inteiro:");
        int numero2 = scanner.nextInt();

        // Encontra o menor e o maior número informado pelo usuário
        int menorNumero = Math.min(numero1, numero2);
        int maiorNumero = Math.max(numero1, numero2);

        // Gera um número aleatório entre o menor e o maior número informado pelo usuário
        int numeroAleatorio = random.nextInt((maiorNumero - menorNumero) + 1) + menorNumero;

        // Identifica se o número gerado é par ou ímpar
        if (numeroAleatorio % 2 == 0) {
            System.out.println("Número gerado: " + numeroAleatorio + " (par)");
        } else {
            System.out.println("Número gerado: " + numeroAleatorio + " (ímpar)");
        }

        scanner.close();
    }
}
