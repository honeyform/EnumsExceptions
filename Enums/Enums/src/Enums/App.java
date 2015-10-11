package Enums;

/**
 * Created by oleksii on 9/29/15.
 */
public class App {
	public static void main(String[] args) {
		Month.calculeteDaysInPeriod(Month.August, 2012, Month.May);
		System.out.println(Month.calculeteDaysInPeriod(Month.April, 2015, Month.March));
		System.out.println(Month.detectSeason(Month.April));
		System.out.println(Month.detectSeason(Month.December));
	}
}
