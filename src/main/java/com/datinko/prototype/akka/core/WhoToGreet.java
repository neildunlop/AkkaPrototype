package com.datinko.prototype.akka.core;

import java.io.Serializable;

/**
 * Strongly typed definition of who should be greeted.
 */
public class WhoToGreet implements Serializable {

    public final String who;

    public WhoToGreet(String who) {
        this.who = who;
    }
}
