package Chapter03;

public class Fibonacci {
    public static void main(String[] args) {
        int anterior = 0;
        int atual = 1;
        int proximo = 1;

        for (int i = 1; i < 100; i++) {
            System.out.print(proximo + " ");
            proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
            if (proximo > 100) {
                System.out.println(proximo);
                break;
            }
        }
    }
}