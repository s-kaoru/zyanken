package excellence;

public class SystemMain {
	private SystemMain() {
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Player pl = new Player();
		JankenJudge jjudge = new JankenJudge();
		for (int i = 0; i < 3; i++) {
			System.out.println("【" + (i + 1) + "】回戦目");
			int plNum = pl.bufferd();
			int comNum = pl.getRand();
			System.out.println(Player.zyanken[plNum] + "vs" + Player.zyanken[comNum]);
			jjudge.judge(plNum, comNum);
		}
		jjudge.judgeEnd();
	}
}
