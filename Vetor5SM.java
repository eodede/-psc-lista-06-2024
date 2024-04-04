import java.util.Scanner;

public class Vetor5SM {
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);

    int[] num = new int [5];
    int soma = 0;
    int multi = 1;

    for (int i = 0; i < 5; i++){
    System.out.print("Digite o " + (i + 1) + "º número: ");
    num[i] = scanner.nextInt();
    }
    
    for (int i = 0; i < 5; i++){
    System.out.println("Os números digitados foram: " + num[i]);
    soma += num[i];
    multi *= num[i];    
    }
    System.out.println("A soma dos números é: " + soma);
    System.out.println("A multiplicação dos números é: " + multi);
    scanner.close();
    }
}