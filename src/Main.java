
public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("latte", 1.99, 5);
        Product product2 = new Product("pane", 0.99, 5);
        Product product3 = new Product("farina", 2.99, 5);
        Product product4 = new Product("zucchero", 4.99, 5);
        Product product5 = new Product("sale", 1.99, 5);
        Product product6 = new Product("pepe", 0.50, 5);

        Order order = new Order();

        Client client = new Client("matteo", order);

        // adding product //

        client.getOrder().addProduct(product1);
        client.getOrder().addProduct(product2);
        client.getOrder().addProduct(product3);
        client.getOrder().addProduct(product4);
        client.getOrder().addProduct(product5);
        client.getOrder().addProduct(product6);  // this return false because the array is full //


        System.out.println(client);

        // product removal //

        client.getOrder().removeProduct("sale");

        System.out.println(client);

    }
}