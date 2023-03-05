package main;

import loco.Loco;

public class Util {
    public static void delay (int time) {
        try {
            Thread.currentThread().sleep(time * 1000);
        } catch (InterruptedException e) {
        }
    }
    public static void travel (double distance, Loco l) {
        double traveled = 0;
        while (traveled < distance) {
            delay(1);
            if (traveled + l.stoppingDistance() > distance) {
                l.decelerate();
            } else {
                l.accelerate();
            }
            System.out.println(String.format("%.1f km/h, %.1f km", (l.getCurrentSpeed() * 3.6), (distance - traveled)));
            traveled += l.getCurrentSpeed() / 1000;
        }
    }
}
