package exercicio1;

public class Carro extends Veiculo {
    private int portas;
    private boolean arCondicionado;

    public Carro(String modelo, int ano, int portas, boolean arCondicionado) {
        super(modelo, ano);
        this.portas = portas;
        this.arCondicionado = arCondicionado;
    }

    public void abrirPortaMalas() {
        System.out.println("Abrindo porta-malas do carro: " + modelo);
    }
}
