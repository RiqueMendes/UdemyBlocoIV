package abstrato;

public class Cachorro extends Mamifero {
    

    @Override
    public String mover() {      
        return "Usando as patas";
    }
    
    
    @Override
    public String mamar() {
        return "Usando leite";
    }
    

    public String latir(){
        return "Latindo";
    }
   
}
