package Basics;
import java.util.Scanner;

public class check_vowel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a character");
        char ch = input.next().charAt(0);
        ch = Character.toLowerCase(ch);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            {System.out.println("vowel");}
        }else if(ch>='a' && ch<='z'){
            System.out.println("consonant");
        }
        else{
            System.out.println("invalid input");
        }
        input.close();
        }
    }
    

