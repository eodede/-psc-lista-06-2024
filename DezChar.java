import java.util.Scanner;

public class DezChar {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        char[] carac = new char[10];
        int contadorConsoantes = 0;

        System.out.println("Digite os 10 caracteres:");
        for (int i = 0; i < 10; i++) {
        carac[i] = scanner.next().charAt(0);
        }

        System.out.println("As consoantes lidas são:");

        for (int i = 0; i < 10; i++) {
        if (isConsoante(carac[i])) {
        System.out.println(carac[i]);
        contadorConsoantes++;
        }
        }
        scanner.close();
        System.out.println("Total de consoantes lidas: " + contadorConsoantes);
    }

    public static boolean isConsoante(char c) {
        return Character.isLetter(c) && !"aeiouAEIOU".contains(String.valueOf(c));
    }
}
