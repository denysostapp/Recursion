package Homework;

public class Recursion {
    public static void main(String[] args) {
        printNumberBackward(9);
        System.out.println();
        printNumber(9);
        //            stackOverFlow(1);
        System.out.println();
        int[] array = {1, 2, 3, 4, 5};
        printArray(array, 0);
        System.out.println();
        int sum = arraySum(array, 0);
        System.out.println(sum);
    }

    public static void printNumberBackward(int n){
        if (n > 0){
            System.out.print(n + " ");
            n--;
            printNumberBackward(n);
        }
    }

    public static void printNumber(int n){
        if (n > 0){
            printNumber(n - 1);
            System.out.print(n + " ");
        }
    }

//    public static void stackOverFlow(int n){
//        System.out.println(n);
//        stackOverFlow(n);
//    }

    public static void printArray(int[] array, int i){
        if (array.length == i){
            return;
        }
        System.out.print(array[i] + " ");
        printArray(array, i+1);
    }
    public static int arraySum(int[] array, int i){
        if (array.length == i){
            return 0;
        }
        return array[i] + arraySum(array, i + 1);
    }
}
