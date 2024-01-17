public class EX2 {
    public static void main(String[] args) throws Exception {
        int numero = 10;

        int[] numeros = new int[numero];

        for (int i = 0; i < numero; i++){

            int proximo;

            if(i == 0){
                proximo = 0;
            } else if (i == 1) {
                proximo = 1;
            } else {
                proximo = numeros[i - 1] + numeros[i - 2];
            }

            numeros[i] = proximo;

            System.out.println(proximo);

        }
    }
}
