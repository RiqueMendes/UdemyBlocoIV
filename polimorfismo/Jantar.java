package polimorfismo;

public class Jantar {

    public static void main(String[] args) {

        Pessoa convidado = new Pessoa(75.5);

        Arroz ingrediente1 = new Arroz(0.5);
        Feijao ingrediente2 = new Feijao(0.5);

        System.out.println(convidado.getPeso());

        convidado.comer(ingrediente1);
        convidado.comer(ingrediente2);
      
        System.out.println(convidado.getPeso());

        Sorvete sobremesa = new Sorvete(0.4);

        convidado.comer(sobremesa);

        System.out.println(convidado.getPeso());

        convidado.pesoIdeal();


        Comida ingrediente3 = new Arroz(0.5);

        
    }

}
