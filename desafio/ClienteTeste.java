package desafio;

public class ClienteTeste {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("Maria");

        Compra compra = new Compra();

        compra.adicionarItem("Caneta", 2.5, 5);
        compra.adicionarItem("Notebook", 785.5, 2);
        compra.adicionarItem("Caderno", 17.00, 8);

        Compra compra2 = new Compra();

        compra2.adicionarItem("Caneta", 2.5, 7);
        compra2.adicionarItem("Notebook", 785.5, 1);
        compra2.adicionarItem("Caderno", 17.00, 8);

        cliente.compras.add(compra);
        cliente.compras.add(compra2);


        System.out.println(cliente.getValorTotal());
    }
}
