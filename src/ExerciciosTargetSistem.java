import java.util.Scanner;

public class ExerciciosTargetSistem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Escolha um exercício para executar:");
            System.out.println("1 - Verificar se um número pertence à sequência de Fibonacci");
            System.out.println("2 - Verificar a existência e quantidade da letra 'a' em uma string");
            System.out.println("3 - Calcular o valor final da variável SOMA");
            System.out.println("4 - Completar a sequência lógica");
            System.out.println("5 - Resolver o problema dos interruptores e lâmpadas");
            System.out.println("0 - Sair");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    fibonacciCheck(scanner);
                    break;
                case 2:
                    countAInString(scanner);
                    break;
                case 3:
                    somaFinal();
                    break;
                case 4:
                    logicaSequencias();
                    break;
                case 5:
                    problemaInterruptores();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

            System.out.println(); // Adicionar uma linha de espaço
        } while (opcao != 0);

        scanner.close();
    }

    // Exercício 1 - Verificar se o número pertence à sequência de Fibonacci
    public static void fibonacciCheck(Scanner scanner) {
        System.out.print("Informe um número: ");
        int num = scanner.nextInt();

        if (isFibonacci(num)) {
            System.out.println("O número " + num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + num + " não pertence à sequência de Fibonacci.");
        }
    }

    public static boolean isFibonacci(int num) {
        int a = 0, b = 1;
        while (a < num) {
            int temp = a;
            a = b;
            b = temp + b;
        }
        return a == num;
    }

    // Exercício 2 - Verificar existência e quantidade da letra 'a' em uma string
    public static void countAInString(Scanner scanner) {
        System.out.print("Informe uma string: ");
        String input = scanner.nextLine();

        int count = countLetterA(input);

        if (count > 0) {
            System.out.println("A letra 'a' aparece " + count + " vezes.");
        } else {
            System.out.println("A letra 'a' não aparece na string.");
        }
    }

    public static int countLetterA(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == 'a' || c == 'A') {
                count++;
            }
        }
        return count;
    }

    // Exercício 3 - Calcular o valor final da variável SOMA
    public static void somaFinal() {
        int INDICE = 12;
        int SOMA = 0;
        int K = 1;

        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }

        System.out.println("Valor final da variável SOMA: " + SOMA);
    }

    // Exercício 4 - Completar a sequência lógica
    public static void logicaSequencias() {
        System.out.println("a) 1, 3, 5, 7, " + 9);
        System.out.println("b) 2, 4, 8, 16, 32, 64, " + 128);
        System.out.println("c) 0, 1, 4, 9, 16, 25, 36, " + 49);
        System.out.println("d) 4, 16, 36, 64, " + 100);
        System.out.println("e) 1, 1, 2, 3, 5, 8, " + 13);
        System.out.println("f) 2, 10, 12, 16, 17, 18, 19, " + 200);
    }

    // Exercício 5 - Resolver o problema dos interruptores e lâmpadas
    public static void problemaInterruptores() {
        System.out.println("Solução:");
        System.out.println("1. Ligue o primeiro interruptor e deixe-o ligado por alguns minutos.");
        System.out.println("2. Desligue o primeiro interruptor, ligue o segundo e vá até a sala das lâmpadas.");
        System.out.println("3. A lâmpada que está acesa pertence ao segundo interruptor.");
        System.out.println("4. A lâmpada apagada mas quente pertence ao primeiro interruptor.");
        System.out.println("5. A lâmpada apagada e fria pertence ao terceiro interruptor.");
    }
}
