import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExamplo {
    public static void main(String[] args) {
        
        /* Construtores do ArrayList */

        // Exemplo de instância vazia de ArrayList
        ArrayList<String> listaVazia = new ArrayList<>();
        // Este construtor cria um ArrayList vazio com uma capacidade inicial padrão de 10 elementos.
        // Ele aloca espaço para 10 elementos, mas a lista está vazia no início.
        
        // Exemplo de instância de ArrayList com elementos iniciais
        ArrayList<Character> listaComElementos = new ArrayList<>(Arrays.asList('a', 'b', 'c', 'd', 'e'));
        // Este construtor cria um ArrayList contendo os elementos da coleção especificada.
        // Os elementos são adicionados na ordem em que aparecem na coleção.
        
        // Exemplo de instância de ArrayList com capacidade inicial personalizada
        ArrayList<Double> listaComCapacidade = new ArrayList<>(20);
        // Este construtor cria um ArrayList com a capacidade inicial especificada.
        // Ele aloca espaço para 20 elementos, mas a lista está vazia no início.
        // Usar este construtor pode ser útil se você souber que sua lista provavelmente terá um grande número de elementos.

        // Exemplo de instância de ArrayList a partir de outro ArrayList
        ArrayList<Character> copiaLista = new ArrayList<>(listaComElementos);
        // Este construtor cria uma cópia rasa (shallow copy) do ArrayList especificado.
        // Isso significa que a nova lista contém referências aos mesmos objetos que o ArrayList original.
        // Modificar a nova lista não afetará o ArrayList original, mas modificar os objetos dentro da lista afetará ambos.
    
        /* Brincando com o ArrayList */

        // Criando um ArrayList
        ArrayList<String> lista = new ArrayList<>();

        // Adiciona um elemento específico no final de ArrayList
        lista.add("Elemento 1");

        // Insere um elemento específico no ArrayList no índice especificado
        lista.add(1, "Elemento 2");

        // Adiciona todos os elementos presentes em uma coleção especificada no final do ArrayList
        List<String> outraLista = new ArrayList<>();
        outraLista.add("Elemento 3");
        outraLista.add("Elemento 4");
        lista.addAll(outraLista);

        // Insere todos os elementos presentes em uma coleção especificada no ArrayList começando com o índice especificado
        List<String> maisElementos = new ArrayList<>();
        maisElementos.add("Elemento 5");
        maisElementos.add("Elemento 6");
        lista.addAll(2, maisElementos);

        // Remove a primeira ocorrência do elemento especificado do ArrayList, se presente
        lista.remove("Elemento 1");

        // Remove o elemento presente no índice especificado do ArrayList
        lista.remove(1);

        // Remove todos os elementos presentes em uma coleção especificada do ArrayList
        lista.removeAll(maisElementos);

        // Remove todos os elementos do ArrayList
        lista.clear();

        // Retorna verdadeiro se ArrayList contiver o elemento especificado
        boolean contemElemento = lista.contains("Elemento 1");

        // Retorna o elemento no índice especificado em ArrayList
        String elemento = lista.get(0);

        // Retorna o índice da primeira ocorrência do elemento especificado em ArrayList ou -1 se a lista não contiver o elemento
        int indice = lista.indexOf("Elemento 2");

        // Retorna verdadeiro se ArrayList não contiver elementos
        boolean vazia = lista.isEmpty();

        // Retorna o índice da última ocorrência do elemento especificado em ArrayList ou -1 se a lista não contiver o elemento
        int ultimoIndice = lista.lastIndexOf("Elemento 2");

        // Substitui o elemento na posição especificada no ArrayList pelo elemento especificado
        lista.set(0, "Novo Elemento");

        // Retorna um array contendo todos os elementos presentes no ArrayList na sequência adequada
        Object[] array = lista.toArray();

        // Retorna uma visualização da parte desta lista entre o Index (inclusivo) e o Index (exclusivo) especificados
        List<String> subLista = lista.subList(0, 1);

        // Reduz a capacidade da instância ArrayList para o tamanho atual da lista
        lista.trimToSize();

        // Retorna o número de elementos presentes no ArrayList
        int tamanho = lista.size();
    }
}
