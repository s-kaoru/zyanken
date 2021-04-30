package extra;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Util {
	private String str;
	private int num;

	public int inputNumber() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println(">");
			str = br.readLine();
			num = Integer.parseInt(str);

		} catch (NumberFormatException e) {
			System.out.println("入力エラー\n再入力>");
			num = inputNumber();
		} catch (Exception e) {
			inputNumber();
		}
		return num;
	}
}
