package Basics;
import java.util.Scanner;
public class eligible_to_vote_$_driving_licence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your age:");
        int age =input.nextInt();
        if(age>=18){
            System.out.println("you are eligible to vote");
        }else{
            System.out.println("you are not eligible to vote");
        }
        input.close();

    }
}

