import java.util.Scanner;

public class Main {
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;

    public Main() {
        lerNotas();
    }

    private void lerNotas() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota 1: ");
        nota1 = scanner.nextDouble();

        System.out.print("Digite a nota 2: ");
        nota2 = scanner.nextDouble();

        System.out.print("Digite a nota 3: ");
        nota3 = scanner.nextDouble();

        System.out.print("Digite a nota 4: ");
        nota4 = scanner.nextDouble();
    }

    private double calcularMedia() {
        return (nota1 + nota2 + nota3 + nota4) / 4;
    }

    private void printStudentStatus() {
        double media = calcularMedia();

        if (media >= 7) {
            System.out.println("Aluno aprovado!");
        } else if (media >= 5) {
            System.out.println("Aluno em recuperação!");
        } else {
            System.out.println("Aluno reprovado!");
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.printStudentStatus();
    }
}