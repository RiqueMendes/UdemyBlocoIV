package abstrato;

public class TesteAbstrato {

    public static void main(String[] args) {

        Animal a = new Cachorro();


        System.out.println(a.mover());
        System.out.println(a.respirar()); //Neste caso ANIMAL só pode mover e respirar


        Mamifero b = new Cachorro(); //Mamifero já implementou MAMAR
        b.mamar();
        b.mover();
        b.respirar();

        Cachorro c = new Cachorro();

        c.mamar();
        c.mover();
        c.respirar();  
        c.latir();  //Cachorro implementou tudo e tem o método latir

    }
}
