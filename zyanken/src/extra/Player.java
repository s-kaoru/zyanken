package extra;

class Player {
	private int winCount;
	private int hand;

	Player() {
		this.winCount = 0;
		this.hand = 0;
	}

	public void outputHand(int hand) {
		System.out.println();
	}

	public int getHand() {
		return hand;
	}

	public void setHand(int hand) {
		this.hand = hand;
	}

	public int getWinCount() {
		return winCount;
	}

	public void setWinCount(int winCount) {
		this.winCount = winCount;
	}
}
