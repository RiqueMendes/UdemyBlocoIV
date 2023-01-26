import java.util.ArrayList;

public class Compra {
    
    String cliente;
    ArrayList<Item> itens = new ArrayList<>(); //Itens é o meu array de item dentro de Compra

    void adicionarItem(Item item){ // Recebe o item como parametro
        itens.add(item); // ADD do list em itens (meu array) adicionando o proprio item
        item.compra = this; //Referenciando compra
    }


    double getValorTotal(){
       double total = 0;
       for(Item item: itens) {
        total += item.quantidade * item.preco;
       }
       return total;
    }
}
