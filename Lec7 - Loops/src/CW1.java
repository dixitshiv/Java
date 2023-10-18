public class CW1 {
    public static void main(String[] args) {
        int num5 = 5;
        int num7 = 7;
        for (int i=num5; i<=num5*10; i=i+5) {
            if (i % num7 == 0)
            {
                System.out.println("The number is: " + i);
                break;
            }
        }
    }
}
