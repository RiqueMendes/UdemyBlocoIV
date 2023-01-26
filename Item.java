public class Item {
    

    String nome;
    int quantidade;
    double preco;
    Compra compra; //Associei uma compra ao item

    Item(String nome, int quantidade , double preco){
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }
}
