package FormatNumber;
/* Utility for formatting currency, decimals and percents 
 * and generating a random number
 * F. Blendermann
 */
import java.text.NumberFormat;
import java.util.Random;

public class FormatNumberUtil {

	public static String getFormattedCurrency(double dollars) {
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		currency.setMaximumFractionDigits(2);
		currency.setMinimumFractionDigits(2);		
		return (currency.format(dollars));
	}
	
	public static String getFormattedCurrency(double dollars, int fractionDigits) {
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		currency.setMaximumFractionDigits(fractionDigits);
		currency.setMinimumFractionDigits(fractionDigits);		
		return (currency.format(dollars));
	}

	public static String getFormattedDecimal(double no, int fractionDigits) {
		NumberFormat decimal = NumberFormat.getInstance();
		decimal.setMaximumFractionDigits(fractionDigits);
		decimal.setMinimumFractionDigits(fractionDigits);
		return (decimal.format(no));
	}

	public static String getFormattedPercent(double no, int fractionDigits) {
		NumberFormat percent = NumberFormat.getPercentInstance();
		percent.setMaximumFractionDigits(fractionDigits);
		percent.setMinimumFractionDigits(fractionDigits);
		return (percent.format(no));
	}
	
	public static int getRandomBetween(int first, int last) {
		Random rnd = new Random();
		return (first + rnd.nextInt(last));
	}
}
