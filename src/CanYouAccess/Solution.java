package CanYouAccess;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        Object o;// Must be used to hold the reference of the instance of the class Solution.Inner.Private

        //Write your code here
        Inner inner = new Inner();
        Inner.Private private1 = inner.new Private();
        System.out.println(num + " is " + private1.powerof2(num));
        o = private1;


        System.out.println("An instance of class: " + o.getClass().getCanonicalName() + " has been created");
    }
    static class Inner{
        private class Private{
            private String powerof2(int num){
                return ((num&num-1)==0)?"power of 2":"not a power of 2";
            }
        }
    }

}
