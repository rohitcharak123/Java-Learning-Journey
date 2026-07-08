import java.util.Scanner;
public class check_no_even_odd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your number:");
        int num = input.nextInt();
        if (num % 2 ==0){
            System.out.println("the number is even");
        }else{
            System.out.println("the number is odd");
        }
        input.close();
        }
    }
