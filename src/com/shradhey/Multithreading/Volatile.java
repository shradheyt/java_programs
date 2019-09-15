package com.shradhey.Multithreading;

/**
 * Created by Shradhey Tripathi on 9/15/2019
 */

class Worker implements Runnable {

    private volatile boolean isTerminated = false;  // to fetch this variable always from main memory

    @Override
    public void run() {
        while (!isTerminated) {
            System.out.println("Hello from Worker class");
            try {
                Thread.sleep(300);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public boolean isTerminated() {
        return isTerminated;
    }

    public void setTerminated(boolean terminated) {
        isTerminated = terminated;
    }
}
public class Volatile {
    public static void main(String[] args) {
        Worker worker = new Worker();
        Thread t1 = new Thread(worker);
        t1.start();
        try {
            Thread.sleep(3000);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
        worker.setTerminated(true);
        System.out.println("Finished...");
    }
}
