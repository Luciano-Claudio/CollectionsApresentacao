import java.util.HashMap;
import java.util.Map;
import java.util.Collection;
import java.util.Set;

public class HashMapExemplo {
    public static void main(String[] args) {
        // Criando um HashMap
        Map<String, Integer> mapa = new HashMap<>();

        // Remove todas as associações (chave-valor) deste mapa.
        mapa.clear();

        // Retorna uma cópia rasa deste HashMap: as chaves e valores em si não são clonados.
        Map<String, Integer> copia = new HashMap<>(mapa);

        // Retorna true se este mapa contiver uma associação para a chave especificada.
        boolean contemChave = mapa.containsKey("chave");

        // Retorna true se este mapa mapeia uma ou mais chaves para o valor especificado.
        boolean contemValor = mapa.containsValue(10);

        // Retorna uma visualização de conjunto das associações contidas neste mapa.
        Set<Map.Entry<String, Integer>> conjuntoAssociacoes = mapa.entrySet();

        // Executa a ação fornecida para cada entrada neste mapa até que todas as entradas tenham sido processadas ou a ação lance uma exceção.
        mapa.forEach((chave, valor) -> System.out.println("Chave: " + chave + ", Valor: " + valor));
        // Precisa passar um lambda com a ação para ser executada

        // Retorna o valor ao qual a chave especificada está mapeada, ou null se este mapa não contiver uma associação para a chave.
        Integer valor = mapa.get("chave");

        // Retorna o valor ao qual a chave especificada está mapeada, ou defaultValue se este mapa não contiver uma associação para a chave.
        Integer valorPadrao = mapa.getOrDefault("chave", 0);

        // Retorna true se este mapa não contiver associações chave-valor.
        boolean vazio = mapa.isEmpty();

        // Retorna uma visualização de conjunto das chaves contidas neste mapa.
        Set<String> chaves = mapa.keySet();

        // Se a chave especificada ainda não estiver associada a um valor (ou estiver mapeada para null),
        // associa-a com o valor fornecido e retorna null, caso contrário, retorna o valor atual.
        Integer valorAnterior = mapa.merge("chave", 10, (antigoValor, novoValor) -> antigoValor + novoValor);

        // Associa o valor especificado à chave especificada neste mapa.
        mapa.put("chave", 10);

        // Copia todas as associações do mapa especificado para este mapa.
        Map<String, Integer> outroMapa = new HashMap<>();
        outroMapa.put("chave2", 20);
        mapa.putAll(outroMapa);

        // Se a chave especificada ainda não estiver associada a um valor (ou estiver mapeada para null),
        // associa-a com o valor especificado e retorna null, caso contrário, retorna o valor atual.
        Integer valorExistente = mapa.putIfAbsent("chave", 30);

        // Remove a associação para a chave especificada deste mapa se estiver presente.
        Integer valorRemovido = mapa.remove("chave");

        // Remove a associação para a chave especificada deste mapa se estiver presente.
        // Retorna true se a associação foi removida.
        boolean removido = mapa.remove("chave", 10);

        // Substitui a entrada para a chave especificada apenas se ela estiver atualmente mapeada para algum valor.
        mapa.replace("chave", 10);

        // Substitui a entrada para a chave especificada apenas se atualmente estiver mapeada para o valor especificado.
        mapa.replace("chave", 10, 20);

        // Substitui cada valor nesta mapa com o resultado da invocação da função fornecida,
        // até que todas as entradas tenham sido processadas ou a função lance uma exceção.
        mapa.replaceAll((chave, valorAtual) -> valorAtual * 2);

        // Retorna o número de associações chave-valor neste mapa.
        int tamanho = mapa.size();

        // Retorna uma visualização de coleção dos valores contidos neste mapa.
        Collection<Integer> valores = mapa.values();
    }
}
