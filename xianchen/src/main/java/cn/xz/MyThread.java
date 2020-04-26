package cn.xz;

import java.util.Date;

public class MyThread extends Thread{
    public void run(){
        for (int i = 0; i <10 ; i++) {
            System.out.println(Thread.currentThread().getName()+"MyThread类执行时间"+new Date().getTime()+"第"+i+"次");
        }
    }

}
