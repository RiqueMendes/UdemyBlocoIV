package encapsulamento;

public class PessoaTeste {
    
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa(15, "Carlos");

        p1.setIdade(-15);
        System.out.println(p1.getIdade());

        Pessoa p2 = new Pessoa(-15, "Joao");

        System.out.println(p2.getIdade());
        

        Pessoa p3 = new Pessoa(150, "Maria");

        System.out.println(p3.getIdade());

        System.out.println(p2);
    }
}
