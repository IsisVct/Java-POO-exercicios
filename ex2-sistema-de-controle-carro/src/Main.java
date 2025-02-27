public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();

        meuCarro.ligar();

        for (int i = 0; i < 25; i++) {
            meuCarro.acelerar();
        }

        meuCarro.verificarVelocidade();
        meuCarro.estadoAtual();

        for (int i = 0; i < 10; i++) {
            meuCarro.diminuirVelocidade();
        }
        meuCarro.verificarVelocidade();
        meuCarro.estadoAtual();

        meuCarro.colocarNoPontoMorto();

        meuCarro.desligar();
    }
}
