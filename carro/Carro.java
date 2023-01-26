package carro;

public class Carro {

   public int velocidadeAtual = 15;

    final int VELOCIDADE_MAXIMA;
    int velocidadeMaxima;
    int delta = 5;



   protected Carro(int velocidadeMaxima){
    VELOCIDADE_MAXIMA = velocidadeMaxima;
    }
   
    public void acelerar(Carro carro) {
       if(velocidadeMaxima + delta > VELOCIDADE_MAXIMA){
        velocidadeAtual = VELOCIDADE_MAXIMA;
       }else {
        velocidadeAtual += delta;
       }

    }

   public void frear() {
        if (velocidadeAtual >= delta) {
            velocidadeAtual -= delta;
        } else {
           velocidadeAtual = 0;
        }

    }
}
