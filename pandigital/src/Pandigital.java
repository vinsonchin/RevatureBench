public class Pandigital {

    public static void main(String[] args) {
        System.out.println("Pandigital: " + pandigital());
    }

    public static int pandigital() {

        int largest = 0;

        for(int i = 1; i < 9876; i++) {

            StringBuilder currentString = new StringBuilder();
            currentString.append(i);

            int j = 2;
            while(currentString.length() < 9) {
                currentString.append(i * j);
                j++;
            }

            if(currentString.length() == 9) {
                String tempString = currentString.toString();
                if(tempString.contains("1") && tempString.contains("2") && tempString.contains("3") &&
                        tempString.contains("4") && tempString.contains("5") && tempString.contains("6") &&
                        tempString.contains("7") && tempString.contains("8") && tempString.contains("9")) {

                    int currentValue = Integer.parseInt(String.valueOf(currentString));
                    if(currentValue > largest) {
                        largest = currentValue;
                    }
                }
            }
        }
        return largest;
    }
}
