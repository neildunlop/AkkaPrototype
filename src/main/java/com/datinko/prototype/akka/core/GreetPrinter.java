package com.datinko.prototype.akka.core;

import akka.actor.UntypedActor;

/**
 * Actor that simply outputs every message it gets to the console.
 */
public class GreetPrinter extends UntypedActor {
    public void onReceive(Object message) {
        if (message instanceof Greeting)
            System.out.println(((Greeting) message).message);
    }
}