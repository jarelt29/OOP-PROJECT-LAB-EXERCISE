public class ProjectTester {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("   AgriTrack System - Project Tester");
        System.out.println("==========================================\n");

        // 1. Create instances of User subclasses (Farmer and Buyer)
        System.out.println("--- Creating User Instances ---");
        Farmer farmer1 = new Farmer("F001", "Mang Juan", "juan@farm.com", "Benguet");
        Farmer farmer2 = new Farmer("F002", "Maria Santos", "maria@farm.com", "Laguna");
        
        Buyer buyer1 = new Buyer("B101", "Alice Smith", "alice@email.com", "Manila");
        Buyer buyer2 = new Buyer("B102", "John Doe", "john@email.com", "Quezon City");

        // 2. Create instances of Product
        System.out.println("--- Creating Product Instances ---");
        Product product1 = new Product("Organic Highland Cabbage", 45.00, "kg");
        Product product2 = new Product("Fresh Tomatoes", 80.00, "kg");
        Product product3 = new Product("Premium Rice", 50.00, "sack");

        // 3. Display all User profiles
        System.out.println("\n--- Displaying User Profiles ---\n");
        System.out.println("=== FARMER INSTANCES ===");
        farmer1.displayProfile();
        System.out.println();
        farmer2.displayProfile();
        
        System.out.println("\n=== BUYER INSTANCES ===");
        buyer1.displayProfile();
        System.out.println();
        buyer2.displayProfile();

        // 4. Display all Products
        System.out.println("\n--- Displaying Product Information ---\n");
        product1.displayProduct();
        System.out.println();
        product2.displayProduct();
        System.out.println();
        product3.displayProduct();

        // 5. Demonstrate transactions
        System.out.println("\n--- Transaction Simulation ---");
        System.out.println("Transaction 1:");
        System.out.println("  " + buyer1.getName() + " purchased " + product1.getDetails() + " from " + farmer1.getName());
        
        System.out.println("\nTransaction 2:");
        System.out.println("  " + buyer2.getName() + " purchased " + product2.getDetails() + " from " + farmer2.getName());

        System.out.println("\nTransaction 3:");
        System.out.println("  " + buyer1.getName() + " purchased " + product3.getDetails() + " from " + farmer1.getName());

        // 6. Summary
        System.out.println("\n==========================================");
        System.out.println("   System Summary");
        System.out.println("==========================================");
        System.out.println("Total Farmers: 2");
        System.out.println("Total Buyers: 2");
        System.out.println("Total Products: 3");
        System.out.println("Total Transactions: 3");
        System.out.println("==========================================");
    }
}
