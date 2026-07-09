package switch_code;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter first number");
        int num1 = input.nextInt();
        System.out.println("enter second number");
        int num2 = input.nextInt();
        System.out.println("enter operator");
        String op = input.next();
        switch(op){
            case "+":
                System.out.println("result is: " + (num1 + num2));
                break;
            case "-":
                System.out.println("result is: " + (num1 - num2));
                break;
            case "*":
                System.out.println("result is: " + (num1 * num2));
                break;
            case "/":
                if(num2 != 0){
                    System.out.println("result is: " + (num1 / num2));
                }else{
                    System.out.println("division by zero is not allowed");
                }
                break;
            default:
                System.out.println("invalid operator");
        }
        input.close();
    }
    
}
