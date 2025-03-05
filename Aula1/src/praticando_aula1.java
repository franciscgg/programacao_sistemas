import java.util.Scanner;
public class praticando_aula1 {
    public static void main(String[] args) {
        double num1, num2, soma;
        int cod;

        Scanner sc;
        while (true) {
            sc = new Scanner(System.in);
            System.out.println("1-Soma\n2-Subtração\n3-Multiplicação\n4-Divisão\n5-Sair");
            cod = sc.nextInt();
            if (cod == 5) {
                System.out.println("Programa encerrado!");
                break;
            }
            if (cod < 1 || cod >= 6) {
                System.out.println("Opção do menu inválida");
                continue;
            }
            System.out.print("Digite o primeiro número: ");
            num1 = sc.nextDouble();
            System.out.print("Digite o segundo número: ");
            num2 = sc.nextDouble();

            switch (cod) {
                case 1:
                    System.out.println("Soma: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Subtração: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Multiplicação: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("Não é possível divisão por zero!");
                    }else {
                        System.out.println("Divisão: " + (num1 / num2));
                    }
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        sc.close();
    }
}