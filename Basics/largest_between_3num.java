package Basics;
import java.util.Scanner;
public class largest_between_3num {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your first number");
        int num1 = input.nextInt();
        System.out.println("enter your second number");
        int num2 = input.nextInt();
        System.out.println("enter your third number");
        int num3 = input.nextInt();
        int largest = Math.max(num1, Math.max(num2, num3));
        System.out.println("the largest number is: " + largest);
        input.close();
    }
    
}
