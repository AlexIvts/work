package ru.work.arrayiterator;

import org.junit.Test;

import java.util.Iterator;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayIteratorTest {


    private  static final class ForEarchArray implements Iterable {

        private final int[][] values;

        public ForEarchArray(final int[][] values) {
            this.values = values;
        }

        @Override
        public Iterator iterator() {
            return new ArrayIterator(this.values);
        }
    }


    @Test
    public void foreach() {
        ForEarchArray foreach = new ForEarchArray(new int[][] {{1,2}, {3, 5}, {5}, {10}, {7, 8, 9}});

        for (Object value : foreach) {
            System.out.println(value);
        }
    }

    @Test
    public void hasNext() {
        ArrayIterator it = new ArrayIterator(new int[][]{{3}, {1, 2}});

        it.next();
        it.next();
        boolean result = it.hasNext();

        assertThat(result, is(true));
    }

    @Test
    public void next() {
        ArrayIterator it = new ArrayIterator(new int[][]{{3, 5}, {1, 2}});

        it.next();
        it.next();
        it.next();
        int result = (int) it.next();

        assertThat(result, is(2));
    }


}