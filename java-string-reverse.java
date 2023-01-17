import java.util.*;

public class hackerRank {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = "";
        char c;
        for (int i=(str1.length()-1);i>=0;i--) {
            str2 += str1.charAt(i);
        }
        if (str1.equals(str2)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
