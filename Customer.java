public class Customer {
    private int customerId;
    private String name;
    private String address;

    public Customer(int customerId, String name, String address){
        this.customerId = Math.abs(customerId);
        this.name = name;
        this.address = address;
    }

    public void setCustomerId(int customerId) {
        this.customerId = Math.abs(customerId);
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

}