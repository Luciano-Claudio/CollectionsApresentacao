import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListExamplo {
    public static void main(String[] args) {

        /* Construtores do LinkedList */

        // Exemplo de instância vazia de LinkedList
        LinkedList<String> listaVazia = new LinkedList<>();
        // Este construtor cria um LinkedList vazio.
        
        // Exemplo de instância de LinkedList com elementos iniciais
        LinkedList<Integer> listaComElementos = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        // Este construtor cria um LinkedList contendo os elementos da coleção especificada.
        // Os elementos são adicionados na ordem em que aparecem na coleção.
        
        // Exemplo de instância de LinkedList a partir de outro LinkedList
        LinkedList<Integer> copiaLista = new LinkedList<>(listaComElementos);
        // Este construtor cria uma cópia rasa (shallow copy) do LinkedList especificado.
        // Isso significa que a nova lista contém referências aos mesmos objetos que o LinkedList original.
        // Modificar a nova lista não afetará o LinkedList original, mas modificar os objetos dentro da lista afetará ambos.

        /* Brincando com o LinkedList */

        // Criando um LinkedList
        LinkedList<String> lista = new LinkedList<>();

        // Este método é usado para inserir o elemento em uma posição especificada na lista.
        lista.add(0, "Elemento 1");

        // Este método anexa o elemento ao final da lista.
        lista.add("Elemento 2");

        // Este método é usado para inserir todos os elementos da Coleção "c" a partir do índice especificado.
        LinkedList<String> outraLista = new LinkedList<>();
        outraLista.add("Elemento 3");
        outraLista.add("Elemento 4");
        lista.addAll(1, outraLista);

        // Este método anexa todos os elementos da Coleção "c" ao final da lista.
        lista.addAll(outraLista);

        // Este método insere o elemento desejado no início da lista.
        lista.addFirst("Primeiro Elemento");

        // Este método anexa o elemento desejado no final da lista.
        lista.addLast("Último Elemento");

        // Este método é usado para limpar todos os elementos da lista.
        lista.clear();

        // Este método retornará true se o elemento especificado estiver presente na lista.
        boolean contemElemento = lista.contains("Elemento 1");

        // Este método é usado para recuperar o primeiro elemento ou cabeça da lista.
        String primeiroElemento = lista.element();

        // Este método é usado para retornar o elemento presente na posição especificada.
        String elemento = lista.get(0);

        // Este método é usado para retornar o primeiro elemento da lista.
        String primeiro = lista.getFirst();

        // Este método é usado para retornar o último elemento da lista.
        String ultimo = lista.getLast();

        // Este método é usado para retornar o índice da primeira ocorrência do elemento especificado.
        // Se o elemento não estiver presente na lista, retornará -1.
        int indice = lista.indexOf("Elemento 1");

        // Este método é usado para retornar o índice da última ocorrência do elemento especificado.
        // Se o elemento não estiver presente na lista, retornará -1.
        int ultimoIndice = lista.lastIndexOf("Elemento 1");

        // Este método é usado para retornar e remover o primeiro elemento da lista.
        String primeiroRemovido = lista.remove();

        // Este método é usado para remover um elemento na posição especificada.
        lista.remove(1);

        // Este método é usado para remover a primeira ocorrência do elemento se ele estiver presente na lista.
        lista.remove("Elemento");

        // Este método é usado para retornar e remover o primeiro elemento da lista.
        String primeiroRemovido2 = lista.removeFirst();

        // Este método é usado para remover a primeira ocorrência do elemento especificado ao percorrer a lista da cabeça para a cauda.
        boolean removidoPrimeiraOcorrencia = lista.removeFirstOccurrence("Elemento");

        // Este método é usado para retornar e remover o último elemento da lista.
        String ultimoRemovido = lista.removeLast();

        // Este método é usado para remover a última ocorrência do elemento especificado ao percorrer a lista da cabeça para a cauda.
        boolean removidoUltimaOcorrencia = lista.removeLastOccurrence("Elemento");

        // Este método é usado para substituir o elemento presente na posição especificada pelo elemento fornecido.
        lista.set(0, "Elemento Atualizado");

        // Este método é usado para retornar o número de elementos na lista.
        int tamanho = lista.size();

        // Este método retorna um array contendo todos os elementos da lista, seguindo a ordem da cabeça para a cauda.
        Object[] array = lista.toArray();
    }
}
