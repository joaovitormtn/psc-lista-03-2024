import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário o indicador de operação
        System.out.println("Por favor, digite o código da operação (1 para perímetro do círculo, 2 para área do círculo, 3 para volume da esfera):");
        int operacao = scanner.nextInt();

        // Solicita ao usuário o raio do círculo ou esfera
        System.out.println("Por favor, digite o valor do raio:");
        double raio = scanner.nextDouble();

        // Constante de pi
        double pi = 3.141592;

        // Variável para armazenar o resultado da operação
        double resultado = 0;

        // Realiza a operação correspondente ao código inserido pelo usuário
        switch (operacao) {
            case 1:
                // Perímetro do círculo
                resultado = 2 * pi * raio;
                System.out.println("O perímetro do círculo é: " + resultado);
                break;
            case 2:
                // Área do círculo
                resultado = pi * raio * raio;
                System.out.println("A área do círculo é: " + resultado);
                break;
            case 3:
                // Volume da esfera
                resultado = (4.0/3.0) * pi * Math.pow(raio, 3);
                System.out.println("O volume da esfera é: " + resultado);
                break;
            default:
                System.out.println("Código da operação inválido.");
        }

        scanner.close();
    }
}
