package jogo;

public class Monstro extends Jogador{
    

    
    boolean atacar(Jogador oponente) {
        int deltaX = Math.abs(x - oponente.x);
        int deltaY = Math.abs(y - oponente.y);

        if (deltaX == 0 && deltaY == 1) {
            oponente.vida -= 15;
            return true;
        } else if (deltaX == 1 && deltaY == 0) {
            oponente.vida -= 15;
            return true;
        } else {
            return false;
        }

    }

    boolean derrotado(Jogador oponente){
        if(oponente.vida <= 0){
            System.out.println("derrotado");
        } else{
            return false;
        }

        return true;
    }
    
}
