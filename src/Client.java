import java.util.Arrays;

public class Client {
    private String name;
    private Order order;

    public Client(String name, Order order){
        this.name = name;
        this.order = order;
    }

    public String getName() {
        return name;
    }

    public Order getOrder() {
        return order;
    }

    @Override
    public String toString(){
        return "nome: " + this.name + "\nordine:\n" + this.order + "\n";
    }


}


