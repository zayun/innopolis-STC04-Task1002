package com.innopolis.smoldyrev;

/**
 * Created by smoldyrev on 10.02.17.
 */
public class Prostator extends Thread{

    private int sum;
    private int [] array;

    public Prostator(int[] arr) {
        this.array = arr;
    }

    public int getSum() {
        return sum;
    }

    @Override
    public void run() {
        for (Integer dig:
                array) {
            sum+=dig;
        }

        Consumer.met(0,0,sum, this);
    }
}
