import java.util.Arrays;

public class Order {
    private Product[] products;
    private double total;

    public Order() {
        this.products = new Product[5];
        this.total = 0;
    }

    public boolean addProduct(Product product) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                products[i] = product;
                total += product.getPrice();
                product.addedToCart();
                return true;    // Prodotto Aggiunto //
            }
        }
        return false;   // Array pieno //
    }

    public boolean removeProduct(String k) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].getName().equals(k)) {
                total -= products[i].getPrice();
                products[i] = null;
                return true;
            }
        }
        return false;
    }

    public Product[] getProducts() {
        return products;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "prodotti:\n" + Arrays.toString(this.products) + "\ntotale: " + this.total + "\n";
    }

}
