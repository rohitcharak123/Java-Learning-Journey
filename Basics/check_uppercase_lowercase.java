package Basics;
import java.util.Scanner;
public class check_uppercase_lowercase {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter a character");
        char ch = input.next().charAt(0);
        if(ch>='A' && ch<='Z'){
            System.out.println("uppercase");
        } else {
            System.out.println("lowercase");
        }
        input.close();
    }

}
