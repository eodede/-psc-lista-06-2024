import java.util.Scanner;

public class VetorNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double[] notas = new Double[4];
        Double soma = 0.0;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a Nota: ");
            notas[i] = scanner.nextDouble();
            soma += notas[i];
        }

        Double media = soma / notas.length;
        
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
        }
        
        System.out.print("Media: " + media);
        scanner.close();
    }
}