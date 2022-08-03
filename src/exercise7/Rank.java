package exercise7;
public class Rank {

	public static String rank(int n) {
		String rank = "";
		int tens = n % 100;

		if (tens != 11 && tens != 12 && tens != 13) {
			int units = n % 10;
			switch (units) {
			case 1:
				rank = "st";
				break;
			case 2:
				rank = "nd";
				break;
			case 3:
				rank = "rd";
				break;
			default:
				rank = "th";
			}
		}

		return n + rank;
	}

}
