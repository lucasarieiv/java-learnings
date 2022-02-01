package Chapter03;

public class LoopWhile {
    public static void main(String[] args) {
//        O While é um comando usado para fazer laço (loop), isto é, repetir um trecho de código
//        algumas vezes. A ideia é que esse trecho de código seja repetido enquanto uma determinada condição
//        permanecer verdadeira.

        int idade = 15;
        while (idade < 18) {
            System.out.println(idade);
            idade = idade + 1;
        }
    }
}
