package Chapter03;

public class Variaveis {
    public static void main(String[] args) {
        // Tipo int
        int quatro = 2 + 2;
        int tres = 5 -2;
        int oito = 4 * 2;
        int dezesseis = 64/4;
        int um = 5 % 2; // 5 dividido por 2 dá 2, e tem resto 1;
        // o operador % pega o resto da divisão inteira.

        // Tipo double
        double pi = 3.14;
        double x = 5 * 10;
        System.out.println(pi);
        System.out.println(x);

        // Tipo boolean
        boolean verdade = true;
        int idade = 30;
        boolean menorDeIdade = idade < 18;
        System.out.println(menorDeIdade);

        // Tipo char - tem que estar com aspas simples e não armazena '' pois vazio não é um caractere.

        char letra = 'a';
        System.out.println(letra);
    }
}
