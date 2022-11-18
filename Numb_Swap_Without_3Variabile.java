import java.util.Scanner;

public class Numb_Swap_Without_3Variabile {
    public static void main(String[] args){
        int n,m;
        System.out.println("Enter first number ....");
        Scanner num = new Scanner(System.in);
        n = num.nextInt();
        System.out.println("Enter second number ....");
        m = num.nextInt();
        n +=  m;
        m = n - m;
        n -= m;

        System.out.println("First value is " + n);
        System.out.println("First value is " + m);
    }
}
