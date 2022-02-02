package Chapter03;

public class Multiples {
    public static void main(String[] args) {
        int multiples = 0;
        for (int i=1; i < 100; i++) {
            multiples = i % 3;
            if (multiples == 0) {
                System.out.println(i);
            }
        }
    }
}
