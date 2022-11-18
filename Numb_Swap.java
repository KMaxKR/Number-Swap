import java.util.Scanner;
public class Numb_Swap {
    public static void main(String[] args){
        int n,m,temp;
        System.out.println("Enter first number ....");
        Scanner num = new Scanner(System.in);
        n = num.nextInt();
        System.out.println("Enter second number ....");
        m = num.nextInt();
        temp = n;
        n = m;
        m = temp;

        System.out.println("First value is " + n);
        System.out.println("First value is " + m);
    }
}
