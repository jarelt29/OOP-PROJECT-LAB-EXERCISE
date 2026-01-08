public class Buyer extends User {
    private String shippingAddress;

    public Buyer(String userId, String name, String email, String shippingAddress) {
        super(userId, name, email);
        this.shippingAddress = shippingAddress;
    }

    // Getter method
    public String getShippingAddress() {
        return shippingAddress;
    }

    @Override
    public void displayProfile() {
        System.out.println("Buyer Profile:");
        System.out.println("  ID: " + userId);
        System.out.println("  Name: " + name);
        System.out.println("  Email: " + email);
        System.out.println("  Shipping Address: " + shippingAddress);
    }
}
