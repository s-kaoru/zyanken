package extra;

import java.util.Arrays;
import java.util.List;

class JankenJudge {

	public JankenJudge() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public void judge(Player player, List<Player> comList) {
		List<Boolean> usedHand = Arrays.asList(false, false, false);
		usedHand.set(player.getHand(), true);
		for (Player cpu : comList) {
			usedHand.set(cpu.getHand(), true);
		}

		// 引き分けのパターン、上から「グーチョキパー、グーのみ、チョキのみ、パーのみ」

		// メソッド終了
		return;
	}
}