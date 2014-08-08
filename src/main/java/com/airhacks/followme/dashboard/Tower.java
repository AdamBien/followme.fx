package com.airhacks.followme.dashboard;

import javax.annotation.PostConstruct;

/**
 *
 * @author adam-bien.com
 */
public class Tower {

    @PostConstruct
    public void init() {
        System.out.println("Tower.init()");
    }

    public String readyToTakeoff() {
        System.out.println("Ready to take-off");
        return "ok from tower";
    }
}
