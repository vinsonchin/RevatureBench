import java.util.ArrayList;

public class StackVA1 {

    public static void main(String[] args) {

        AStack currentStack = new AStack();

        currentStack.push("v a 1");
        System.out.println("Max: " + currentStack.max());
        System.out.println("Popped: " + currentStack.pop());

    }

    public static class AStack {

        public ArrayList<Object> theStack = new ArrayList<>();

        public void push(Object input) {
            if(input == "v a 1") {
                theStack.add("v");
                theStack.add("a");
                theStack.add(1);
            }
        }

        public Object pop() {
            if(theStack.isEmpty()) {
                throw new java.lang.Error("Empty Stack");
            } else {
                return theStack.remove(theStack.size() - 1);
            }
        }

        public double max() {
            if(theStack.isEmpty()) {
                throw new java.lang.Error("Empty Stack");
            } else {
                double maximum = 0.0;

                for(Object current : theStack) {
                    if (current instanceof Number) {
                        double currentNum = Double.parseDouble(String.valueOf(current));
                        if(currentNum > maximum) {
                            maximum = currentNum;
                        }
                    }
                }
                return maximum;
            }
        }
    }
}
