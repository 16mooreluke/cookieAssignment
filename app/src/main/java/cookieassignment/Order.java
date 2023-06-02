package cookieassignment;

public class Order {
    private int quantity;
    private String variety;

    public int getQuantity() {
        return quantity;
    }
    public String getVariety() {
        return variety;
    }
    public Order(String variety, int quantity) {
        this.variety = variety;
        this.quantity = quantity;
    }
}
