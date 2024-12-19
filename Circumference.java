package Hwday8;

public class Circumference {
	public static float circle(int r) {
		double pi=3.14;
		return (float) (2*(pi*r));
	}
		public static void main(String[] args) {
			double a=circle(60);
			System.out.println("Circumference of circle " + a);
		}
}
