package ku.util;

/**
 * This main class is for checking that ArrayIterator class is working correctly.
 *
 * @author Wanchananpon Thanwaranurak
 * @version 2/1/2017 AD.
 */

public class Main {
    public static void main(String[] arg) {
        String[] array = {"apple", "banana", null, "carrot"};

        ArrayIterator<String> iter = new ArrayIterator(array);

        System.out.println(iter.next());
        System.out.println(iter.hasNext());
        System.out.println(iter.hasNext());
        System.out.println(iter.hasNext());
        System.out.println(iter.next());
        System.out.println(iter.next());
        System.out.println(iter.hasNext());
//        System.out.println(iter.next());
        iter.remove();
        for (String i : array){
            System.out.print(i+" ");
        }
    }
}
