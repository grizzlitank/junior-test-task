package ru.buyanov.hunting;

import java.util.Iterator;

/**
 *  @author https://github.com/alex-on-java 03.02.2016
 */
public class IntIterable implements Iterable<Integer> {
    int[] backed;

    int size;


    public IntIterable(int[] backed) {
        this.backed = backed;
        this.size = backed.length;
    }

    public Iterator<Integer> iterator() {
        return new IntIterator();
    }

    private class IntIterator implements Iterator<Integer> {

        private int index = 0;

        public boolean hasNext() {
            return index < size && backed[index] != 0;//TODO: You task is implement this method
        }

        public Integer next() {
            return backed[index++];//TODO: You task is implement this method
        }

        public void remove() {
            throw new IllegalStateException("Could not remove from array");
        }
    }
}
