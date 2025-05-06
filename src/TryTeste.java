import java.util.InputMismatchException;
import java.util.Scanner;

public class TryTeste {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o primeiro número: ");
            int num1 = scanner.nextInt();

            System.out.print("Digite o segundo número: ");
            int num2 = scanner.nextInt();

            int resultado = num1 / num2;
            System.out.println("Resultado da divisão: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero não é permitida!");
        } catch (InputMismatchException e) {
            System.out.println("Erro: Por favor, digite um número inteiro válido!");
            scanner.next();
        }

        try {
            int[] numeros = {10, 20, 30};
            System.out.print("Digite um índice para acessar o array (0-2): ");
            int indice = scanner.nextInt();

            System.out.println("Valor no índice " + indice + ": " + numeros[indice]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Índice inválido! O array só tem 3 elementos.");
        } catch (InputMismatchException e) {
            System.out.println("Erro: Por favor, digite um número inteiro válido!");
            scanner.next();
        }

        try {
            System.out.print("Digite uma string para converter para número: ");
            String entrada = scanner.next();

            try {
                int numero = Integer.parseInt(entrada);
                System.out.println("Número convertido: " + numero);
            } catch (NumberFormatException e) {
                System.out.println("Erro: A string não pode ser convertida para número inteiro.");
            }

        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        }

        try {
            System.out.print("Digite um número para verificar se é par: ");
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                System.out.println(numero + " é par.");
            } else {
                System.out.println(numero + " é ímpar.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Digite um número inteiro.");
        } finally {
            System.out.println("Bloco finally executado. Fim do programa.");
            scanner.close();
        }
    }
}