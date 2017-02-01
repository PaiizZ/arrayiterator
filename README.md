# Arrayiterator
## by Wanchanapon Thanwaranurak 5710546607

## Usage
* ArrayIterator(T[] array) is a constructor for initialize ArrayIterator.
* boolean hasNext() to check this position has a element and skip the null element.
  * return true if the array has next non-null element, otherwise return false.
* T next() move next element in the iterator.
  * return next non-null element in the array, else throws NoSuchElementException.
* void remove() remove operation is not supported in this collection.
