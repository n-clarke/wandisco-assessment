package com.wandisco.challenge.two.componentised;

import static com.wandisco.challenge.two.componentised.service.Problem.problem1;
import static com.wandisco.challenge.two.componentised.service.Problem.problem2;

class MultithreadingChallenge {

    public static void main(final String[] args) throws InterruptedException {
        /** You can use jconsole, jvisualvm or jps to get the process id of your program and then run jstack <process-id> to get the thread stack dump :
        * https://javajee.com/lock-ordering-deadlocks-in-java-with-example
        **/
        
        /** Synchronized issue
        * reason: https://docs.oracle.com/javase/tutorial/essential/concurrency/memconsist.html
        * solution: https://docs.oracle.com/javase/tutorial/essential/concurrency/syncmeth.html
        **/
        problem1();

        // Deadlock Issue
        problem2();
    }
}
