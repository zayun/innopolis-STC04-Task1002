package com.innopolis.smoldyrev;

/**
 * Created by smoldyrev on 10.02.17.
 */
public class Kvadrator extends Thread{

    private int sum;
    private int [] array;

    public Kvadrator(int[] arr) {
        this.array=arr;
    }

    public int getSum() {
        return sum;
    }

    @Override
    public void run() {
        for (Integer dig:
                array) {
            sum+=dig*dig;
        }
        Consumer.met(0,sum,0, this);

    }
}
