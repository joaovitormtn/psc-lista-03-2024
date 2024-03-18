import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Solicitar o valor da compra e ler o mesmo
        System.out.println("Valor da compra:");
        double valorCompra = scanner.nextDouble();

        //Solicitar o valor pago e ler o mesmo
        System.out.println("Valor pago:");
        double valorPago = scanner.nextDouble();

        // Identifica se o valor pago pelo usuário é suficiente para a compra
        if (valorPago < valorCompra) {
            System.out.println("A quantia paga é insuficiente para realizar a compra.");
            return;
        }

        // Calculo do troco do usuário
        double troco = valorPago - valorCompra;
        System.out.println("Troco: R$ " + troco);

        // Calcula o menor número de notas para dar de troco
        int[] notas = {50, 20, 10, 5, 2, 1};
        int[] quantidadeNotas = new int[notas.length];

        for (int i = 0; i < notas.length; i++) {
            quantidadeNotas[i] = (int) (troco / notas[i]);
            troco %= notas[i];
        }

        // Exibe ao usuário o número de notas de cada valor
        for (int i = 0; i < notas.length; i++) {
            if (quantidadeNotas[i] > 0) {
                System.out.println("Notas de R$ " + notas[i] + ",00: " + quantidadeNotas[i]);
            }
        }

        scanner.close();
    }
}
