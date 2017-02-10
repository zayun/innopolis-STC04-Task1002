package com.innopolis.smoldyrev;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<int[]> inputArrCub = new ArrayList<>();

        inputArrCub.add(new int[]{1, 2, 3, 5, 6, 8, 9, 1, 2, 3, 5, 6, 8, 9});
        inputArrCub.add(new int[]{1, 2, 3, 5, 6, 8, 9, 1, 2, 3, 5, 6, 8, 9});
        inputArrCub.add(new int[]{1, 2, 3, 5, 6, 8, 9, 1, 2, 3, 5, 6, 8, 9});
        inputArrCub.add(new int[]{1, 2, 3, 5, 6, 8, 9, 1, 2, 3, 5, 6, 8, 9});
        inputArrCub.add(new int[]{1, 2, 3, 5, 6, 8, 9, 1, 2, 3, 5, 6, 8, 9});
        inputArrCub.add(new int[]{1, 2, 3, 5, 6, 8, 9, 1, 2, 3, 5, 6, 8, 9});
        inputArrCub.add(new int[]{1, 2, 3, 5, 6, 8, 9, 1, 2, 3, 5, 6, 8, 9});

        ArrayList<int[]> inputArrKvad = new ArrayList<>();

        inputArrKvad.add(new int[]{1, 2, 3, 5, 6, 8, 9, 1, 2, 3, 5, 6, 8, 9});
        inputArrKvad.add(new int[]{1, 2, 3, 5, 6, 8, 9, 1, 2, 3, 5, 6, 8, 9});
        inputArrKvad.add(new int[]{1, 2, 3, 5, 6, 8, 9, 1, 2, 3, 5, 6, 8, 9});
        inputArrKvad.add(new int[]{1, 2, 3, 5, 6, 8, 9, 1, 2, 3, 5, 6, 8, 9});
        inputArrKvad.add(new int[]{1, 2, 3, 5, 6, 8, 9, 1, 2, 3, 5, 6, 8, 9});
        inputArrKvad.add(new int[]{1, 2, 3, 5, 6, 8, 9, 1, 2, 3, 5, 6, 8, 9});
        inputArrKvad.add(new int[]{1, 2, 3, 5, 6, 8, 9, 1, 2, 3, 5, 6, 8, 9});

        ArrayList<int[]> inputArrSimp = new ArrayList<>();

        inputArrSimp.add(new int[]{1, 2, 3, 5, 6, 8, 9, 1, 2, 3, 5, 6, 8, 9});
        inputArrSimp.add(new int[]{1, 2, 3, 5, 6, 8, 9, 1, 2, 3, 5, 6, 8, 9});
        inputArrSimp.add(new int[]{1, 2, 3, 5, 6, 8, 9, 1, 2, 3, 5, 6, 8, 9});
        inputArrSimp.add(new int[]{1, 2, 3, 5, 6, 8, 9, 1, 2, 3, 5, 6, 8, 9});
        inputArrSimp.add(new int[]{1, 2, 3, 5, 6, 8, 9, 1, 2, 3, 5, 6, 8, 9});
        inputArrSimp.add(new int[]{1, 2, 3, 5, 6, 8, 9, 1, 2, 3, 5, 6, 8, 9});
        inputArrSimp.add(new int[]{1, 2, 3, 5, 6, 8, 9, 1, 2, 3, 5, 6, 8, 9});

        for (int[] a:
                inputArrCub) {
            Cubator cube =new Cubator(a);
            cube.start();
        }

        for (int[] a:
                inputArrKvad) {
            Kvadrator kvadrator =new Kvadrator(a);
            kvadrator.start();
        }

        for (int[] a:
                inputArrSimp) {
            Prostator prostator =new Prostator(a);
            prostator.start();
        }


        System.out.println("===================");
        System.out.println(Consumer.getSumma());

    }
}
