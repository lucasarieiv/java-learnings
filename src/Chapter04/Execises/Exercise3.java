package Chapter04.Execises;

public class Exercise3 {
    public static void main(String[] args) {
        Casa casa1 = new Casa();

        casa1.pinta("Verde");
        casa1.porta1.aberta = true;
        casa1.porta2.aberta = false;
        casa1.porta3.aberta = true;

        System.out.println("Cor da Casa: " + casa1.cor);
        System.out.println("Quantas portas estão abertas? " + casa1.quantasPortasEstaoAbertas() + " Portas");
    }
}
