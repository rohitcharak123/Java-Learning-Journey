package Basics;
import java.util.Scanner;
public class check_eligible_dl {
 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter your marks:");
    int marks = scanner.nextInt();
    if (marks >=40) {
        System.out.println("passed");
    }else{
        System.out.println("failed");
    }
    scanner.close();

 }
}

