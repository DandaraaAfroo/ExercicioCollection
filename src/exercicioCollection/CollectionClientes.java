package exercicioCollection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CollectionClientes {

	static class QueueBanco {
		private Queue<String> fila;

		public QueueBanco() {
			fila = new LinkedList<>();
		}

		public void adicionarCliente(String cliente) {
			fila.add(cliente);
			System.out.println("Cliente " + cliente + " adicionado à fila.");
		}

		public void listarClientes() {
			if (fila.isEmpty()) {
				System.out.println("A fila está vazia.");
			} else {
				System.out.println("Clientes na fila:");
				for (String cliente : fila) {
					System.out.println(cliente);
				}
			}
		}

		public void chamarCliente() {
			if (fila.isEmpty()) {
				System.out.println("A fila está vazia. Nenhum cliente para chamar.");
			} else {
				String cliente = fila.poll();
				System.out.println("Cliente " + cliente + " chamado.");
			}
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		QueueBanco queueBanco = new QueueBanco();

		int opcao;
		do {

			System.out.println("\nMenu:");
			System.out.println("1: Adicionar Cliente à fila");
			System.out.println("2: Listar Clientes na fila");
			System.out.println("3: Chamar Cliente da fila");
			System.out.println("0: Sair");
			System.out.print("Escolha uma opção: ");
			opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
			case 1:

				System.out.print("Digite o nome do cliente: ");
				String nomeCliente = scanner.nextLine();
				queueBanco.adicionarCliente(nomeCliente);
				break;

			case 2:

				queueBanco.listarClientes();
				break;

			case 3:

				queueBanco.chamarCliente();
				break;

			case 0:

				System.out.println("Saindo do programa.");
				break;

			default:
				System.out.println("Opção inválida. Tente novamente.");
			}

		} while (opcao != 0);

		scanner.close();
	}
}
