package exercicioCollection;

import java.util.Stack;
import java.util.Scanner;

public class CollectionLivros {

	static class StackLivros {
		private Stack<String> pilha;

		public StackLivros() {
			pilha = new Stack<>();
		}

		public void adicionarLivro(String livro) {
			pilha.push(livro);
			System.out.println("Livro \"" + livro + "\" adicionado à pilha.");
		}

		public void listarLivros() {
			if (pilha.isEmpty()) {
				System.out.println("A pilha está vazia.");
			} else {
				System.out.println("Livros na pilha:");
				for (String livro : pilha) {
					System.out.println(livro);
				}
			}
		}

		public void retirarLivro() {
			if (pilha.isEmpty()) {
				System.out.println("A pilha está vazia. Nenhum livro para retirar.");
			} else {
				String livro = pilha.pop();
				System.out.println("Livro \"" + livro + "\" retirado da pilha.");
			}
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StackLivros stackLivros = new StackLivros();

		int opcao;
		do {

			System.out.println("\nMenu:");
			System.out.println("1: Adicionar Livro à pilha");
			System.out.println("2: Listar Livros na pilha");
			System.out.println("3: Retirar Livro da pilha");
			System.out.println("0: Sair");
			System.out.print("Escolha uma opção: ");
			opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
			case 1:

				System.out.print("Digite o nome do livro: ");
				String nomeLivro = scanner.nextLine();
				stackLivros.adicionarLivro(nomeLivro);
				break;

			case 2:

				stackLivros.listarLivros();
				break;

			case 3:

				stackLivros.retirarLivro();
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

