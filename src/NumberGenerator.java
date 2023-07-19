public class NumberGenerator implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println( i + " - Thread: " + Thread.currentThread().getName() + " : " + hashCode());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);

            }
        }
    }

    public static void main(String[] args) {
        NumberGenerator generator1 = new NumberGenerator();
        NumberGenerator generator2 = new NumberGenerator();

        Thread thread1 = new Thread(generator1);
        Thread thread2 = new Thread(generator2);
        thread1.setName("T1");
        thread2.setName("2");

//        // Thay đổi priority của thread
        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MIN_PRIORITY);

        thread1.start();
        thread2.start();
    }
}
