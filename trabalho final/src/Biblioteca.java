import java.util.List;

public class Biblioteca {
    private String nome;
    private String endereco;
    private List<Membro> membros;
    private List<Acervo> itens;
    private List<Emprestimo> emprestimo;
    private List<Reserva> reservas;

    public void cadastrarMembro(){

    }

    public void adicionartItem(){

    }

    public void realizarEmprestimo(){

    }

    public void realizarDevolucao(){

    }

    public void realizarReserva(){

    }

    public void aplicarPenalidades(){

    }

    public void limparReserva(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<Membro> getMembros() {
        return membros;
    }

    public void setMembros(List<Membro> membros) {
        this.membros = membros;
    }

    public List<Acervo> getItens() {
        return itens;
    }

    public void setItens(List<Acervo> itens) {
        this.itens = itens;
    }

    public List<Emprestimo> getEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(List<Emprestimo> emprestimo) {
        this.emprestimo = emprestimo;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }
}
