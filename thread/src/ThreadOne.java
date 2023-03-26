public class ThreadOne extends Thread{
    @Override
    public void run() {
        for (int i=0;i<10;i++){
            System.out.println("ThreadOne > "+ i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
