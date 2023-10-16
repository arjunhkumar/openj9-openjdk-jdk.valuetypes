/**
 * 
 */
package inlineable;

/**
 * @author arjun
 *
 */
public primitive class TimeVal {

	final int hours;
	final int minutes;
	final int seconds;
	/**
	 * @param hours
	 * @param minutes
	 * @param seconds
	 */
	public TimeVal(int hours, int minutes, int seconds) {
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}
	public int getHours() {
		return hours;
	}
	public int getMinutes() {
		return minutes;
	}
	public int getSeconds() {
		return seconds;
	}
	
}
