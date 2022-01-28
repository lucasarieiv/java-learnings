package Chapter03;

public class Main {
    public static void main(String[] args) {

        // Exercicio 01 - Tipos primitivos
        int janeiro = 15000;
        int fevereiro = 23000;
        int marco = 17000;
        int totalDespesaTrimestre = janeiro + fevereiro + marco;
        int mediaMensalGasto = (janeiro + fevereiro + marco) / 3;

//      System.out.println("Total de Despesa do Trimestre: " + totalDespesaTrimestre);
//      System.out.println("Média mensal de Gastos: " + mediaMensalGasto);

//      Processo de Casting
//      double d3 = 3.9;
//      int i = (int) d3;
//      System.out.println(i);

//      Casting long
//      long x = 1000;
//      int y = (int) x;
//      System.out.println(y);

//        float x = 1.0f;
//        System.out.println(x);

        double d = 5;
        float f = 3;
        float x = f + (float) d;
        System.out.println(x);
    }
}
