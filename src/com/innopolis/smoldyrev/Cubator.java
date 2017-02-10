package com.innopolis.smoldyrev;

/**
 * Created by smoldyrev on 10.02.17.
 */
public class Cubator extends Thread {

    private int sum;
    private int [] array;

    public int getSum() {
        return sum;
    }

    public Cubator(int[] arr) {
        this.array = arr;
    }

    @Override
    public void run() {

        for (Integer dig :
                array) {
            sum += dig * dig * dig;
        }

        Consumer.met(sum,0,0, this);
    }
}
