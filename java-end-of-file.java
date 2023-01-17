import java.util.Scanner;

public class solve2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=0;
        while (sc.hasNext()) {
            count++;
            String s= sc.nextLine();
            System.out.println(count+" "+s);
        }
    }
}
