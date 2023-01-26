package polimorfismo;

public class Pessoa {
    

    private double peso;

    public Pessoa(double peso){
        setPeso(peso);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if(peso >= 0){
            this.peso = peso;
        }
    }


    //Sobrecarga de método
    public void comer(Comida comida){
        this.peso += comida.getPeso();
    }
   


    void pesoIdeal(){
        if(peso <= 77){
            System.out.println("Peso Ideal");
        }
        else{
            System.out.println("Acima do peso");
        }
    }


   
}
