package Basics;
import java.util.Scanner;
public class div_5{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter your number");
        int num = input.nextInt();
        if(num%5==0){
            System.out.println("divisible by 5");
        }else{
                System.out.println("not divisible by 5");
            }
        input.close();
    }
    
}
