import java.util.Scanner;

public class Entrada_Matrizes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numLinhas = scanner.nextInt();
        int numColunas = scanner.nextInt();

        int[][] matrix = new int[numLinhas][numColunas];

        for(int i = 0 ; i < numLinhas ; i++){
            for(int j = 0 ; j < numColunas ; j++){
                matrix[i][j] = scanner.nextInt();
            }
        }

        for(int i = 0 ; i < numLinhas ; i++){
            for(int j = 0 ; j < numColunas ; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
