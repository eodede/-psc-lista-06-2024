import java.util.Scanner;

public class Vetor5num {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int[] num = new int [5];
    
    for (int i = 0; i < num.length; i++) {
    System.out.print("Digite algum número inteiro: ");
    num[i] = scanner.nextInt();
    }
    for (int i = 0; i < num.length; i++) {
    System.out.println("Os números digitados foram: " + num[i]);    
    }
    scanner.close();
    }
}