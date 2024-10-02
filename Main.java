import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("\nVocê gostaria de ver os livros disponíveis? (SIM/NÃO): ");
            String resposta = scanner.nextLine();

            if (resposta.equalsIgnoreCase("SIM")) {
                biblioteca.listarLivrosDisponiveis();

                System.out.print("\nEscolha o ID do livro que deseja emprestar: ");
                Integer idLivro = scanner.nextInt();
                scanner.nextLine(); // Consumir a nova linha

                System.out.print("Por favor, insira seu nome: ");
                String nomeCliente = scanner.nextLine();

                biblioteca.realizarEmprestimo(idLivro, nomeCliente);
            } else if (resposta.equalsIgnoreCase("NÃO") || resposta.equalsIgnoreCase("NAO")) {
                System.out.println("\nFim da aplicação.");
                break;
            } else {
                System.out.println("\nResposta inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}

