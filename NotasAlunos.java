import java.util.Scanner;

public class NotasAlunos {
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    int quantidadeAlunos = 10;
    double[] medias = new double[quantidadeAlunos];
    int contadorMediasAltas = 0;

    for (int i = 0; i < quantidadeAlunos; i++) {
    System.out.println("Digite as quatro notas do aluno " + (i + 1) + ":");
    double somaNotas = 0;

    for (int j = 0; j < 4; j++) {
    somaNotas += scanner.nextDouble();
    }

    double media = somaNotas / 4;
    medias[i] = media;

    if (media >= 7.0) {
    contadorMediasAltas++;
    }
    }

    scanner.close();
    System.out.println("Número de alunos com média maior ou igual a 7.0: " + contadorMediasAltas);
    }
}