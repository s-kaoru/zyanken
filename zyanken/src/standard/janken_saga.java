package standard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class janken_saga {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		Random Random = new Random();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int p_win, n_win, numA, numB;
		String strA, strB, str;
		strA = "";
		strB = "";
		numA = 0;
		numB = 0;
		p_win = 0;
		n_win = 0;
		for (int i = 0; i < 3; i++) {
			System.out.println("【" + (i + 1) + "】回戦目");
			System.out.println("プレイヤーの手を決めてください"
					+ "\n（グー：0 チョキ:1 パー:2）");
			System.out.print(">");
			str = reader.readLine();
			numA = Integer.parseInt(str);
			numB = Random.nextInt(2);
			switch (numA) {
			case 0:
				strA = "グー";
				break;
			case 1:
				strA = "チョキ";
				break;
			case 2:
				strA = "パー";
				break;
			default:
				System.out.println("入力した値が異常値です\nプログラムを終了します");
				System.exit(0);
			}
			switch (numB) {
			case 0:
				strB = "グー";
				break;
			case 1:
				strB = "チョキ";
				break;
			case 2:
				strB = "パー";
				break;
			}
			System.out.println(strA + "vs" + strB);
			if (numA == numB) {
				System.out.println("引き分けです");
			} else if (numA == 0 && numB == 1
					|| numA == 1 && numB == 2
					|| numA == 2 && numB == 0) {
				System.out.println("プレイヤーが勝ちました!");
				p_win++;
			} else {
				System.out.println("コンピュータが勝ちました");
				n_win++;
			}
		}
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
