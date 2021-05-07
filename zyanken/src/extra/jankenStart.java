package extra;

import java.util.ArrayList;
import java.util.List;

public class jankenStart {
	Util util = new Util();
	Player pl = new Player();
	JankenJudge jjudge = new JankenJudge();
	private int plNum, comNum, count, cpNum;

	public void start() {
		List<Player> cpList = new ArrayList<Player>();
		System.out.println(Constant.CP_NUMBER);
		cpNum = util.inputNum();
		System.out.println(Constant.JANKENNUM_MESSAGE);
		count = util.inputNum();

		for (int i = 0; i < cpNum; i++) {
			Player cp = new Player();
			cpList.add(cp);
		}

		for (int i = 0; i < count; i++) {
			System.out.println("【" + (i + 1) + "】回戦目");
			System.out.println(Constant.START_MESSAGE);
			plNum = util.inputNum();
			plNum = util.numJudge(plNum);
			comNum = util.random();
			System.out.println(
					Constant.JANKEN_STRINGS[plNum] + Constant.JANKENVS_STRING + Constant.JANKEN_STRINGS[comNum]);
			jjudge.judge(plNum, comNum);
		}
		jjudge.judgeEnd();
	}
}
