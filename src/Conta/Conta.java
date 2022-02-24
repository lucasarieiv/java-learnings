package Conta;

public class Conta {
    Data dataDeAbertura;
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
        String dados = "\nTitular: " + this.titular;
        dados += "\nSaldo: " + this.saldo;
        dados += "\nAgencia: " + this.agencia;
        dados += "\nNumero: " + this.numero;
        dados += "\nSaldo: " + this.saldo;
        dados += "\nData de Abertura: " + this.dataDeAbertura.formatada();
        return dados;
    }
}
