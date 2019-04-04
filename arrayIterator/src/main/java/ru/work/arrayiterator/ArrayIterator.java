package ru.work.arrayiterator;

import java.util.Iterator;

/**
 * Класс ArrayIterator.
 * @author Alex Ivts.
 * @since 03.04.2019.
 * @version 1.

 */
public class ArrayIterator implements Iterator {

    private final int[][] values;
    private int col = 0;
    private int row = 0;

    /**
     * Конструктор, ArrayIterator.
     * @param values values[][].
     */
    public ArrayIterator(final int[][] values) {
        this.values = values;
    }


    public boolean hasNext() {
        return values.length > row && values[row].length > col;
    }


    public Object next() {
        int res = values[row][col++];
        if (values.length > row) {
            if (values[row].length == col) {
                row++;
                col = 0;
            }
        }
        return res;
    }


    public void remove() {

    }
}
