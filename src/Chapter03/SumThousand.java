package Chapter03;

public class SumThousand {
    public static void main(String[] args) {
        int sum = 0;
        for (int i=1; i <= 1000; i++) {
            sum += i;
            System.out.println(sum);
        }
    }
}
