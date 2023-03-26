public class Main {
    public static void main(String[] args) {
        //Thread main -> luồng chính
        System.out.println("Hello 1");
        //Cach 1
        // Tạo một đối tượng của lớp con trên và gọi phương thức start() để bắt đầu thread
        // Tạo một đối tượng của lớp implement Runnable trên
        // việc sử dụng Interface Runnable có một cái lợi là giúp ta kế thừa từ 1 lớp khác ngoài lớp thread,
        // vì nếu sử dụng Subclass thì chỉ có thể thừa kế một lớp Thread vì java không hỗ trợ đa thừa kế.
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100;i++){
                    System.out.println("Thread 1 >"+i);
                }
            }
        });
        // Gọi phương thức start() để bắt đầu thread.
        t.start();


        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                //............
            }
        });
        t2.start();

        //cach2:
        new Thread(new Runnable() {
            @Override
            public void run() {
                //.........
            }
        }).start();

        // cú pháp lambda
        new Thread(() -> {
            //.......
        }).start();

        System.out.println("Ends");
    }
}