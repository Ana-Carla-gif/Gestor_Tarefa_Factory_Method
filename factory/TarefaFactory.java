package factory;

import model.Tarefa;

public interface TarefaFactory {
    Tarefa criarTarefa(int id, String descricao);
}

// package factory;

// import model.Tarefa;

// public class TarefaFactory {
//     public Tarefa criarTarefa(int id, String descricao) {
//         return new Tarefa(id, descricao);
//     }
    
// }
