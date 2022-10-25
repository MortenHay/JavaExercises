package Uge8.Exercise3;

import java.awt.Point;

public class Knight extends Point {

	public static void main(String[] args) {
		// Test
		Knight knight = new Knight(3, 3);
		System.out.println(knight);

		knight.translate(1, 2);
		System.out.println(knight);
		knight.translate(1, -2);
		System.out.println(knight);
		knight.translate(-1, 3);
		System.out.println(knight);
	}

	public Knight() {
	}

	public Knight(Point p) {
		super(p);
	}

	public Knight(int x, int y) {
		super(x, y);
	}

	public void translate(int dx, int dy) {
		// Check whether tis is a lergal knight move. Otherwise do not move.
		// hint: Math.abs can be used to simplify the code.
		// hint: super to execute leags moves.

		int absX = Math.abs(dx);
		int absY = Math.abs(dy);
		if ((absX == 1 && absY == 2) || (absX == 2 && absY == 1)) {
			super.translate(dx, dy);
		}
	}

	public String toString() {
		return "Knight[x=" + (int) super.getX() + ",y=" + (int) super.getY() + "]";
	}
}
