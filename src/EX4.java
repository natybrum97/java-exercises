import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número de linhas da pirâmide: ");
        int linhas = scanner.nextInt();

        for (int i = 1; i <= linhas; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(i);
            }
            System.out.println();
        }

        scanner.close();
    }
}
