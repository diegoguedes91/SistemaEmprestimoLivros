import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros = new ArrayList<>();
    private List<Autor> autores = new ArrayList<>();
    private List<Emprestimo> emprestimos = new ArrayList<>();

    public Biblioteca() {
        // Adicionando autores
        Autor autor1 = new Autor(1, "J.K. Rowling", LocalDate.of(1965, 7, 31));
        Autor autor2 = new Autor(2, "J.R.R. Tolkien", LocalDate.of(1892, 1, 3));

        autores.add(autor1);
        autores.add(autor2);

        // Adicionando livros
        LocalDate dataAtual = LocalDate.now();
        Livro livro1 = new Livro(1, "Harry Potter e a Pedra Filosofal", autor1, true, dataAtual, dataAtual);
        Livro livro2 = new Livro(2, "O Senhor dos Anéis", autor2, true, dataAtual, dataAtual);

        livros.add(livro1);
        livros.add(livro2);
    }

    public void listarLivrosDisponiveis() {
        System.out.println("\nLivros disponíveis:");
        for (Livro livro : livros) {
            if (livro.getDisponivel()) {
                System.out.println("ID: " + livro.getId() + ", Título: " + livro.getTitulo() + ", Autor: " + livro.getAutor().getNome());
            }
        }
    }

    public Livro buscarLivroPorId(Integer id) {
        for (Livro livro : livros) {
            if (livro.getId().equals(id)) {
                return livro;
            }
        }
        return null;
    }

    public void realizarEmprestimo(Integer idLivro, String nomeCliente) {
        Livro livro = buscarLivroPorId(idLivro);
        if (livro != null && livro.getDisponivel()) {
            livro.setDisponivel(false);
            LocalDate dataEmprestimo = LocalDate.now();
            Emprestimo emprestimo = new Emprestimo(livro, nomeCliente, dataEmprestimo);
            emprestimos.add(emprestimo);
            System.out.println("\nO livro '" + livro.getTitulo() + "' foi emprestado com sucesso para " + nomeCliente + ".");
        } else {
            System.out.println("\nLivro não disponível para empréstimo.");
        }
    }
}
