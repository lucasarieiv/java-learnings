package Chapter03;

public class Factorial {
    public static void main(String[] args) {
        long fatorial = 1;
        for (int n = 1; n <= 30; n++) {
            fatorial = fatorial * n;
            System.out.println(fatorial + "!");
        }
    }
}
