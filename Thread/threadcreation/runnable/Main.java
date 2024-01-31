package threadcreation.runnable;

public class Main {

    public static void main(String[] args) {
        Thread a1 = new Thread(new CountDown(2));
        Thread b1 = new Thread(new CountDown(2));
        Thread c1 = new Thread(new CountDown(2));
        a1.start();
        b1.start();
        c1.start();
    }

}
