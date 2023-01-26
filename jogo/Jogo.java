package jogo;

public class Jogo {
    
    public static void main(String[] args) {
        
        Heroi j1 = new Heroi(); //HERANÇA
        j1.x = 10;
        j1.y = 20;

        Monstro j2 = new Monstro();
        j2.x = 10;
        j2.y = 21;

        System.out.println(j1.x);
        System.out.println(j1.y);
        System.out.println(j1.vida);
        System.out.println(j2.vida);

       
        System.out.println(j1.atacar(j2));
        System.out.println(j1.atacar(j2));

        System.out.println(j1.vida);
        System.out.println(j2.vida);

        System.out.println(j2.derrotado(j2));

        System.out.println(j1.atacar(j2));
        System.out.println(j1.atacar(j2));
        System.out.println(j1.atacar(j2));
      
        System.out.println(j2.derrotado(j2));
    }
}
