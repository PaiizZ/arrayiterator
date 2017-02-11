package ku.util;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * A ArrayIterator is the iterator over the elements of an array.
 *
 * @author Wanchanapon Thanawaranurak
 * @version 2/1/2017 AD.
 */
public class ArrayIterator<T> implements Iterator<T> {

    /**
     * attribute for the array we want to iterate over
     */
    private T[] array;
    /**
     * the number of elements in the array
     */
    private int count;

    {


    }

    /**
     * Initialize a new array iterator with the array to process.
     *
     * @param array is the array to iterate over, type is T[]
     */
    public ArrayIterator(T[] array) {
        this.array = array;
        this.count = 0;
    }

    /**
     * to check this position has a element and skip the null element.
     *
     * @return return true if this position has a element.
     */
    @Override
    public boolean hasNext() {
        while (count < array.length && array[count] == null) {
            count++;
        }
        return (count < array.length);
    }

    /**
     * Return the next non-null element from array, if any.
     *
     * @return the next non-null element in the array.
     * @throws NoSuchElementException if there are no more elements
     *                                to return.
     */
    @Override
    public T next() {
        while (hasNext()) {
            return array[count++];
        }
        throw new NoSuchElementException();
    }


    /**
     * remove operation is not supported in this collection.
     */
    @Override
    public void remove() {
        if (this.array.length != 0 && array[count - 1] != null)
            array[count - 1] = null;
        else throw new IllegalStateException();
    }

}
