import java.util.Scanner;
public class NumberOfDigits {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int digit = 0;
        for(int i=1; i<=num; i = i*10)
        if (num%10 >= 1){
            digit++;
        }
        System.out.println(digit);
    }
}
