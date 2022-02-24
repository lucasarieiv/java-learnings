package Chapter04.Execises;

public class Casa {
    String cor;
    Porta porta1 = new Porta();
    Porta porta2 = new Porta();
    Porta porta3 = new Porta();

    void pinta(String s) {
        this.cor = s;
    }

    int quantasPortasEstaoAbertas() {
        int portasAbertas = 0;
        portasAbertas = (porta1.aberta) ? 1 : 0;
        portasAbertas += (porta2.aberta) ? 1 : 0;
        portasAbertas += (porta3.aberta) ? 1 : 0;

        return portasAbertas;
    }

}
