class EvenNumbersRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 2; i <= 10; i += 2) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }


    public static void main(String[] args) {
        EvenNumbersRunnable evenRunnable = new EvenNumbersRunnable();
        Thread evenThread = new Thread(evenRunnable);
        evenThread.start();
    }
}