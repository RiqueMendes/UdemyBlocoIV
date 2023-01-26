package encapsulamento.casaB;



import encapsulamento.casaA.Ana;

public class Julia {
    

    //Nao existe herança entre Ana e Julia

    Ana sogra = new Ana();

    void testeAcessos(){
        System.out.println(sogra.todosSabem);
    }
}
