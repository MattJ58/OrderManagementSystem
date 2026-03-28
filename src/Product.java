public class Product {
    private final String name;
    private final double price;
    private int amount;

    public Product(String name, double price, int amount){
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public boolean addedToCart(){
        this.amount --;
        return true;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString(){
        return "\nnome: " + this.name + "\nprezzo: " + this.price + "\nquantita: " + this.amount + "\n";
    }

}
