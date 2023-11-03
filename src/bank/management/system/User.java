package bank.management.system;

public class User {
    private final int id;
    private final String name;
    private static int totalUsers = 0;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
        totalUsers++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static int getTotalUsers() {
        return totalUsers;
    }

    public static void createUserArray() {
        // Creating an array of User objects
        User[] users = new User[3];
        users[0] = new User(1, "Alice");
        users[1] = new User(2, "Bob");
        users[2] = new User(3, "Charlie");

        System.out.println("Total Users: " + User.getTotalUsers());
        printUserDetails(users);
    }

    public static void printUserDetails(User[] users) {
        // Accessing and printing the details of each user
        for (User user : users) {
            System.out.println("User ID: " + user.getId());
            System.out.println("User Name: " + user.getName());
        }
    }

    public static void main(String[] args) {
        createUserArray();
    }
}
