package threadcreation.runnable;

public class CountDown implements Runnable {

    public CountDown(int test) {
    }

    @Override
    public void run() {
        for (int i = 10; i > -1; i--) {
            Thread currentThread = Thread.currentThread();
            System.out.println(currentThread.getName() + ": " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
