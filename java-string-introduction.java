import java.util.*;
public class solve3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println((s1+s2).length());
        int n = s1.compareTo(s2);
        if (n>0) {
            System.out.println("Yes");
        } else System.out.println("No");
        System.out.println(s1.substring(0,1).toUpperCase()+s1.substring(1)+" "+s2.substring(0,1).toUpperCase()+s2.substring(1));
    }
}
