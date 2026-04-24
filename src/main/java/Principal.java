import exercicios.CidadeMutavel;
import exercicios.CidadeRecord;
import exercicios.PessoaRecord;
import exercicios.PessoaRecordShallow;

/**
 * Classe para você testar suas implementações.
 * Veja o README para mais detalhes.
 * @author Juno Piazza Lopes
 */
public class Principal {
    public static void main(final String[] args) {
        var cidadeMutavel = new CidadeMutavel("Conceição do Araguaia");

        var cidadeRecord = new CidadeRecord("Palmas");
        System.out.println(cidadeRecord);

        PessoaRecordShallow pessoaSemiMutavel = new PessoaRecordShallow("Pedro", cidadeMutavel);
        System.out.println(pessoaSemiMutavel);
        cidadeMutavel.setNome("Belo Horizonte");
        System.out.println(pessoaSemiMutavel);

        PessoaRecord pessoaImutavel = new PessoaRecord("João", cidadeRecord);
        System.out.println(pessoaImutavel);

        /*
        O Record não permite a implementação de um setter, já que seus atributos por padrão são 'final' e não podem ser modificadas.
         */
        // pessoaImutavel.cidade().setNome("Belém");
    }
}
