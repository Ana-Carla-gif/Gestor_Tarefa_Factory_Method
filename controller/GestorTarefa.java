
package controller;

import model.Tarefa;
import factory.TarefaFactory;
import java.util.ArrayList;
import java.util.List;

public class GestorTarefa {
    private List<Tarefa> tarefas;
    private int proximoId = 1;
    private TarefaFactory tarefaFactory;

    public GestorTarefa(TarefaFactory tarefaFactory) {
        this.tarefas = new ArrayList<>();
        this.tarefaFactory = tarefaFactory;
    }

    public void adicionarTarefa(String descricao) {
        Tarefa novaTarefa = tarefaFactory.criarTarefa(proximoId++, descricao);
        tarefas.add(novaTarefa);
        System.out.println("Tarefa adicionada: " + novaTarefa);
    }

    public void listarTarefas() {
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada.");
        } else {
            System.out.println("Lista de Tarefas: ");
            for (Tarefa tarefa : tarefas) {
                System.out.println(tarefa);
            }
        }
    }

    public void concluirTarefa(int id) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getId() == id) {
                tarefa.concluir();
                System.out.println("Tarefa concluída: " + tarefa);
                return;
            }
        }
        System.out.println("Tarefa não encontrada.");
    }
}

// package controller;

// import model.Tarefa;
// import factory.TarefaFactory;
// import java.util.ArrayList;
// import java.util.List;

// public class GestorTarefa {
//     private List<Tarefa> tarefas;
//     private int proximoId = 1;
//     private TarefaFactory tarefaFactory;

//     public GestorTarefa(TarefaFactory tarefaFactory) {
//         this.tarefas = new ArrayList<>();
//         this.tarefaFactory = tarefaFactory;
//     }

//     public void adicionarTarefa(String descricao) {
//         Tarefa novaTarefa = tarefaFactory.criarTarefa(proximoId++, descricao);
//         tarefas.add(novaTarefa);
//         System.out.println("Tarefa adicionada: " + novaTarefa);
//     }

//     public void listarTarefas() {
//         if (tarefas.isEmpty()) {
//             System.out.println("Nenhuma tarefa cadastrada.");
//         } else {
//             System.out.println("Lista de Tarefas: ");
//             for (Tarefa tarefa : tarefas) {
//                 System.out.println(tarefa);
//             }
//         }
//     }

//     public void concluirTarefa(int id) {
//         for (Tarefa tarefa : tarefas) {
//             if (tarefa.getId() == id) {
//                 tarefa.concluir();
//                 System.out.println("Tarefa concluída: " + tarefa);
//                 return;
//             }
//         }
//         System.out.println("Tarefa não encontrada.");
//     }
// }