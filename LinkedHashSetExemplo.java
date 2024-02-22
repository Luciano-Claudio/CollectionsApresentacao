import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;

public class LinkedHashSetExemplo {
    public static void main(String[] args) {

        /* Construtores do LinkedHashSet */

        // Construtor padrão do LinkedHashSet
        LinkedHashSet<String> conjunto1 = new LinkedHashSet<>();
        // Este é o construtor padrão da classe LinkedHashSet que inicializa um objeto LinkedHashSet.

        // Construtor de LinkedHashSet com capacidade especificada
        LinkedHashSet<Integer> conjunto2 = new LinkedHashSet<>(20);
        // Este construtor inicializa um LinkedHashSet com capacidade igual ao argumento dado (neste caso, 20).
        // O LinkedHashSet pode crescer automaticamente à medida que mais elementos são adicionados.

        // Construtor de LinkedHashSet com capacidade e fator de carga especificados
        LinkedHashSet<Double> conjunto3 = new LinkedHashSet<>(30, 0.8f);
        // Este construtor inicializa um LinkedHashSet com capacidade e fator de carga iguais aos argumentos fornecidos (neste caso, capacidade de 30 e fator de carga de 0.8).

        // Construtor de LinkedHashSet com elementos de uma coleção especificada
        Collection<String> colecao = Arrays.asList("A", "B", "C");
        LinkedHashSet<String> conjunto4 = new LinkedHashSet<>(colecao);
        // Este construtor inicializa um LinkedHashSet e o inicializa com elementos da coleção fornecida.
        // A ordem de inserção é mantida.

        /* Brincando com o LinkedHashSet */

        // Criando um LinkedHashSet
        LinkedHashSet<String> conjunto = new LinkedHashSet<>();

        // Este método adiciona um elemento ao LinkedHashSet se ele ainda não estiver presente.
        // A ordem de inserção é mantida.
        conjunto.add("Elemento 1");

        // Este método limpa o LinkedHashSet, removendo todos os elementos presentes nele.
        conjunto.clear();

        // Este método retorna verdadeiro se o LinkedHashSet contiver o elemento especificado.
        boolean contemElemento = conjunto.contains("Elemento 1");

        // Este método retorna verdadeiro se o LinkedHashSet estiver vazio.
        boolean vazio = conjunto.isEmpty();

        // Este método remove o elemento especificado do LinkedHashSet, se ele estiver presente.
        conjunto.remove("Elemento 1");

        // Este método retorna o número de elementos no LinkedHashSet.
        int tamanho = conjunto.size();
    }
}
