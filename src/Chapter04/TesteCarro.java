package Chapter04;

public class TesteCarro {
    public static void main(String[] args) {
        Carro meuCarro;
        Motor motorCarro = new Motor();
        meuCarro = new Carro();
        meuCarro.motor = motorCarro;
        meuCarro.motor.potencia = 1200;
        meuCarro.motor.tipo = "V8";
        meuCarro.cor = "Vermelho";
        meuCarro.modelo = "Honda Civic";
        meuCarro.velocidadeAtual = 0;
        meuCarro.velocidadeMaxima = 80;

        System.out.println("Cor " + meuCarro.cor + " Modelo " + meuCarro.modelo + " Velocidade Atual " + meuCarro.velocidadeMaxima + "(km/h)");
        System.out.println("Motor: " + meuCarro.motor.tipo + " Potencia: " + meuCarro.motor.potencia + " cavalos");
        // liga carro
        meuCarro.liga();

        // acelera carro;
        meuCarro.acelera(20);
        System.out.println(meuCarro.velocidadeAtual);
        meuCarro.acelera(40);
        System.out.println(meuCarro.velocidadeAtual);
    }
}
