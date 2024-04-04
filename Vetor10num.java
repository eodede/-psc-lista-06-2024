import java.util.Scanner;

public class Vetor10num {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        Double[] num = new Double[10];

        for (int i = 0; i < num.length; i++) {
            System.out.print("Digite algum número real: ");
            num[i] = scanner.nextDouble();
        }
        for (int i = 9; i >= 0; i--) {
            System.out.println("Os números digitados foram: " + num[i]);
            scanner.close();
        }
    }
}
