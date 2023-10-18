import java.util.Scanner;
public class Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();

//        if(num % 2 == 0 && num % 3 ==0) {
//            System.out.println("YES");
//        }

//        String result;
//        result = (num % 2 == 0 && num % 3 ==0) ? "YES" : "NO";
//        System.out.println(result);

        String result;
        result = (num % 3 == 0 || num % 5 ==0) ? "YES" : "NO";
        System.out.println(result);
    }
}
