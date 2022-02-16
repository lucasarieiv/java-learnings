package Conta;

public class Teste {
    public static void main(String[] args) {
        Conta minhaConta;
        minhaConta = new Conta();
        minhaConta.titular = "Lucas";
        minhaConta.saldo = 1400.43;
        minhaConta.agencia = "1";
        minhaConta.numero = 723;
        minhaConta.dataAbertura = "03/02/2019";

        System.out.println(minhaConta.recuperarDadosParaImpressao());
        System.out.println("Rendimento: " + minhaConta.calculaRendimento());
    }
}