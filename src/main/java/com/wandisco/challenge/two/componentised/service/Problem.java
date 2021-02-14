package com.wandisco.challenge.two.componentised.service;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

import static com.wandisco.challenge.two.componentised.constant.MultithreadingConstants.PROBLEM_ONE_INCREMENTS_PER_THREAD;
import static com.wandisco.challenge.two.componentised.constant.MultithreadingConstants.PROBLEM_ONE_THREADS_NUM;
import static com.wandisco.challenge.two.componentised.utils.ProblemTwoHelper.threadLockingOrdering;

public class Problem {

    /**
     * Problem 1
     *
     **/
    public static void problem1() throws InterruptedException {
        final int threads = PROBLEM_ONE_THREADS_NUM;
        final int incrementsPerThread = PROBLEM_ONE_INCREMENTS_PER_THREAD;
        final int expected = threads * incrementsPerThread;
        final CountDownLatch countDownLatch = new CountDownLatch(threads);
        final AtomicInteger counter = new AtomicInteger();

        for (int i = 0; i < threads; i++) {
            (new Thread(
                    () -> {
                        try {
                            for (int i1 = 0; i1 < incrementsPerThread; i1++) {
                                counter.getAndIncrement();
                            }
                        } finally {
                            countDownLatch.countDown();
                        }
                    }))
                    .start();
        }

        countDownLatch.await();
        assert expected == counter.get();
    }

    /**
     * Problem 2
     *
     **/
    public static void problem2() throws InterruptedException {
        final CountDownLatch countDownLatch = new CountDownLatch(2);
        final LockOrdering lockOrdering = new LockOrdering();

        threadLockingOrdering(lockOrdering, countDownLatch, true);
        threadLockingOrdering(lockOrdering, countDownLatch, false);

        countDownLatch.await();
    }
}
