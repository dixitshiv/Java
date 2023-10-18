import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int digit = 0;
        int sum = 0;
        for(int i=num; num>=1; num = num / 10) {
            sum = num % 10;
            digit = digit + sum;
        }
        System.out.println(digit);

    }
}
