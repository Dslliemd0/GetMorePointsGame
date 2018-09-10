package com.infin.points;

public class PlayerOneGame implements Runnable {
	PointCounter countPointer = new PointCounter();
	public void run() {
		while (PointStorage.getPointCount() > 0) {
			countPointer.setPoints(PointStorage.getRandomPoints());
		}
		System.out.println(Thread.currentThread().getName() + " gets " + countPointer.getPoints() + " points.");
	}
}
