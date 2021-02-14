package com.wandisco.challenge.two.componentised.utils;

import com.wandisco.challenge.two.componentised.service.LockOrdering;

import java.util.concurrent.CountDownLatch;

public class ProblemTwoHelper {

    /**
     * Helper Method to run specific lock ordering method
     *
     **/
    public static void threadLockingOrdering(LockOrdering lockOrdering, CountDownLatch countDownLatch, boolean isOpA) {
        (new Thread(
                () -> {
                    try {
                        if (isOpA) {
                            lockOrdering.opA();
                        }  else {
                            lockOrdering.opB();
                        }
                    } catch (final InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        countDownLatch.countDown();
                    }
                }))
                .start();
    }

}
