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
		int time = 0;
        while (traveled < distance) {
            delay(1);
            if (traveled + l.stoppingDistance() > distance) {
                l.decelerate();
            } else {
                l.accelerate();
            }
            System.out.println(String.format("%.1f km/h, %.1f km", (l.getCurrentSpeed() * 3.6), (distance - traveled)));
            traveled += l.getCurrentSpeed() / 1000;
			time += 1;
        }
		System.out.println("Total time : " + timeToString(time));
    }
	
	public static String timeToString (int time) {
		String timeStr = "";
		if (time < 60) {
			timeStr += time;
		} else if (time < 3600) {
			int minutes = time / 60;
			if (minutes < 10) {
				timeStr += "0";
			}
			timeStr += minutes + ":";
			int seconds = time - (minutes * 60);
			if (seconds < 10) {
				timeStr += "0";
			}
			timeStr += seconds;
		}
		return timeStr;
	}
}
