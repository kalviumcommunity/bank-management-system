package bank.management.system;

public class PrimeUser extends User {
    private final String department;

    public PrimeUser(int id, String name, String department) {
        super(id, name); // Call the constructor of the superclass
        this.department = department;
    }

    // Implementation of the abstract method
    public void displayDetails() {
        super.displayDetails(); // Call the displayDetails method from the superclass
        System.out.println("Department: " + department);
    }

    public static void main(String[] args) {
        PrimeUser primeUser1 = new PrimeUser(4, "Mukesh", "J");
        PrimeUser primeUser2 = new PrimeUser(5, "Dhirubhai", "I");
        PrimeUser primeUser3 = new PrimeUser(6, "Ambani", "0");

        // Demonstrating getTotalUsers
        System.out.println("Total Users: " + User.getTotalUsers());

        // Displaying user details for employees
        primeUser1.displayDetails();
        primeUser2.displayDetails();
        primeUser3.displayDetails();
    }
}
