import java.util.Scanner;
public class Age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        if (age < 0) {
            System.out.println("Please enter positive age");
        } else if (age >= 18) {
            System.out.println("You are an Adult");
        } else if (age >= 13) {
            System.out.println("You are a Teenager");
        } else {
            if (age < 5) {
                System.out.println("You are a Toddler");
            } else {
                System.out.println("You are a Child");
            }
        }
    }
}
