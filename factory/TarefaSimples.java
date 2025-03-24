package factory;

import model.Tarefa;

public class TarefaSimples implements TarefaFactory {
    @Override
    public Tarefa criarTarefa(int id, String descricao) {
        return new Tarefa(id, descricao);
    }
}
