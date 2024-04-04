import java.util.Scanner;

public class VetorParImpar {
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);

    int[] numeros = new int[20];
    int[] pares = new int[20]; 
    int[] impares = new int[20]; 
    int contadorPares = 0;
    int contadorImpares = 0;

    System.out.println("Digite 20 números inteiros:");

    for (int i = 0; i < 20; i++) {
    numeros[i] = scanner.nextInt();

    if (numeros[i] % 2 == 0) {
    pares[contadorPares] = numeros[i];
    contadorPares++;
    } 

    else {
    impares[contadorImpares] = numeros[i];
    contadorImpares++;
    }
    }

    System.out.println("Números digitados:");

    for (int i = 0; i < 20; i++) {
    System.out.print(numeros[i] + " ");
    }

    System.out.println();

    System.out.println("Números pares:");
    for (int i = 0; i < contadorPares; i++) {
    System.out.print(pares[i] + " ");
    }
    System.out.println();

    System.out.println("Números ímpares:");
    for (int i = 0; i < contadorImpares; i++) {
    System.out.print(impares[i] + " ");
    }

    System.out.println();
    scanner.close();
}
}
