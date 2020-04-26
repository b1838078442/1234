package cn.xz;

import java.util.Date;

public class Test1 {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"主线程执行时间"+new Date().getTime()+"第"+i+"次");
        }
    }
}
