package Chapter03;

public class Main {
    public static void main(String[] args) {

        // Exercicio 01 - Tipos primitivos
        int janeiro = 15000;
        int fevereiro = 23000;
        int marco = 17000;
        int totalDespesaTrimestre = janeiro + fevereiro + marco;
        int mediaMensalGasto = (janeiro + fevereiro + marco) / 3;

      System.out.println("Total de Despesa do Trimestre: " + totalDespesaTrimestre);
      System.out.println("Média mensal de Gastos: " + mediaMensalGasto);
    }
}
