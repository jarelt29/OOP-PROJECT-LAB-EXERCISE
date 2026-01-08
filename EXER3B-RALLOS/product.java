public class Product {
    private String productName;
    private double pricePerUnit;
    private String unitType; // e.g., "kg", "sack"

    public Product(String productName, double pricePerUnit, String unitType) {
        this.productName = productName;
        this.pricePerUnit = pricePerUnit;
        this.unitType = unitType;
    }

    // Getter methods
    public String getProductName() {
        return productName;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public String getUnitType() {
        return unitType;
    }

    public String getDetails() {
        return productName + " - ₱" + String.format("%.2f", pricePerUnit) + " per " + unitType;
    }

    public void displayProduct() {
        System.out.println("Product Details:");
        System.out.println("  Name: " + productName);
        System.out.println("  Price: ₱" + String.format("%.2f", pricePerUnit) + " per " + unitType);
    }
}
