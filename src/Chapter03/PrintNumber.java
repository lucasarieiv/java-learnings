package Chapter03;

public class PrintNumber {
    public static void main(String[] args) {
        for (int i = 1; i <= 300; i++) {
            if (i < 150) {
                continue;
            }
            System.out.println(i);
        }
    }
}
