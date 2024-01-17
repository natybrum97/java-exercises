import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        if(numero % 2 == 0 && numero < 0){
            System.out.println(numero + " é par e negativo.");
        } else if (numero % 2 == 0 && numero > 0) {
            System.out.println(numero + " é par e positivo.");
        } else if (numero % 2 != 0 && numero < 0) {
            System.out.println(numero + " é ímpar e negativo.");
        } else {
            System.out.println(numero + " é ímpar e positivo.");
        }
        
        scanner.close();
    }
}
