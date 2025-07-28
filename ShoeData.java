public class ShoeData {
    public String name;
    public double price;
    public int quantity;

    public ShoeData(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotal() {
        return price * quantity;
    }
}