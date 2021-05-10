package extra;

import java.util.ArrayList;
import java.util.List;

public class jankenStart {
	Util util = new Util();
	Player pl = new Player();
	JankenJudge jjudge = new JankenJudge();
	private int plNum, comNum, count, cpNum;

	public void start() {
		List<Player> comList = new ArrayList<Player>();
		System.out.println(Constant.COM_NUMBER);
		cpNum = util.inputNum();
		System.out.println(Constant.JANKENNUM_MESSAGE);
		count = util.inputNum();

		for (int i = 0; i < cpNum; i++) {
			Player com = new Player();
			comList.add(com);
		}

		for (int i = 0; i < count; i++) {
			System.out.println("【" + (i + 1) + "】回戦目");
			System.out.println(Constant.START_MESSAGE);
			plNum = util.inputNum();
			plNum = util.numJudge(plNum);
			System.out.print(Constant.JANKEN_STRINGS[plNum]);
			System.out.print(Constant.JANKENVS_STRING);

			for (int j = 0; j < comList.size(); j++) {
				comList.get(j).setHand(util.random());
				System.out.print(Constant.JANKEN_STRINGS[comList.get(j).getHand()]);
				if (j < comList.size() - 1) {
					System.out.print(Constant.JANKENVS_STRING);
				}
			}
			jjudge.judge(pl, comList);
		}

	}
}
