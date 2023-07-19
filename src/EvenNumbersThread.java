class EvenNumbersThread extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 2; i <= 10; i += 2) {
                Thread.sleep(1000);
            System.out.println(i);
        }

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }


    public static void main(String[] args) {
        EvenNumbersThread evenThread = new EvenNumbersThread();
        evenThread.start();
    }

}