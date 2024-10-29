package JavaGenerics;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Integer[] a = {1, 2, 3};
        String[] b = {"Hello", "World"};

        printArray(a);
        printArray(b);
    }

    public static <T> void printArray(T[] array){
        for(T i : array){
            System.out.println(i);
        }
    }

}
