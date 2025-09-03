package studio1;

import java.util.Scanner;

public class Ordered {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Value for x,y,z?");
		int x = in.nextInt();
		int y = in.nextInt();
		int z = in.nextInt();

		if ((x < y && y < z) ||( x>y && y>z)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}

}
