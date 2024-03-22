package client;

public class IncrementThread extends Thread {

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int number;

    public IncrementThread(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        while (currentThread().isAlive()) {
            System.out.println("CurrentValue: " + number);
            number++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
