package jogo;

public class Jogador {

    int x;
    int y;
    int vida = 100;

    

    boolean andar(Direcao direcao) {

        switch (direcao) {
            case NORTE:
                y--;
                break;

            case LESTE:
                x++;
                break;

            case SUL:
                y++;
                break;

            case OESTE:
                x--;
                break;
        }

        return true;

    }

    boolean atacar(Jogador oponente) {
        int deltaX = Math.abs(x - oponente.x);
        int deltaY = Math.abs(y - oponente.y);

        if (deltaX == 0 && deltaY == 1 && vida >=0) {
            oponente.vida -= 10;
            return true;
        } else if (deltaX == 1 && deltaY == 0  && vida >=0) {
            oponente.vida -= 10;
            return true;
         
        } else{
            return true;
        }

    }

  
}