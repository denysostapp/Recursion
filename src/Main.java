
public class Main {
    static int i;
    public static void main(String[] args) {
        printNumbersUp(1);
    }

    public static void explosion( int n) {
        if (n == 0) {
            System.out.println("BAM!!!");
            return;
        }
        System.out.println(n);
        explosion(n-1);
    }
    public static void func(){
        i++;
        System.out.println("Call number:" + i + ".");
        // BASE CASE
        if (i < 100)
            func();
    }
    public static int factorial (int num){
        if (num == 0) return 1;
        if (num == 1) return 1;
        return num * factorial(num - 1);
    }

    public static void printNumbersUp(int i) {
        if (i < 6) {
            System.out.println(i);
            i++;
            printNumbersUp(i);
        }else {
            System.out.println("End");
        }
    }

    /** main
     * printNumbersUp(1)
     * printNumbersUp(2)
     * printNumbersUp(3)
     * printNumbersUp(4)
     * printNumbersUp(5)
     */
}