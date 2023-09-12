import java.util.*;
public class relational_Operators {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("for equality");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println((a==b));
        System.out.println("for inequality");
        int c = sc.nextInt();
        int d = sc.nextInt();
        System.out.println((c!=d));
        System.out.println("for greater than");
        int e = sc.nextInt();
        int f = sc.nextInt();
        System.out.println((e>f));
        System.out.println("for less than");
        int g = sc.nextInt();
        int h = sc.nextInt();
        System.out.println((g<h));
        System.out.println("for greater than and equal to ");
        int j = sc.nextInt();
        int k = sc.nextInt();
        System.out.println((j>=k));
        System.out.println("for less than and equal to ");
        int l = sc.nextInt();
        int m = sc.nextInt();
        System.out.println((l<=m));
        sc.close();
    }
}
