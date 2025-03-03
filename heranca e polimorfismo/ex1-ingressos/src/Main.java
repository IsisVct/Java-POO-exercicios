public class Main {
    public static void main(String[] args) {
        // Criando um ingresso comum
        Ingresso ingressoNormal = new Ingresso(30.00, "O Rei Leão", Ingresso.TipoAudio.DUBLADO);
        System.out.println("Ingresso normal - Filme: " + ingressoNormal.getNomeFilme() + ", Tipo: "
                + ingressoNormal.getTipoAudio() + ", Valor Real: R$ " + ingressoNormal.getValorReal());

        // Criando um ingresso de meia entrada
        MeiaEntrada ingressoMeia = new MeiaEntrada(30.00, "O Rei Leão", Ingresso.TipoAudio.DUBLADO);
        System.out.println("Ingresso Meia Entrada - Filme: " + ingressoMeia.getNomeFilme() + ", Tipo: "
                + ingressoMeia.getTipoAudio() + ", Valor Real: R$ " + ingressoMeia.getValorReal());

        // Criando um ingresso de família com 4 pessoas
        IngressoFamilia ingressoFamilia = new IngressoFamilia(30.00, "O Rei Leão", Ingresso.TipoAudio.LEGENDADO, 4);
        System.out.println("Ingresso Família (4 pessoas) - Filme: " + ingressoFamilia.getNomeFilme() + ", Tipo: "
                + ingressoFamilia.getTipoAudio() + ", Valor Real: R$ " + ingressoFamilia.getValorReal());

        // Criando um ingresso de família com 2 pessoas
        IngressoFamilia ingressoFamilia2 = new IngressoFamilia(30.00, "O Rei Leão", Ingresso.TipoAudio.DUBLADO, 2);
        System.out.println("Ingresso Família (2 pessoas) - Filme: " + ingressoFamilia2.getNomeFilme() + ", Tipo: "
                + ingressoFamilia2.getTipoAudio() + ", Valor Real: R$ " + ingressoFamilia2.getValorReal());
    }
}
