package Basics;

import java.util.Scanner;

public class Check_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your number:");
        int num = input.nextInt();
        if (num > 0) {
            System.out.println("the number is positive");
        } else if (num == 0) {
            System.out.println("the number is zero");
        } else {
            System.out.println("the number is negative");
        }
        
    input.close();}
}
