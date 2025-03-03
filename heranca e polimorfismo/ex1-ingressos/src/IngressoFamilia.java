
public class IngressoFamilia extends Ingresso {
    private int quantidadeDePessoas;

    public IngressoFamilia(double valor, String nomeFilme, TipoAudio tipoAudio, int quantidadeDePessoas) {
        super(valor, nomeFilme, tipoAudio);
        if (quantidadeDePessoas <= 0) {
            throw new IllegalArgumentException("Quantidade de pessoas deve ser maior que 0.");
        }
        this.quantidadeDePessoas = quantidadeDePessoas;
    }

    @Override
    public double getValorReal() {
        double valorFamilia = getValor() * quantidadeDePessoas;
        if (quantidadeDePessoas > 3) {
            return valorFamilia * 0.9;
        }
        return valorFamilia;
    }
}
