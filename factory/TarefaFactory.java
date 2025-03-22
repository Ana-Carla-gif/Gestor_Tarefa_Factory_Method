//TarefaFactory.java (Factory)

package factory;

import model.Tarefa;

public class TarefaFactory {
    public Tarefa criarTarefa(int id, String descricao) {
        return new Tarefa(id, descricao);
    }
}