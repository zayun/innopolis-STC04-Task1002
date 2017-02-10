package com.innopolis.smoldyrev;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int[] cubeArray = {1,2,3,5,6,8,9};
        int[] kvadroArray = {1,2,3,5,6,8,9};
        int[] prostArray = {1,2,3,5,6,8,9};

        Cubator cubed = new Cubator(cubeArray);
        Kvadrator kvadred = new Kvadrator(kvadroArray);
        Prostator prost = new Prostator(prostArray);

        cubed.run();
        kvadred.run();
        prost.run();
        cubed.run();
        cubed.run();
        cubed.run();
        kvadred.run();
        kvadred.run();
        kvadred.run();

//        cons.met(cubed.getSum(),kvadred.getSum(),prost.getSum());
//        System.out.println(cubed.getSum());
//        System.out.println(kvadred.getSum());
//        System.out.println(prost.getSum());
    }
}
