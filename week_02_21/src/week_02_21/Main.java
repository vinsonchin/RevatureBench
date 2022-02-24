package week_02_21;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Pandigital: " + pandigital());
    }

    public static int pandigital() {

        int largest = 0;

        for(int i = 9; i > 0; i--) {

            StringBuilder currentString = new StringBuilder();
            currentString.append(i);

            int j = 2;
            while(currentString.length() < 9) {
                currentString.append(i * j);
                j++;
            }

            if(currentString.length() == 9) {
                int currentValue = Integer.parseInt(String.valueOf(currentString));
                if(currentValue > largest) {
                    largest = currentValue;
                }
            }
        }
        return largest;
    }
}
