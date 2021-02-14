package com.wandisco.challenge.two.componentised;

import static com.wandisco.challenge.two.componentised.service.Problem.problem1;
import static com.wandisco.challenge.two.componentised.service.Problem.problem2;

class MultithreadingChallenge {

    public static void main(final String[] args) throws InterruptedException {
        // Synchronisation issue
        problem1();

        // Deadlock Issue
        problem2();
    }
}
