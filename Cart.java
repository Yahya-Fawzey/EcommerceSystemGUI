public class Cart {
    private int customerId;
    private int nProducts;
    private Product[] products;

    public Cart(int customerId, int nProducts){
        this.customerId = customerId;
        this.nProducts = nProducts;
        this.products = new Product[nProducts];
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setnProducts(int nProducts) {
        this.nProducts = nProducts;
    }

    public int getnProducts() {
        return nProducts;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public Product[] getProducts() {
        return products;
    }

}