package Basics;
import java.util.Scanner;
public class atm_login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int correctpin=1234;
        int attempts=0;
        boolean success= false;
        final int MAX_ATTEMPTS = 3;
        while (attempts < MAX_ATTEMPTS && !success) {
            System.out.println("Enter your PIN:");
            int pin = scanner.nextInt();
            if (pin == correctpin) {
                System.out.println("Login successful");
                success = true;
            } else {
                System.out.println("Login failed");
                attempts++;
                if (attempts < MAX_ATTEMPTS) {
                    System.out.println("Try again (" + (MAX_ATTEMPTS - attempts) + " attempts left)");
                }
            }
        }
        if (!success) {
            System.out.println("Too many attempts");
        }
        scanner.close();
        // Code for ATM login functionality will go here
    }}
