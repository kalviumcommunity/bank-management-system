package bank.management.system;

public class User {
    private final int id;
    private final String name;
    private static int totalUsers = 0;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
        incrementTotalUsers(); // Encapsulation: Private method to increment totalUsers
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    private static void incrementTotalUsers() {
        totalUsers++; // Encapsulation: Private method to increment totalUsers
    }

    public static int getTotalUsers() {
        return totalUsers; // Static Element: Accessing a static variable
    }

    // Abstraction: Abstract method to display user details
    public void displayDetails() {
        System.out.println("User ID: " + getId());
        System.out.println("User Name: " + getName());
    }

    public static void createUserArray() {
        // Demonstrating Array of Objects
        // Creating an array of User objects
        User[] users = new User[3];
        users[0] = new User(1, "Amar");
        users[1] = new User(2, "Akbar");
        users[2] = new User(3, "Anthony");

        System.out.println("Total Users: " + User.getTotalUsers());

        // Demonstrating array of objects by calling displayDetails on each user
        for (User user : users) {
            user.displayDetails();
        }
    }

    public static void main(String[] args) {
        // Creating individual User instances
        User user1 = new User(1, "Osama");
        User user2 = new User(2, "Bin");
        User user3 = new User(3, "Laden");

        // Demonstrating getTotalUsers
        System.out.println("Total Users: " + User.getTotalUsers());

        // Displaying user details
        user1.displayDetails();
        user2.displayDetails();
        user3.displayDetails();

        // Calling the createUserArray method to demonstrate array of objects
        createUserArray();
    }
}

