package excellence;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

class Player {
	private String strA, strB;
	private String hand;
	private int num, rand;
	public static final String[] zyanken = { "グー", "チョキ", "パー" };
	Random random = new Random();
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	public int bufferd() {
		// TODO 自動生成されたメソッド・スタブ
		try {
			System.out.println("プレイヤーの手を決めてください"
					+ "\n（グー：0 チョキ:1 パー:2）");
			System.out.print(">");
			this.strA = reader.readLine();
			this.num = Integer.parseInt(this.strA);
			if (this.num >= 0 || this.num <= 2) {
				this.rand = random.nextInt(2);
			} else {
				System.out.println("入力値が正しくありません\n再入力");
				bufferd();
			}
			return num;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("入力エラー\n再入力");
			bufferd();
		}
		return num;
	}

	public int getRand() {
		return rand;
	}
}
