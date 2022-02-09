package Chapter04;

public class Teste {
    public static void main(String[] args) {
        Conta minhaConta = new Conta();
        minhaConta.titular.nome = "Lucas";

        System.out.println(minhaConta.titular.nome);
    }
}