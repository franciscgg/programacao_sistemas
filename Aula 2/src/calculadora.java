import java.util.Scanner;

public class calculadora {
    public static double soma(double n1, double n2) {
        return (n1 + n2);
    }

    public static double subtracao(double n1, double n2) {
        return (n1 - n2);
    }

    public static double multi(double n1, double n2) {
        return (n1 * n2);
    }

    public static double divisao(double n1, double n2) {
        return (n1 / n2);
    }

    public static int menu() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("1-Soma\n2-Subtração\n3-Multiplicação\n4-Divisão\n5-Sair");
        return (entrada.nextInt());
    }

    public static void main(String[] args) {
        double n1, n2;
        int cod;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        n1 = entrada.nextDouble();
        System.out.print("Digite o segundo número: ");
        n2 = entrada.nextDouble();

        do {
            cod = menu();
            switch (cod) {
                case 1:
                    System.out.println("Soma: " + soma(n1, n2));
                    break;
                case 2:
                    System.out.println("Subtração: " + subtracao(n1, n2));
                    break;
                case 3:
                    System.out.println("Multiplicação: " + multi(n1, n2));
                    break;
                case 4:
                    if (n2 == 0) {
                        System.out.println("Não é possível divisão por zero!");
                    } else {
                        System.out.println("Divisão: " + divisao(n1, n2));
                    }
                    break;
                case 5:
                    System.out.println("Programa encerrado!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (cod != 5);
    }
}
