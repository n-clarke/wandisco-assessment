package com.wandisco.challenge.two.single;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

class MultithreadingChallenge {

    static final int THREAD_SLEEP_TIME = 5000;
    static final int PROBLEM_ONE_THREADS_NUM = 10;
    static final int PROBLEM_ONE_INCREMENTS_PER_THREAD = 1_000_000;

    static final class LockOrdering {
        final ReentrantLock a;
        final ReentrantLock b;

        /**
         * Lock Ordering Constructor to create new instance of
         * Reentrant Lock for (a, b)
         *
         **/
        LockOrdering() {
            a = new ReentrantLock();
            b = new ReentrantLock();
        }

        /**
         * A method to lock ReentrantLock's (a, b)
         *
         **/
        void opA() throws InterruptedException {
            reentrantLock(a, b);
        }

        /**
         * A method to lock ReentrantLock's (b, a)
         *
         **/
        void opB() throws InterruptedException {
            reentrantLock(b, a);
        }

        /**
         * Synchronized method to generate locking and unlocking of two ReentrantLock's
         *
         * @param firstReentrantLock for a given ReentrantLock
         * @param secondReentrantLock for a given ReentrantLock
         **/
        synchronized void reentrantLock(ReentrantLock firstReentrantLock, ReentrantLock secondReentrantLock) throws InterruptedException {
            try {
                firstReentrantLock.lock();
                Thread.sleep(THREAD_SLEEP_TIME);
                secondReentrantLock.lock();
                assert firstReentrantLock.isHeldByCurrentThread() && secondReentrantLock.isHeldByCurrentThread();
            } finally {
                secondReentrantLock.unlock();
                firstReentrantLock.unlock();
            }
        }
    }

    /**
     * Problem 1 : Synchronisation issue
     *
     **/
    static void problem1() throws InterruptedException {
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
     * Helper Method to run specific lock ordering method
     *
     **/
    static void threadLockingOrdering(LockOrdering lockOrdering, CountDownLatch countDownLatch, boolean isOpA) {
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

    /**
     * Problem 2 : DeadLock
     *
     **/
    static void problem2() throws InterruptedException {
        final CountDownLatch countDownLatch = new CountDownLatch(2);
        final LockOrdering lockOrdering = new LockOrdering();

        threadLockingOrdering(lockOrdering, countDownLatch, true);
        threadLockingOrdering(lockOrdering, countDownLatch, false);

        countDownLatch.await();
    }

    public static void main(final String[] args) throws InterruptedException {
        // Synchronisation issue
        problem1();

        // Deadlock Issue
        problem2();
    }
}
