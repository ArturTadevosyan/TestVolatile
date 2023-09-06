public class TestVolatile extends Thread{
   volatile boolean keepRunning = true;

    @Override
    public void run() {
        while (keepRunning){

        }
        System.out.println("Thread is finished");
    }
}
