package Conta;

public class Conta {
    String titular;
    int numero;
    String agencia;
    double saldo;
    String dataAbertura;

    void sacar(double quantidade) {
        this.saldo -= quantidade;
    }

    void depositar(double quantidade) {
        this.saldo += quantidade;
    }

    double calculaRendimento() {
        return this.saldo * 0.1;
    }

    String recuperarDadosParaImpressao() {
        return "Titular: " + this.titular + "\nSaldo: " + this.saldo + "\nAgencia: " + this.agencia + "\nNumero: " +
                this.numero + "\nData de Abertura: " + this.dataAbertura;
    }
}
