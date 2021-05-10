package extra;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Util {
	private String str;
	private int num;
	private int rand = 5;//oldRand = 5
	Random random = new Random();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public int inputNum() {
		try {
			System.out.print(Constant.INPUT_STRING);
			str = br.readLine();
			num = Integer.parseInt(str);

		} catch (NumberFormatException e) {
			System.out.println(Constant.ERR_MESSAGE);
			num = inputNum();
		} catch (Exception e) {
			System.out.println(Constant.ERR_MESSAGE);
			num = inputNum();
		}
		return num;
	}

	public int numJudge(int jankenNum) {
		while (jankenNum > 2 || jankenNum < 0) {
			System.out.println(Constant.ERR_MESSAGE);
			jankenNum = inputNum();
		}
		return jankenNum;
	}

	public int random() {
		//		while (rand == oldRand) {
		//		}
		//		oldRand = rand;
		rand = random.nextInt(3);
		return rand;
	}
}
