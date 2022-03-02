import java.util.*;

public class Josephus {

    public static void main(String[] args) {
        System.out.println("josephus(41, 3) -> " + josephus(41, 3));
        System.out.println("josephus(35, 11) -> " + josephus(35, 11));
        System.out.println("josephus(11, 1) -> " + josephus(11, 1));
        System.out.println("josephus(2, 2) -> " + josephus(2, 2));
    }

    public static int josephus(int soldiers, int interval) {
        ArrayList<Integer> alive = new ArrayList<>();

        for(int i = 1; i <= soldiers; i++) {
            alive.add(i);
        }

        int index = -1;
        while(alive.size() > 1) {
            index += interval;
            while(index >= alive.size()) {
                index -= alive.size();
            }
            alive.remove(index);
            index--;
        }
        return alive.get(0);
    }
}
