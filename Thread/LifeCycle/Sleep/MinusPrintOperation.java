package LifeCycle.Sleep;

class MinusPrintOperation implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println("-");
        }
        System.out.println("MinusPrintOperation Thread 종료");
    }
}
