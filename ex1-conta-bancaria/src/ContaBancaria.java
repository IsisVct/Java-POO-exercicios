public class ContaBancaria {

    private double saldo;
    private double chequeEspecial;
    private double valorUsadoChequeEspecial;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
        this.chequeEspecial = (saldoInicial > 500) ? saldoInicial * 0.5 : 50;
    }

    public double consultarSaldo() {
        return this.saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
        aplicarTaxaChequeEspecial();
        System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else if (valor <= saldo + chequeEspecial) {
            valorUsadoChequeEspecial = (valor - saldo);
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado. Usando cheque especial.");
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    public double consultarChequeEspecial() {
        if (saldo >= 0) {
            return chequeEspecial;
        } else {
            return chequeEspecial + saldo;
        }
    }

    public void pagarBoleto(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Pagamento de boleto no valor de R$" + valor + " realizado com sucesso.");
        } else if (valor <= saldo + chequeEspecial) {
            valorUsadoChequeEspecial = (valor - saldo);
            saldo -= valor;
            System.out.println("Pagamento de boleto de R$" + valor + " realizado. Usando cheque especial.");
        } else {
            System.out.println("Saldo insuficiente para pagar este boleto.");
        }
    }

    public void verificarUsoChequeEspecial() {
        if (this.saldo < 0) {
            System.out.println("Cheque especial utilizado");
        } else {
            System.out.println("Cheque especial nao utilizado");
        }
    }

    private void aplicarTaxaChequeEspecial() {
        if (saldo > 0 && valorUsadoChequeEspecial > 0) {
            double taxa = valorUsadoChequeEspecial * 0.2;
            saldo -= taxa;
            System.out.println("Foi aplicada uma taxa de R$" + taxa + " pelo uso do cheque especial.");
            valorUsadoChequeEspecial = 0;
        }
    }

}