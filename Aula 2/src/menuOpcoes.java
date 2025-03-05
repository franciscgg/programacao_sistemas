import java.util.Scanner;

public class menuOpcoes {
    public static int menu() {
        Scanner sc = new Scanner(System.in);
        int cod;
        System.out.println("Menu\n1 - Média entre os números digitados\n" +
                "2- Diferença do maior pelo menor\n" +
                "3- Produto entre os números digitados\n" +
                "4- Divisão do primeiro pelo segundo" +
                "5- Sair");
        cod = sc.nextInt();
        return cod;
    }

    public static double media(int n1, int n2) {
        double m;
        m = (double) (n1 + n2) / 2;
        return m;
    }

    public static int diferenca(int n1, int n2) {
        if (n1 > n2)
            return (n1 - n2);
        else
            return (n2 - n1);
    }

    public static int produto(int n1, int n2) {
        return (n1 * n2);
    }

    public static double divisao(int n1, int n2) {
        return (double) n1 / n2;
    }

    public static void main(String[] args) {
        int n1, n2, cod;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        n1 = sc.nextInt();
        System.out.println("Digite o primeiro número: ");
        n2 = sc.nextInt();
        do {
            cod = menu();
            switch (cod) {
                case 1:
                    System.out.println("Média: " + media(n1, n2));
                    break;
                case 2:
                    System.out.println("Diferença: " + diferenca(n1, n2));
                    break;
                case 3:
                    System.out.println("Produto: " + produto(n1, n2));
                    break;
                case 4:
                    if(n2 != 0)
                    System.out.println("Divisão: " + divisao(n1, n2));
                    else
                        System.out.println("Não há divisão por zero");
                    break;
                case 5:
                    System.out.println("Programa encerrado!");
                    break;
                default:
                    System.out.println("Opção invalida!");
            }
        }while (cod != 5);
    }
}

