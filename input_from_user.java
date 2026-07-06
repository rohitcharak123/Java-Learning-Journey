import java.util.Scanner;
    public class input_from_user{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("enter your name:");
            String name = sc.nextLine();

            System.out.println("name:" + name);
            System.out.print("enter your age:");
            int age = sc.nextInt();
            System.out.println("Age: " + age);
            sc.close();
        }
    }

