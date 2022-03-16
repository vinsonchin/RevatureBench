import java.util.Stack;

public class StackVA1 {

    public static void main(String args[]) {

        AStack currentStack = new AStack();

        AStack.push(5);
        AStack.push(5.5);
        AStack.push("v a 1");
        Object popped = AStack.pop();
        System.out.println("Popped: " + popped);
        double maxValue = AStack.max();
        System.out.println("Max: " + maxValue);

    }

    public static class AStack {

        public static Stack<Object> theStack = new Stack<>();

        public static void push(Object input) {
            theStack.push(input);
        }

        public static Object pop() {
            if(theStack.isEmpty()) {
                throw new java.lang.Error("Empty Stack");
            } else {
                return theStack.pop();
            }
        }

        public static double max() {
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
