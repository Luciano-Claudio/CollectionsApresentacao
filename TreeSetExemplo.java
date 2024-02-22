import java.util.TreeSet;
import java.util.Collection;

public class TreeSetExemplo {
    public static void main(String[] args) {

        /* Construtores do TreeSet */

        // Criando um TreeSet vazio
        TreeSet<Integer> conjunto1 = new TreeSet<>();
        // Este é o construtor padrão que inicializa um TreeSet vazio.

        // Criando um TreeSet com elementos de outra coleção
        TreeSet<Integer> conjunto2 = new TreeSet<>(conjunto1);
        // Este construtor inicializa um TreeSet e o popula com os elementos do TreeSet fornecido.

        /* Brincando com o TreeSet */

        // Criando um TreeSet
        TreeSet<Integer> conjunto = new TreeSet<>();

        // Este método adicionará o elemento especificado de acordo com a mesma ordem de classificação mencionada durante a criação do TreeSet.
        // Entradas duplicadas não serão adicionadas.
        conjunto.add(3);
        conjunto.add(1);
        conjunto.add(2);

        // Este método adicionará todos os elementos da Collection especificada ao conjunto.
        // Os elementos na Collection devem ser homogêneos, caso contrário, será lançada uma ClassCastException.
        // Entradas duplicadas da Collection não serão adicionadas ao TreeSet.
        Collection<Integer> colecao = new TreeSet<>();
        colecao.add(4);
        colecao.add(5);
        conjunto.addAll(colecao);

        // Este método retorna o menor elemento neste conjunto maior ou igual ao elemento fornecido.
        // Retorna null se não houver tal elemento.
        Integer teto = conjunto.ceiling(2);

        // Este método remove todos os elementos do TreeSet.
        conjunto.clear();

        // Este método retornará true se um elemento dado estiver presente no TreeSet, caso contrário, retornará false.
        boolean contemElemento = conjunto.contains(3);

        // Este método retorna uma visão de ordem reversa dos elementos contidos neste conjunto.
        TreeSet<Integer> conjuntoDecrescente = (TreeSet<Integer>) conjunto.descendingSet();

        // Este método retornará o primeiro elemento no TreeSet se o TreeSet não for nulo,
        // caso contrário, lançará uma NoSuchElementException.
        Integer primeiroElemento = conjunto.first();

        // Este método retorna o maior elemento neste conjunto menor ou igual ao elemento fornecido.
        // Retorna null se não houver tal elemento.
        Integer piso = conjunto.floor(2);

        // Este método retornará o menor elemento neste conjunto estritamente maior que o elemento fornecido.
        // Retorna null se não houver tal elemento.
        Integer maiorQueDois = conjunto.higher(2);

        // Este método retorna true se este conjunto não contiver elementos ou estiver vazio e false para o caso oposto.
        boolean vazio = conjunto.isEmpty();

        // Este método retornará o último elemento no TreeSet se o TreeSet não for nulo,
        // caso contrário, lançará uma NoSuchElementException.
        Integer ultimoElemento = conjunto.last();

        // Este método retornará o maior elemento neste conjunto estritamente menor que o elemento fornecido.
        // Retorna null se não houver tal elemento.
        Integer menorQueDois = conjunto.lower(2);

        // Este método recupera e remove o primeiro elemento (o mais baixo) ou retorna null se este conjunto estiver vazio.
        Integer primeiroRemovido = conjunto.pollFirst();

        // Este método recupera e remove o último elemento (o mais alto) ou retorna null se este conjunto estiver vazio.
        Integer ultimoRemovido = conjunto.pollLast();

        // Este método é usado para remover um elemento específico do conjunto.
        conjunto.remove(3);

        // Este método é usado para retornar o tamanho do conjunto ou o número de elementos presentes no conjunto.
        int tamanho = conjunto.size();

        // Este método retornará um conjunto de elementos que estão entre os elementos fromElement e toElement.
        // O fromElement é inclusivo e o toElement é exclusivo.
        TreeSet<Integer> subConjunto = (TreeSet<Integer>) conjunto.subSet(1, 3);

        // Este método retornará um conjunto de elementos do TreeSet que são maiores ou iguais ao elemento especificado.
        TreeSet<Integer> conjuntoMaiorQueDois = (TreeSet<Integer>) conjunto.tailSet(2);
    }
}
