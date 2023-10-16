/**
 * 
 */
package inlineable;

/**
 * @author arjun
 *
 */
public primitive class DateVal {

	final int day;
	final int month;
	final int year;
	
	/**
	 * @param day
	 * @param month
	 * @param year
	 */
	public DateVal(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}
	
	
	
}
