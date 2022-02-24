package Conta;

public class Teste {
    public static void main(String[] args) {
//        Exercicio 4
//        Conta c1 = new Conta();
//        c1.titular = "Lucas";
//        c1.saldo = 100;
//
//        Conta c2 = new Conta();
//        c2.titular = "Lucas";
//        c2.saldo = 100;
//
//        if (c1 == c2) {
//            System.out.println("Iguais");
//        } else {
//            System.out.println("C1: " + c1);
//            System.out.println("C2: " + c2);
//            System.out.println("Direferentes");
//        }

//        Exercicio 5
//        Conta c1 = new Conta();
//        c1.titular = "Lucas";
//
//        Conta c2 = new Conta();
//        c2.titular = "Lucas";
//        System.out.println(c2);
//        c2 = c1;

        Conta c1 = new Conta();
        Data data = new Data();
        c1.dataDeAbertura = data;

        c1.dataDeAbertura.day = 1;
        c1.dataDeAbertura.month = 12;
        c1.dataDeAbertura.year = 2022;

        System.out.println(c1.recuperarDadosParaImpressao());
    }
}