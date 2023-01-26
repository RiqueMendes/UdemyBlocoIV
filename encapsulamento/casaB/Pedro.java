package encapsulamento.casaB;

import encapsulamento.casaA.Ana;

public class Pedro extends Ana {
    

    /* Ana mae = new Ana(); */  //Nao precisa instanciar, vem de herança

    void testeAcessos(){
      
        System.out.println(todosSabem); 
        System.out.println(formaDeFalar); //Somente via herança pois é protected
        
        System.out.println(new Ana().todosSabem); 
       

       
    }

}
