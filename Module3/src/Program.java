import java.util.Scanner;
public class Program {
	public static void main(String[] args) {
		System.out.println("Enter the coupon amount (an amount between 0 and 1):");
		Scanner c = new Scanner(System.in);
		float coupon = c.nextFloat();
		if (coupon > 1) {
			coupon = 1;
		} else if (coupon < 0 ) {
			coupon = 0;
		}
		System.out.println("Enter the cost of groceries for 4 weeks:");
		Scanner w = new Scanner(System.in);
		float week1 = w.nextFloat();
		float week2 = w.nextFloat();
		float week3 = w.nextFloat();
		float week4 = w.nextFloat();
		float average = (week1 + week2 + week3 + week4) / 4;
		float couponaverage = average * (1 - coupon);
		System.out.println("Costs with coupon reduction: " + couponaverage);
		System.out.println("Costs without coupon reduction: " + average);
	}
}
