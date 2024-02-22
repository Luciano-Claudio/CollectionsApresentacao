import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class HashSetExemplo {
    public static void main(String[] args) {

        /* Construtores do HashSet */

        // Construtor padrão de HashSet
        HashSet<String> conjunto1 = new HashSet<>();
        // Este é o construtor padrão da classe HashSet que inicializa um objeto HashSet com capacidade e fator de carga padrão.
        // Capacidade padrão é 16 e o fator de carga padrão é 0.75.

        // Construtor de HashSet com capacidade especificada
        HashSet<Integer> conjunto2 = new HashSet<>(20);
        // Este construtor inicializa um HashSet com capacidade igual ao argumento dado (neste caso, 20).
        // O HashSet pode crescer automaticamente à medida que mais elementos são adicionados.

        // Construtor de HashSet com capacidade e fator de carga especificados
        HashSet<Double> conjunto3 = new HashSet<>(30, 0.8f);
        // Este construtor inicializa um HashSet com capacidade e fator de carga iguais aos argumentos fornecidos (neste caso, capacidade de 30 e fator de carga de 0.8).
        // O fator de carga é usado para determinar quando rehashing ocorre à medida que o HashSet se enche.

        // Construtor de HashSet com elementos de uma coleção especificada
        Collection<String> colecao = Arrays.asList("A", "B", "C");
        HashSet<String> conjunto4 = new HashSet<>(colecao);
        // Este construtor inicializa um HashSet e o inicializa com elementos da coleção fornecida.
        
        /* Brincando com o HashSet */

        // Criando um HashSet
        HashSet<String> conjunto = new HashSet<>();

        // Este método adiciona um elemento do tipo E se e somente se ele ainda não estiver presente no HashSet.
        // Complexidade de tempo: O(1)
        conjunto.add("Elemento 1");

        // Este método limpa o HashSet inteiro removendo todos os elementos presentes nele.
        // Complexidade de tempo: O(1)
        conjunto.clear();

        // Este método retorna falso se o elemento especificado não estiver presente no HashSet, caso contrário retorna verdadeiro.
        // Complexidade de tempo: O(1)
        boolean contemElemento = conjunto.contains("Elemento 1");

        // Este método retorna verdadeiro se o HashSet estiver vazio, caso contrário retorna falso.
        // Complexidade de tempo: O(1)
        boolean vazio = conjunto.isEmpty();

        // Este método remove o Objeto e se estiver presente no HashSet.
        // Complexidade de tempo: O(1)
        conjunto.remove("Elemento 1");

        // Este método retorna o número de elementos presentes no HashSet.
        // Complexidade de tempo: O(1)
        int tamanho = conjunto.size();
    }
}
