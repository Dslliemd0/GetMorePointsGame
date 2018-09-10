package com.infin.points;

public class GetMorePoints {
	public static void main(String[] args) {
		PlayerOneGame theGame1 = new PlayerOneGame();
		PlayerTwoGame theGame2 = new PlayerTwoGame();
		PlayerThreeGame theGame3 = new PlayerThreeGame();
		Thread playerOne = new Thread(theGame1);
		Thread playerTwo = new Thread(theGame2);
		Thread playerThree = new Thread(theGame3);
		playerOne.setName("Gerry");
		playerTwo.setName("Tom");
		playerThree.setName("Jessica");
		playerOne.start();
		playerTwo.start();
		playerThree.start();
	}
}