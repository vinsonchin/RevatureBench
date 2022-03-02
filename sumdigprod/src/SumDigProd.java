import java.util.*;

public class SumDigProd {

    public static void main(String[] args) {
        System.out.println("sumDigProd(16,28) -> " + sumDigProd(16,28));
        System.out.println("sumDigProd(0) -> " + sumDigProd(0));
        System.out.println("sumDigProd(1,2,3,4,5,6) -> " + sumDigProd(1,2,3,4,5,6));
    }

    private static int sumDigProd(int num1, int ... nums) {
        int result = num1;
        for (int num : nums) {
            result += num;
        }

        while(result > 9) {
            int prod = result;
            ArrayList<Integer> digits = new ArrayList<>();
            while(prod > 0) {
                int current = prod % 10;
                digits.add(current);
                prod -= current;
                prod /= 10;
            }
            result = 1;
            for(int digit : digits) {
                result *= digit;
            }
        }
        return result;
    }
}
