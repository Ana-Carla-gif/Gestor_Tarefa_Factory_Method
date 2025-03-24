import controller.GestorTarefa;
import factory.TarefaFactory;
import factory.TarefaSimples;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criando uma instância do Factory Method
        TarefaFactory tarefaFactory = new TarefaSimples();
        GestorTarefa gestorTarefa = new GestorTarefa(tarefaFactory);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== GERENCIADOR DE TAREFAS ===");
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Listar tarefas");
            System.out.println("3. Concluir tarefa");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            switch (opcao) {
                case 1:
                    System.out.print("Descrição da tarefa: ");
                    String descricao = scanner.nextLine();
                    gestorTarefa.adicionarTarefa(descricao);
                    break;
                case 2:
                    gestorTarefa.listarTarefas();
                    break;
                case 3:
                    System.out.print("ID da tarefa a concluir: ");
                    int id = scanner.nextInt();
                    gestorTarefa.concluirTarefa(id);
                    break;
                case 4:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}

// import controller.GestorTarefa;
// import factory.TarefaFactory;
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         TarefaFactory tarefaFactory = new TarefaFactory();
//         GestorTarefa gestorTarefa = new GestorTarefa(tarefaFactory);
//         Scanner scanner = new Scanner(System.in);

//         while (true) {
//             System.out.println("\n=== GERENCIADOR DE TAREFAS ===");
//             System.out.println("1. Adicionar tarefa");
//             System.out.println("2. Listar tarefas");
//             System.out.println("3. Concluir tarefa");
//             System.out.println("4. Sair");
//             System.out.print("Escolha uma opção: ");
            
//             int opcao = scanner.nextInt();
//             scanner.nextLine(); // Limpa o buffer

//             switch (opcao) {
//                 case 1:
//                     System.out.print("Descrição da tarefa: ");
//                     String descricao = scanner.nextLine();
//                     gestorTarefa.adicionarTarefa(descricao);
//                     break;
//                 case 2:
//                     gestorTarefa.listarTarefas();
//                     break;
//                 case 3:
//                     System.out.print("ID da tarefa a concluir: ");
//                     int id = scanner.nextInt();
//                     gestorTarefa.concluirTarefa(id);
//                     break;
//                 case 4:
//                     System.out.println("Saindo...");
//                     scanner.close();
//                     return;
//                 default:
//                     System.out.println("Opção inválida.");
//             }
//         }
//     }
// }