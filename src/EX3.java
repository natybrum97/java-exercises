import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();
        System.out.println("Tabela de multiplicação por " + numero);

        for (int i = 0; i <= 10; i++){
            int multiplicacao = numero*i;
            System.out.println(numero + " X " + i + " = " + multiplicacao);
        }

        scanner.close();
    }
}
