package com.datinko.prototype.akka.core;

import akka.actor.UntypedActor;

/**
 * Created by Neil on 16/06/2015.
 */
public class Greeter extends UntypedActor {

    String greeting = "";


    @Override
    public void onReceive(Object message) throws Exception {

        if(message instanceof WhoToGreet) {
            greeting = "Hello " + ((WhoToGreet)message).who;
        }
        else if (message instanceof Greet) {
            getSender().tell(new Greeting(greeting), getSelf());
        }
        else unhandled(message);
    }
}
