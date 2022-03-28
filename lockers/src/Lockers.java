/*  100 Lockers: There are 100 closed lockers in a hallway. A man begins by opening all 100 lockers.
    Next, he closes every second locker. Then, on his third pass, he toggles every third locker
    (closes it if it is open or opens it if it is closed). This process continues for 100 passes,
    such that on each pass 'i', the man toggles every 'i'th locker. After his 100th pass in the hallway,
    in which he toggles only locker #100, how many lockers are open?
 */
public class Lockers {

    public static void main(String args[]) {
        System.out.println("Number of open lockers for 100 lockers: " + openLockers(100));
    }

    /*  The number of times a locker is opened depends on the number of factors of its locker number.
        If a locker number has an even number of factors, the locker will be closed at the end.
        Every factor has a corresponding factor which creates a pair (e.g. factors of 6 are (1,6) and (2,3)).
        This means all numbers except for perfect squares will have an even number of factors (locker will be closed).
        Perfect squares have an odd number of factors because the two factors in one of the pairs are the same number.
        This number is only counted once since the man will not repeat the same number. We just need to count the
        number of perfect squares which happens to equal the square root of the number of lockers without the decimal.
     */
    public static int openLockers(int numOfLockers) {
        return (int) Math.sqrt(numOfLockers);
    }

}
