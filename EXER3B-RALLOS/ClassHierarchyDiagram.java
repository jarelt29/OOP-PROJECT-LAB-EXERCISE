Class Hierarchy Diagram

AgriTrack System - Class Structure

```
                    ┌─────────────────────┐
                    │      User           │
                    │  (Abstract Class)   │
                    ├─────────────────────┤
                    │ - userId: String    │
                    │ - name: String      │
                    │ - email: String     │
                    ├─────────────────────┤
                    │ + User(...)         │
                    │ + getUserId()       │
                    │ + getName()         │
                    │ + getEmail()        │
                    │ + displayProfile()  │
                    │   (abstract)        │
                    └─────────────────────┘
                            ▲
                            │
            ┌───────────────┴───────────────┐
            │                               │
            │                               │
    ┌───────┴────────┐            ┌────────┴────────┐
    │    Farmer      │            │     Buyer      │
    │  (Subclass)    │            │   (Subclass)   │
    ├────────────────┤            ├────────────────┤
    │ - farmLocation │            │ - shippingAddr │
    │   : String     │            │   : String     │
    ├────────────────┤            ├────────────────┤
    │ + Farmer(...)  │            │ + Buyer(...)   │
    │ + getFarmLoc() │            │ + getShipping  │
    │ + displayProf()│            │   Address()    │
    │   (override)   │            │ + displayProf()│
    └────────────────┘            │   (override)   │
                                  └────────────────┘

    ┌─────────────────────┐
    │      Product        │
    │   (Standalone)      │
    ├─────────────────────┤
    │ - productName       │
    │ - pricePerUnit      │
    │ - unitType          │
    ├─────────────────────┤
    │ + Product(...)      │
    │ + getProductName()  │
    │ + getPricePerUnit() │
    │ + getUnitType()     │
    │ + getDetails()      │
    │ + displayProduct()  │
    └─────────────────────┘
```

Class Relationships

Inheritance Hierarchy
- User (Abstract Base Class)
  - Farmer (Concrete Subclass)
  - Buyer (Concrete Subclass)

Standalone Class
- Product (Independent class, not part of User hierarchy)

Class Descriptions

1. User (Abstract Class)
- Purpose: Base class representing a user in the system
- Attributes:
  - `userId`: Unique identifier for the user
  - `name`: User's full name
  - `email`: User's email address
- Methods:
  - Constructor: Initializes user with ID, name, and email
  - `getUserId()`, `getName()`, `getEmail()`: Getter methods
  - `displayProfile()`: Abstract method to be implemented by subclasses

2. Farmer (Subclass of User)
- Purpose: Represents a farmer/seller in the system
- Additional Attributes:
  - `farmLocation`: Location of the farm
- Methods:
  - Constructor: Initializes farmer with user info and farm location
  - `getFarmLocation()`: Returns the farm location
  - `displayProfile()`: Overrides parent method to display farmer-specific info

3. Buyer (Subclass of User)
- Purpose: Represents a buyer/customer in the system
- Additional Attributes:
  - `shippingAddress`: Delivery address for purchases
- Methods:
  - Constructor: Initializes buyer with user info and shipping address
  - `getShippingAddress()`: Returns the shipping address
  - `displayProfile()`: Overrides parent method to display buyer-specific info

4. Product (Standalone Class)
- Purpose: Represents a product/item in the system
- Attributes:
  - `productName`: Name of the product
  - `pricePerUnit`: Price for one unit
  - `unitType`: Type of unit (e.g., "kg", "sack")
- Methods:
  - Constructor: Initializes product with name, price, and unit type
  - `getProductName()`, `getPricePerUnit()`, `getUnitType()`: Getter methods
  - `getDetails()`: Returns formatted product details
  - `displayProduct()`: Displays complete product information

Design Patterns Used

1. Inheritance: Farmer and Buyer inherit from User
2. Polymorphism: Abstract method `displayProfile()` is overridden in subclasses
3. Encapsulation: All attributes are private/protected with public getter methods
