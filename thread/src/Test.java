public class Test {
    public static void main(String[] args) {
        ThreadOne threadOne = new ThreadOne();
        threadOne.start();

        ThreadTwo threadTwo = new ThreadTwo();
        new Thread(threadTwo).start();
    }
}
