package Basics;
import java.util.Scanner;
public class larg_two_num {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.println("enter your first number");
            int num1 =input.nextInt();
        System.out.println("enter your second number");
            int num2 = input.nextInt();

        if (num1>num2){
            System.out.println("the largest number is:"+ num1);
        }
        else{
            System.out.println("the largest number is:"+ num2);
        }
        input.close();
    }
    
}
