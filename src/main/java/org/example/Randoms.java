package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random = new Random();
    protected Integer randomInt = null;
    protected int min,max;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
        randomInt = random.nextInt(min, max + 1);
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {

            @Override
            public boolean hasNext() {
                    return true;
            }

            @Override
            public Integer next() {
                var i = new Randoms(min,max);
                return i.randomInt;
            }
        };
    }
}