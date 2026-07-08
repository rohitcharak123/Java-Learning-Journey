package Basics;
import java.util.Scanner;
public class check_div_both_3_5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter your number");
        int num = input.nextInt();
        if(num%3==0 && num%5==0){
            System.out.println("divisible by both 3 and 5");
        }else{
            System.out.println("not divisible by both 3 and 5");
        }
        input.close();
    }
    
}
