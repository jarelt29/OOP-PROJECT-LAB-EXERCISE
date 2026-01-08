public class Farmer extends User {
    private String farmLocation;

    public Farmer(String userId, String name, String email, String farmLocation) {
        super(userId, name, email);
        this.farmLocation = farmLocation;
    }

    // Getter method
    public String getFarmLocation() {
        return farmLocation;
    }

    @Override
    public void displayProfile() {
        System.out.println("Farmer Profile:");
        System.out.println("  ID: " + userId);
        System.out.println("  Name: " + name);
        System.out.println("  Email: " + email);
        System.out.println("  Farm Location: " + farmLocation);
    }
}
