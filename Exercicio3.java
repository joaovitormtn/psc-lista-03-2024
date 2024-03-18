import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        //Solicita e lê o coeficiente "a" determinado pelo usuário
        System.out.println("Por favor, determine o coeficiente a:");
        double a = scanner.nextDouble();

        //Solicita e lê o coeficiente "b" determinado pelo usuário
        System.out.println("Por favor, determine o coeficiente b:");
        double b = scanner.nextDouble();

        //Solicita e lê o coeficiente "c" determinado pelo usuário
        System.out.println("Por favor, determine o coeficiente c:");
        double c = scanner.nextDouble();

        // Identifica se os coeficientes são válidos
        if (a == 0 && b == 0 && c != 0) {
            System.out.println("Os coeficientes foram informados incorretamente.");
        } else if (a == 0 && b != 0) {
            System.out.println("Esta é uma equação de primeiro grau.");
            double raiz = -c / b;
            System.out.println("A raiz real da equação é igual a: " + raiz);
        } else {
            double delta = b * b - 4 * a * c;

            // Identifica o valor do discriminante
            if (delta < 0) {
                System.out.println("Esta equação não possui raízes reais.");
            } else if (delta == 0) {
                System.out.println("Esta equação possui duas raízes reais iguais.");
                double raiz = -b / (2 * a);
                System.out.println("As raízes da equação são: " + raiz + ", " + raiz);
            } else {
                System.out.println("Esta equação possui duas raízes reais diferentes.");
                double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
                double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("As raízes da equação são: " + raiz1 + ", " + raiz2);
            }
        }

        scanner.close();
    }
}
