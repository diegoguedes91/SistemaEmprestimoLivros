import java.time.LocalDate;

public class Emprestimo {
    private Livro livro;
    private String cliente;
    private LocalDate dataEmprestimo;

    public Emprestimo(Livro livro, String cliente, LocalDate dataEmprestimo) {
        this.livro = livro;
        this.cliente = cliente;
        this.dataEmprestimo = dataEmprestimo;
    }

    public Livro getLivro() {
        return livro;
    }

    public String getCliente() {
        return cliente;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }
}

