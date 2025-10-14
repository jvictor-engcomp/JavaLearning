import java.util.Scanner;

public class Entrada_Vetores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();

        int[] vetor = new int[tamanho];
        System.out.print("Digite os numeros do vetor: ");
        for(int i = 0 ; i < tamanho ; i++){
            vetor[i] = scanner.nextInt();
        }

        System.out.print("Imprimindo valores do vetor: ");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetor[i] + " ");
        }

        scanner.close();
    }
}
