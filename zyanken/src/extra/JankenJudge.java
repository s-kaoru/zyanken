package extra;

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
		System.out.println("じゃんけん終了");
		if (n_win == p_win) {
			System.out.println(p_win + "対" + n_win + "で引き分けです");
		} else if (p_win > n_win) {
			System.out.println(p_win + "対" + n_win + "でプレイヤーの勝ちです");
		} else {
			System.out.println(p_win + "対" + n_win + "でコンピュータの勝ちです");

		}

	}
}
