public class Ingresso {
    private double valor;
    private String nomeFilme;

    public enum TipoAudio {
        DUBLADO, LEGENDADO
    }

    private TipoAudio tipoAudio;

    public Ingresso(double valor, String nomeFilme, Ingresso.TipoAudio tipoAudio) {
        this.valor = valor;
        this.nomeFilme = nomeFilme;
        this.tipoAudio = tipoAudio;
    }

    public double getValor() {
        return this.valor;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public TipoAudio getTipoAudio() {
        return tipoAudio;
    }

    public double getValorReal() {
        return this.valor;
    }

}
