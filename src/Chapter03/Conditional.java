package Chapter03;

public class Conditional {
    public static void main(String[] args) {
        // Estrutura
//        if (condicaoBooleana) {
//            codigo;
//        }

//        int idade = 18;
//
//        if (idade < 18) {
//            System.out.println("Não pode entrar");
//        } else {
//            System.out.println("Pode Entrar");
//        }

//        Operadores Lógicos "E" && e "OU" ||

        int idade = 15;
        boolean amigoDoDono = true;
        if (idade < 18 && !amigoDoDono) {
            System.out.println("Não pode entrar");
        } else {
            System.out.println("Pode entrar");
        }
    }
}
