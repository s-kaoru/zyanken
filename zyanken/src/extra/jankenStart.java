package extra;

public class jankenStart {
	Util util = new Util();
	Player pl = new Player();
	JankenJudge jjudge = new JankenJudge();

	public void start() {
		for (int i = 0; i < 3; i++) {
			System.out.println("【" + (i + 1) + "】回戦目");
			int plNum = util.inputNumber();
			int comNum = pl.getRand();
			System.out.println(Player.zyanken[plNum] + "vs" + Player.zyanken[comNum]);
			jjudge.judge(plNum, comNum);
		}
		jjudge.judgeEnd();
	}
}
