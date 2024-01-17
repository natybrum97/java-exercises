import java.util.HashSet;

public class EX5MelhorPerformance {
    public static void main(String[] args) {

        String[] array1 = {"Morango", "Banana", "Maçã", "Uva", "Caqui"};
        String[] array2 = {"Manga", "Caqui", "Morango", "Amora"};

        // Criar conjuntos a partir dos arrays
        HashSet<String> set1 = new HashSet<>();
        for (String elemento : array1) {
            set1.add(elemento);
        }

        // Verificar a interseção e imprimir os elementos comuns
        System.out.println("Elementos comuns:");
        for (String elemento : array2) {
            if (set1.contains(elemento)) {
                System.out.println(elemento);
            }
        }
    }
}

/*
Melhor Performance para maior quantidade de dados.
 Em Java, um HashSet é uma implementação da interface Set que armazena elementos únicos usando uma tabela de hash. Ao contrário de um array, que possui
índices sequenciais, um HashSet não tem uma ordem específica e os elementos são armazenados usando uma função de hash para calcular a posição do
elemento na tabela.
Para acessar elementos em um HashSet, você geralmente usa o método contains() para verificar se um elemento específico está presente. 
*/