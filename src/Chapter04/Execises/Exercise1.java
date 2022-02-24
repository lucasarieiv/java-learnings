package Chapter04.Execises;

public class Exercise1 {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Lucas";
        pessoa.idade = 22;
        System.out.println(pessoa.idade);
        pessoa.fazAniversario();
        pessoa.fazAniversario();
        pessoa.fazAniversario();
        System.out.println("Nome: " + pessoa.nome + " Data: " + pessoa.idade);
    }
}
