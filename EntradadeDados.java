import java.util.Scanner;

public class EntradadeDados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um inteiro: ");
        int x = scanner.nextInt();
        System.out.println(x);

        System.out.print("Digite um Double: ");
        double y = scanner.nextDouble();
        System.out.println(y);

        scanner.nextLine();
        System.out.print("Digite uma String:");
        String str = scanner.nextLine();
        System.out.println(str);
    }
}
