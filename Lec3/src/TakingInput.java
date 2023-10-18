import java.util.Scanner;
public class TakingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String userName = sc.next();
        System.out.println("Your name is " + userName);
        System.out.println("Enter your age:");
        int userAge = sc.nextInt();
        System.out.println("Your age is: " + userAge);
    }
}
