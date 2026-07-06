import java.util.Scanner;
public class sum_of_two_numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your first number:");
        int num1 = input.nextInt();
        System.out.println("enter your second number:");
        int num2 = input.nextInt();
        System.out.println("the sum of " + num1 + " and " + num2 + " is " + (num1 + num2)); 
        input.close();
    }
}
