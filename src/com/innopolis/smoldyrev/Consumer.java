package com.innopolis.smoldyrev;

/**
 * Created by smoldyrev on 10.02.17.
 */
public class Consumer {

    private volatile static boolean semaphProst = false;
    private volatile static boolean semaphKvadro = false;
    private volatile static boolean semaphKube = false;

    private volatile static int summa = 0;

    public static int getSumma() {
        return summa;
    }

    public static void met(int kube, int kvadro, int simple, Object obj) {

        while (semaphKube && obj instanceof Cubator) {
            try {
                Thread.sleep(100);
                //System.out.println("waiting cube");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        while (semaphKvadro && obj instanceof Kvadrator) {
            try {
                Thread.sleep(100);
                //System.out.println("waiting kva");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        while (semaphProst && obj instanceof Prostator) {
            try {
                Thread.sleep(100);
                //System.out.println("waiting prosto");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        semaphProst = (obj instanceof Prostator);
        semaphKvadro = (obj instanceof Kvadrator);
        semaphKube = (obj instanceof Cubator);

        summa += kube+kvadro+simple;

        System.out.println(summa);

        semaphProst = !(obj instanceof Prostator);
        semaphKvadro = !(obj instanceof Kvadrator);
        semaphKube = !(obj instanceof Cubator);

    }
}
