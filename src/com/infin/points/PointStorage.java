package com.infin.points;

import java.util.Random;

public class PointStorage {
	static Random randomGenerator = new Random();
	static private int pointCount = 100;
	synchronized static public int getPointCount() {
		return pointCount;
	}
	synchronized static public int getRandomPoints() {
		int earnedPoints = randomGenerator.nextInt(3) + 1;
		if (pointCount < earnedPoints) {
			earnedPoints = pointCount;
		}
		pointCount = pointCount - earnedPoints;
		return earnedPoints;
	}
}