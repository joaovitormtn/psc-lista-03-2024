import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Solicita e lê o primeiro número informado pelo usuário
        System.out.println("Por favor, digite o 1º número:");
        double numero1 = scanner.nextDouble();

        // Solicita e lê o segundo número informado pelo usuário
        System.out.println("Por favor, digite o 2º número:");
        double numero2 = scanner.nextDouble();

        System.out.println("Por favor, digite o símbolo de operação (+, -, *, / ou ^):");
        char operacao = scanner.next().charAt(0); // Lê apenas o primeiro caractere

        // Variável para armazenar o resultado da operação
        double resultado = 0;

        // Realiza a operação correspondente ao símbolo inserido
        switch (operacao) {
            case '+':
                resultado = numero1 + numero2;
                break;
            case '-':
                resultado = numero1 - numero2;
                break;
            case '*':
                resultado = numero1 * numero2;
                break;
            case '/':
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                } else {
                    System.out.println("Não é possível dividir por zero.");
                    return; // Encerra o programa se tentar dividir por zero
                }
                break;
            case '^':
                resultado = Math.pow(numero1, numero2);
                break;
            default:
                System.out.println("Símbolo de operação inválido.");
                return; // Encerra o programa se o símbolo for inválido
        }

        // Exibe o resultado da operação
        System.out.println("Resultado da operação: " + resultado);

        scanner.close();
    }
}
