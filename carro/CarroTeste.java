package carro;

public class CarroTeste {

    public static void main(String[] args) {

        Ferrari f1 = new Ferrari();

        f1.acelerar(f1);

        System.out.println(f1.velocidadeAtual);

        f1.ligarTurbo();

        System.out.println(f1.velocidadeAtual);
    }
}
