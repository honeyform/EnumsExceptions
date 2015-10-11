package Enums;

/**
 * Created by oleksii on 9/29/15.
 */
public enum  Month {
	January(31, 1), February(28, 2), March(31, 3), April(30, 4),
	May(31, 5), June(30, 6), July(31, 7), August(31, 8),
	September(30, 9), October(31, 10), November(30, 11),
	December(31, 12);


	Month (int days, int numberInYear){
		this.days = days;
		this.numberInYear = numberInYear;
	}

	private final int numberInYear;
	private final int days;


	public static int calculeteDaysInPeriod(Month from, int year, Month to){

		int result = from.days;
		Month current = from;
		while (current!=to){
			current = getNextMonth(current);
			result += current.days;
			year = modifierYear(current, year);
			if (year%4 == 0 && current == February){
				result += 1;
			}
		}
		return result;
	}
	private static Month getNextMonth(Month currentMonth){
		if (currentMonth.numberInYear == 12){
			return January;
		}
		for (Month m:values()){
			if(currentMonth.numberInYear+1 == m.numberInYear){
				return m;
			}
		}
		throw new IllegalArgumentException("Cannot find next month for " + currentMonth);
	}

	private static int modifierYear (Month currentMonth, int year) {
		if (currentMonth.numberInYear == 12) {
			return year+1;
		}
		return  year;
	}

	public static String detectSeason(Month month){
		switch (month){
			case December:
			case January:
			case February:return "Winter";
			case March:
			case April:
			case May:return "Spring";
			case June:
			case July:
			case August:return "Summer";
			case September:
			case November:
			case October:return "Fall";
			default: throw new IllegalArgumentException("Wrong month " +month);
		}
	}
}
