package org.example;

import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random = new Random();
    protected Integer randomInt = null;
    protected int min,max;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;

    }
    public Integer makeRandom(){
        return randomInt = random.nextInt(this.min,this.max + 1);
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
                return makeRandom();
            }
        };
    }
}