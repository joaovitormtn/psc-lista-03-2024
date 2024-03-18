import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Solicitar e ler o primeiro número informado pelo usuàrio
        System.out.println("Por favor, digite o 1º número:");
        double numero1 = scanner.nextDouble();

        System.out.println("Por favor, digite o 2º número:");
        double numero2 = scanner.nextDouble();

        System.out.println("Por favor, digite o 3º número:");
        double numero3 = scanner.nextDouble();

        // Identificar o maior número informado pelo usuário
        double maior = numero1;
        if (numero2 > maior) {
            maior = numero2;
        }
        if (numero3 > maior) {
            maior = numero3;
        }

        // Identificar o menor número informado pelo usuário
        double menor = numero1;
        if (numero2 < menor) {
            menor = numero2;
        }
        if (numero3 < menor) {
            menor = numero3;
        }

        // Calcular a média aritmética dos três números informados pelo usuário
        double media = (numero1 + numero2 + numero3) / 3;

        // Exibir o maior número, o menor e a média aritmética dos números informados
        System.out.println("O maior número é o: " + maior);
        System.out.println("O menor número é o: " + menor);
        System.out.println("A média aritmética dos números informados, é igual a: " + media);

        scanner.close();
    }
}
