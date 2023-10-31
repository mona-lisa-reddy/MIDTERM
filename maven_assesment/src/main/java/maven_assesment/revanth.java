package maven_assesment;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class revanth {
    public static Map<String, Integer> storedCredentials = new HashMap<>();

    public static void main(String[] args) {
        storedCredentials.put("revanth", 123);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Login Program!");
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

        System.out.print("Enter your IDE: ");
        int IDE = scanner.nextInt();

        if (validateLogin(username, IDE)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed. Invalid username or IDE.");
        }

        scanner.close();
    }

    public static boolean validateLogin(String username, int IDE) {
        Integer storedIDE = storedCredentials.get(username);
        return storedIDE != null && storedIDE == IDE;
    }
}


