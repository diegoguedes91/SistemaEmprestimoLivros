## Funcionalidades do Sistema

### Gerenciamento de Livros

- **Adicionar um novo livro**: incluindo título e autor.
- **Listar todos os livros disponíveis**: mostrar apenas os livros que estão disponíveis para empréstimo.
- **Realizar empréstimo de um livro**: permitir que um usuário escolha um livro disponível e registre o empréstimo.

## Estrutura do Projeto

O projeto será dividido em algumas classes simples para manter a organização. Aqui estão as classes principais e suas funcionalidades:

### Livro

- **id**: Identificador único do livro
- **titulo**: Título do livro
- **autor**: Autor do livro (objeto do tipo Autor)
- **disponivel**: Indica se o livro está disponível para empréstimo
- dataCadastro: Data que o livro foi cadastrado
- dataAtualização: Data que o livro foi atualizado

### Autor

- **id**: Identificador único do autor
- **nome**: Nome do autor
- dataNascimento: Nascimento do autor

### Biblioteca

- **livros**: Lista de livros na biblioteca
- autores: Lista de autores da biblioteca
- emprestimos: Lista de empréstimos da biblioteca
