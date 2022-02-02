package Chapter03;

public class Scope {
    public static void main(String[] args) {
        // aqui, a variável i não existe
//        int i = 5;
        // a partir daqui, ela existe.

//        while (true) {
            // o i ainda vale aqui.
//            int j = 7;
            // o j passa a existir
//        }

        // aqui, o j não existe mais, porém o i continua dentro d oescopo.

//        if (true) {
//            int i = 5;
//        } else {
//            int i = 10;
//        }
        // System.out.println(i);  cuidado!
        // Se você declarar a variável antes do if, haverá outro erro de compilação: dentro do if e do else, a variável
        // está sendo redeclarada. Então, o código para compilar e fazer sentido fica:

//        int i;
//        if (true) {
//            i = 5;
//        } else {
//            i = 10;
//        }
//        System.out.println(i);
//
//        for (int i = 0; i < 10; i++) {
//            System.out.println("Olá!");
//        }

//        System.out.println(i); // Cuidado

        // Nesse for, a variável i morre ao seu término, não podendo ser acessada de fora do for e gerando um erro de
        // compilação. Se você realmente quer acessar o contador depois do loop terminar precisa de algo como:

//        int i;
//        for (i = 0; i < 10; i++) {
//            System.out.println("Olá!");
//        }
//        System.out.println(i);

        // Um bloco dentro do outro
        // Um bloco também pode ser declarado dentro do outro. Isto é, um if dentro de um for, ou um for dentro de um
        // for, algo como:

//        while (true) {
//            for (int i = 0; i < 10; i++) {
//                // código
//            }
//        }

        // PARA SABER MAIS:
        // - O Java tem o do..while e o switch;
        // - labeled loops para ajudar no encadeamento de loops;
        // - Existe um caminho entre os tipos primitivos que indica se há a necessidade ou não de casting entre
        //   os tipos. Por exemplo, int -> long -> double (um int pode ser tratado como um double ,
        //   mas não o contrário). Pesquise (ou teste) e posicione os outros tipos primitivos nesse fluxo.
        // - Além dos operadores de incremento, existem os de decremento, como --i e i-- . Em adição a
        //   esses, você pode usar instruções do tipo i += x e i -= x . O que essas instruções fazem? Testeas.
    }
}
