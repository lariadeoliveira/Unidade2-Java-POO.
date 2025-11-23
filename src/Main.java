package exercicio1;

public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro("Corolla", 2020, 4, true);
        Moto moto = new Moto("CG 160", 2018, 160, true);

        carro.ligar();
        carro.abrirPortaMalas();

        System.out.println("-------------------");

        moto.ligar();
        moto.empinar();
    }
}
