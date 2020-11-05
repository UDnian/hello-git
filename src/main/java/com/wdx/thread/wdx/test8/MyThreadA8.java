package com.wdx.thread.wdx.test8;

/**
 * @author wangdongxing
 * @since 2019-03-21 08:35
 */
public class MyThreadA8 extends Thread {

    private Task8 task8;

    public MyThreadA8(Task8 task8) {
        this.task8 = task8;
    }

    @Override
    public void run() {
        task8.doLongTimeTask();
    }
}
