import java.util.Scanner;
public class SimpleInterestCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double si, p, r, n;
        System.out.println("Enter principal amount:");
        p = sc.nextDouble();
        System.out.println("Enter number of years:");
        n = sc.nextDouble();
        System.out.println("Enter rate of interest:");
        r = sc.nextDouble();
        si = (p*n*r) / 100;
        System.out.println("Simple Interest is " + si);
    }
}
