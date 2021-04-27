package enhancement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class janken_saga {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Random Random = new Random();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] zyanken = { "グー", "チョキ", "パー" };
		int i, num, rand;
		int n_win = 0;
		int p_win = 0;
		try {
			for (i = 0; i < 3;) {
				System.out.println("【" + (i + 1) + "】回戦目");
				System.out.println("プレイヤーの手を決めてください"
						+ "\n（グー：0 チョキ:1 パー:2）");
				System.out.print(">");
				String str = reader.readLine();
				num = Integer.parseInt(str);
				if (num < 3 && num >= 0) {
					i++;
					rand = Random.nextInt(2);
					System.out.println(zyanken[num] + "vs" + zyanken[rand]);
					if (num == rand) {
						System.out.println("引き分けです");
					} else if (num == 0 && rand == 1
							|| num == 1 && rand == 2
							|| num == 2 && rand == 0) {
						System.out.println("プレイヤーが勝ちました!");
						p_win++;
					} else {
						System.out.println("コンピュータが勝ちました");
						n_win++;
					}
				} else {
					System.out.println("入力した値が誤っています、再度入力してください");
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
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("システムエラーが発生しました。\n" + "システムを終了します。");
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
}
