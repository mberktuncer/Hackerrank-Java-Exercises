package JavaExceptionHandlingTryCatch;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        try{
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(a/b);
        }
        catch(ArithmeticException e){
            System.out.println(e.getClass().getName() + ": / by zero");
        }
        catch(Exception e){
            System.out.println(e.getClass().getName());
        }
    }

}
