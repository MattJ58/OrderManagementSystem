
public class Main {
    public static void main(String[] args) {
        Product prodotto1 = new Product("latte", 1.99, 5);
        Product prodotto2 = new Product("pane", 0.99, 5);
        Product prodotto3 = new Product("farina", 2.99, 5);
        Product prodotto4 = new Product("zucchero", 4.99, 5);
        Product prodotto5 = new Product("sale", 1.99, 5);
        Product prodotto6 = new Product("pepe", 0.50, 5);

        Order ordine = new Order();

        Client cliente = new Client("matteo", ordine);

        // Prodotto aggiunto all'Ordine

        cliente.getOrder().addProduct(prodotto1);
        cliente.getOrder().addProduct(prodotto2);
        cliente.getOrder().addProduct(prodotto3);
        cliente.getOrder().addProduct(prodotto4);
        cliente.getOrder().addProduct(prodotto5);
        cliente.getOrder().addProduct(prodotto6);


        System.out.println(cliente);

        // rimozione prodotto //

        cliente.getOrder().removeProduct("sale"); //rimuoviamo sale

        System.out.println(cliente);

    }
}