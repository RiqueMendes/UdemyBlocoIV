package carro;

import carro.testeHeranca.Esportivo;

public class Ferrari extends Carro implements Esportivo {


   public Ferrari(int velocidadeMaxima){
        super(velocidadeMaxima); //Caso nao tenha um construtor padrão
        delta = 15;
    }


   public Ferrari(){
        this(315);
    }

    
    @Override
    public void acelerar(Carro carro) {

        for (int i = 0; i < 3; i++) {
            super.acelerar(carro);

        }

    }

    @Override
    public void ligarTurbo() {
       delta = 35;
        
    }

    @Override
    public void desligarTurbo() {
        delta = 15;
        
    }

}
