import java.util.Scanner;
public class ReverseDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int r;
        String s = null;
       while(num>0) {
           r = num % 10;
           num = num /10;
           s = ("" + r);
           System.out.print(s);
       }

    }
}

