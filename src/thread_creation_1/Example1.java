package thread_creation_1;


class Runner extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello " + i);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}


public class Example1 {

    static void main() {
        Runner t1 = new Runner();
        Runner t2 = new Runner();
        t1.start();
        t2.start();
    }

}
