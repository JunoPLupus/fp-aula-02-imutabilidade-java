package exercicios;

public record PessoaRecordShallow(String nome, CidadeMutavel cidade) {

    @Override
    public String toString() {
        return "Pessoa Semi-Mutável => Nome: '" + nome + '\'' +
                ", " + cidade;
    }
}
