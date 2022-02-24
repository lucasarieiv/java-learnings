package Chapter04.Execises;

public class Exercise2 {
    public static void main(String[] args) {
        Porta porta1 = new Porta();

        porta1.aberta = false;
        porta1.cor = "Vermelho";
        System.out.println("Cor da Porta " + porta1.cor);
        porta1.pinta("Azul");
        porta1.abre();
        System.out.println("Cor da Porta " + porta1.cor);
        String estaAberta = porta1.estaAberta() ? "aberta" : "fechada";
        System.out.println("A porta está " + estaAberta);
    }
}
