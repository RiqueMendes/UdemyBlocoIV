public class CompraTeste {
    public static void main(String[] args) {

        Compra c1 = new Compra();
        c1.cliente = "joao";
        c1.adicionarItem(new Item("Caneta", 20, 7.45)); // Metodo adicionar que vem de Compra
        c1.adicionarItem(new Item("Borracha", 10, 5.45));
        c1.adicionarItem(new Item("Caderno", 3, 17.47));

        System.out.println(c1.itens.size());

        System.out.println(c1.getValorTotal());

      //Somente pra mostrar a relação bidirecional!!!
      double total = c1.itens.get(0).compra
        .itens.get(1).compra.getValorTotal();

      System.out.println("O valor total é " + total);
    }
}
