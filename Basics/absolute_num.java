package Basics;
import java.util.Scanner;
public class absolute_num{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter your number");
            int num = input.nextInt();
            System.out.println("the absolute value of the number is:" + Math.abs(num));
            input.close();
    }

}