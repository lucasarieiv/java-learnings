package Chapter03;

public class LoopFor {
    public static void main(String[] args) {
//        A mesma ideia do While. Mas, além disso, o for isola também um espaço para inicilização de variáveis e o
//        modificador dessas variáveis. Isso faz com que as variáveis relacionadas ao loop fiquem mais legíveis:
//        for (inicilizacao, condicao, incremento) {
//            codigo
//        }

//        for (int i = 1; i < 10; i++) {
//            System.out.println(i + " - Olá!");
//        }

//        Observacao
//        Pos incremento
//        int i = 5;
//        int x = i++; aqui x valerá 5

//        Pre incremento
//        int i = 5;
//        int x = ++i; aqui x valerá 6

//        for (int i = 20; i < 100; i++) {
//            if (i % 19 == 0) {
//                System.out.println("Achei um número divisível por 19 entre x e y " + i);
//                break;
//            }
//        }

//        O continue faz com que o loop siga para o próximo laço e não execulte os comandos abaixos.

        for (int i = 0; i < 100; i++) {
            if (i > 50 && i < 60) {
                continue;
            }
            System.out.println(i); // Neste caso não irá imprimir de 50 à 59
        }

    }
}
