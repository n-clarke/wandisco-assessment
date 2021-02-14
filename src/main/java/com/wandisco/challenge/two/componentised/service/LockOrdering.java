package com.wandisco.challenge.two.componentised.service;

import java.util.concurrent.locks.ReentrantLock;

import static com.wandisco.challenge.two.componentised.constant.MultithreadingConstants.THREAD_SLEEP_TIME;

public final class LockOrdering {
    private final ReentrantLock a;
    private final ReentrantLock b;

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
    public void opA() throws InterruptedException {
        reentrantLock(a, b);
    }

    /**
     * A method to lock ReentrantLock's (b, a)
     *
     **/
    public void opB() throws InterruptedException {
        reentrantLock(b, a);
    }

    /**
     * Synchronized method to generate locking and unlocking of two ReentrantLock's
     *
     * @param firstReentrantLock for a given ReentrantLock
     * @param secondReentrantLock for a given ReentrantLock
     **/
    private synchronized void reentrantLock(ReentrantLock firstReentrantLock, ReentrantLock secondReentrantLock) throws InterruptedException {
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