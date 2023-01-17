import java.util.*;

public class hackerrank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t != 0) {
            t--;
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                System.out.printf("%d ", a += (int) Math.pow(2, i) * b);
            }
            System.out.println();
        }
    }
}
