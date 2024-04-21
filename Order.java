public class Order {
    private int customerId;
    private int orderId;
    private Product[] products;
    private float totalPrice;

    public Order(int customerId, int orderId, float totalPrice){
        this.customerId = Math.abs(customerId);
        this.orderId = Math.abs(orderId);
        this.totalPrice = Math.abs(totalPrice);
        this.products = products;
    }

    public void setCustomerId(int customerId) {
        this.customerId = Math.abs(customerId);
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setOrderId(int orderId) {
        this.orderId = Math.abs(orderId);
    }

    public int getOrderId() {
        return orderId;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }
    public Product[] getProducts(){
        return products;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

}
