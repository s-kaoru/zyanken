package excellence;

class JankenJudge {
	private int p_win, n_win;

	public JankenJudge() {
		// TODO 自動生成されたコンストラクター・スタブ
		p_win = 0;
		n_win = 0;
	}

	public void judge(int plNum, int comNum) {
		if (plNum == comNum) {
			System.out.println("引き分けです");
		} else if (plNum == 0 && comNum == 1
				|| plNum == 1 && comNum == 2
				|| plNum == 2 && comNum == 0) {
			System.out.println("プレイヤーが勝ちました!");
			p_win++;
		} else {
			System.out.println("コンピュータが勝ちました");
			n_win++;
		}
	}

	public void judgeEnd() {
		// TODO 自動生成されたメソッド・スタブ

	}
}
