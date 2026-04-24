package exercicios;

public record PessoaRecord(String nome, CidadeRecord cidade) {

    @Override
    public String toString() {
        return "Pessoa Imutável => Nome: '" + nome + '\'' +
                ", " + cidade;
    }
}
