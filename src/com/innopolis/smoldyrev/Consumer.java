package com.innopolis.smoldyrev;

/**
 * Created by smoldyrev on 10.02.17.
 */
public class Consumer {

    private volatile static boolean semaphProst = false;
    private volatile static boolean semaphKvadro = false;
    private volatile static boolean semaphKube = false;

    private volatile static int summa = 0;

    public static void met(int kube, int kvadro, int simple, Object obj) {

        while (semaphKube && obj instanceof Cubator) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        while (semaphKvadro && obj instanceof Kvadrator) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        while (semaphProst && obj instanceof Prostator) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        if (obj instanceof Prostator) semaphProst = true;
        if (obj instanceof Kvadrator) semaphKvadro = true;
        if (obj instanceof Cubator) semaphKube = true;

        summa = summa+ kube+kvadro+simple;
        System.out.println(summa);

        if (obj instanceof Prostator) semaphProst = false;
        if (obj instanceof Kvadrator) semaphKvadro = false;
        if (obj instanceof Cubator) semaphKube = false;
    }
}
