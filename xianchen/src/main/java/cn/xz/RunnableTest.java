package cn.xz;

import java.util.Date;

public class RunnableTest {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable(),"sss");
        thread.start();
        for (int i = 0; i <10 ; i++) {
            System.out.println(Thread.currentThread().getName()+"执行时间"+ new Date().getTime()+"第"+i+"次");
        }

    }
}
