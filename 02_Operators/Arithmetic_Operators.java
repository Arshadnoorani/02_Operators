import java.util.*;

public class Arithmetic_Operators{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //*******this is Binary Arithmetic Operators
        /*int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Add ="+ (a+b));
        System.out.println("subtract ="+ (a-b));
        System.out.println("multiplication ="+ (a*b));
        System.out.println("division ="+ (a/b));//---> better option is float for division 
        System.out.println("modulo(remainder) ="+ (a%b));
        sc.close();*/
        //*******this is for unary operators
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("pre increment of first value ="+(++a));
        System.out.println("pre increment of second value ="+(++b));

        int c = sc.nextInt();
        int d = c++;
        System.out.println("post increment of first value ="+(c));
        System.out.println("post increment of second value ="+(d));

        int e = sc.nextInt();
        int f = sc.nextInt();
        System.out.println("post decrement of first value ="+(--e));
        System.out.println("post decrement of second value ="+(--f));

        int g = sc.nextInt();
        int h = g--;
        System.out.println("post decrement of first value ="+(g));
        System.out.println("post decrement of second value ="+(h));
        sc.close();
    }
}