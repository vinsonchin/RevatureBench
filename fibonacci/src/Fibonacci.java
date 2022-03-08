public class Fibonacci {

    public static void main(String args[]) {
        System.out.println("Sum of even terms less then 4 million: " + fibEvenSum());
    }

    public static int fibEvenSum() {

        int sum = 0;
        int currentFib = 0;
        int i = 1;

        while(currentFib < 4000000) {

            if(currentFib % 2 == 0) {
                sum += currentFib;
            }

            currentFib = fib(i);
            i++;
        }

        return sum;
    }

    public static int fib(int term) {

        if(term == 1) {
            return 1;
        } else if(term == 2) {
            return 2;
        } else {
            return fib(term - 2) + fib(term - 1);
        }
    }
}
