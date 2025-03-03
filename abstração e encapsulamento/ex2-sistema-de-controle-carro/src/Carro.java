public class Carro {
    private int velocidade;
    private int marcha;
    private boolean ligado;

    public Carro() {
        this.velocidade = 0;
        this.marcha = 0;
        this.ligado = false;
    }

    public void ligar() {
        this.ligado = true;
    }

    public void desligar() {
        if (ligado && this.velocidade == 0 && this.marcha == 0) {
            this.ligado = false;
            System.out.println("Desligando o carro.");
        } else {
            System.out.println(
                    "Não é possível desligar o carro enquanto ele não estiver em ponto morto e com velocidade 0.");
        }
    }

    public void colocarNoPontoMorto() {
        this.marcha = 0;
        this.velocidade = 0;
        System.out.println("Colocando o carro em ponto morto.");
    }

    public void acelerar() {
        if (this.ligado) {
            if (this.marcha == 0) {
                System.out.println("O carro está em ponto morto, trocando para a marcha 1.");
                this.marcha = 1;
            }

            if (this.velocidade < 120) {
                this.velocidade += 1;
                trocarMarcha();
            } else {
                System.out.println("Velocidade máxima atingida.");
            }
        } else {
            System.out.println("O carro está desligado.");
        }
    }

    public void diminuirVelocidade() {
        if (this.ligado && this.velocidade > 0) {
            this.velocidade -= 1;
            trocarMarcha();
        } else if (this.velocidade == 0) {
            System.out.println("Velocidade mínima atingida.");
        } else {
            System.out.println("O carro está desligado.");
        }
    }

    public void virarParaEsquerdaOuDireita() {
        if (this.velocidade >= 1 && this.velocidade <= 40 && this.ligado) {
            System.out.println("Virando para a esquerda/direita.");
        } else if (this.velocidade < 1) {
            System.out.println("Velocidade muito baixa para virar.");
        } else if (this.velocidade > 40) {
            System.out.println("Velocidade muito alta para virar.");
        } else {
            System.out.println("O carro está desligado.");
        }
    }

    public void verificarVelocidade() {
        if (ligado) {
            System.out.println("Velocidade atual: " + this.velocidade + " km/h");
        } else {
            System.out.println("O carro está desligado.");
        }
    }

    public void trocarMarcha() {
        if (!this.ligado) {
            System.out.println("O carro está desligado.");
            return;
        }

        int limiteInferior = 0;
        int limiteSuperior = 0;

        switch (this.marcha) {
            case 0:
                limiteInferior = 0;
                limiteSuperior = 0;
                break;
            case 1:
                limiteInferior = 0;
                limiteSuperior = 20;
                break;
            case 2:
                limiteInferior = 21;
                limiteSuperior = 40;
                break;
            case 3:
                limiteInferior = 41;
                limiteSuperior = 60;
                break;
            case 4:
                limiteInferior = 61;
                limiteSuperior = 80;
                break;
            case 5:
                limiteInferior = 81;
                limiteSuperior = 100;
                break;
            case 6:
                limiteInferior = 101;
                limiteSuperior = 120;
                break;
            default:
                System.out.println("Marcha inválida.");
                return;
        }

        if (this.velocidade >= limiteInferior && this.velocidade <= limiteSuperior) {
            System.out.println("Marcha " + this.marcha + " mantida.");
        } else {
            if (this.velocidade > limiteSuperior && this.marcha < 6) {
                this.marcha++;
                System.out.println("Marcha trocada para: " + this.marcha);
            } else if (this.velocidade < limiteInferior && this.marcha > 0) {
                this.marcha--;
                System.out.println("Marcha trocada para: " + this.marcha);
            }
        }
    }

    public void estadoAtual() {
        if (ligado) {
            System.out.println("O carro está ligado, a velocidade atual é de " + this.velocidade + " km/h e a marcha é "
                    + this.marcha);
        } else {
            System.out.println("O carro está desligado.");
        }
    }
}
