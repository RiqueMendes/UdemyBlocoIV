package carro.testeHeranca;

import carro.Ferrari;

public class CarroTeste {
    

    public static void main(String[] args) {

        
        Ferrari f1 = new Ferrari();

        f1.acelerar(f1);

        System.out.println(f1.velocidadeAtual);
    }
  

}
