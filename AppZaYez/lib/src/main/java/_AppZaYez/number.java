package _AppZaYez;

import java.util.Random;

public class number {
	public static void numberInfo(String[] args) {
		Random random = new Random();

		int randomNumber = random.nextInt(101);

		System.out.println("Số ngẫu nhiên là: " + randomNumber);
	}
}
