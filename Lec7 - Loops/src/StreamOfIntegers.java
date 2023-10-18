import java.util.Scanner;
public class StreamOfIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter a number to add | -1 to stop");
        int userInput = sc.nextInt();
        do {
            if(userInput == -1) {
                break;
            }
            sum = sum + userInput;
            System.out.println("Enter a number to add | -1 to stop");
            userInput = sc.nextInt();
        } while (userInput != -1);

//        while (userInput != -1) {
//            sum = sum + userInput;
//            System.out.println("Enter a number to add | -1 to stop");
//            userInput = sc.nextInt();
//        }
        System.out.println("The sum is: " + sum);
    }
}
