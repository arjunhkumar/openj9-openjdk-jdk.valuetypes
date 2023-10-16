/**
 * 
 */
package containers;

import java.sql.Timestamp;
import java.util.Random;

import inlineable.DateVal;
import inlineable.DoubleVal3D;
import inlineable.TimeVal;
import utils.CommonUtils;

/**
 * @author arjun
 *
 */
public class DateTimeContainer implements AbstractOperator{

	DateVal date;
	TimeVal time;
	Timestamp result;
	
	/**
	 * 
	 */
	public DateTimeContainer() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param date
	 * @param time
	 */
	public DateTimeContainer(DateVal date, TimeVal time) {
		this.date = date;
		this.time = time;
	}

	public DateVal getDate() {
		return date;
	}

	public void setDate(DateVal date) {
		this.date = date;
	}

	public TimeVal getTime() {
		return time;
	}

	public void setTime(TimeVal time) {
		this.time = time;
	}

	@Override
	public void performOperation() {
		result = new Timestamp(date.getYear(), date.getMonth(), date.getDay(), time.getHours(), time.getMinutes(), time.getSeconds(), 0);
	}
	
	@Override
	public void initDataPoints() {
		CommonUtils.clearData();
		Random random = new Random();
		for(int i=0;i<5000;i++) {
			DateVal val1 = new DateVal(random.nextInt(0, 27), random.nextInt(1, 12), random.nextInt(1900, 2050));
			TimeVal val2 = new TimeVal(random.nextInt(0, 23), random.nextInt(0, 60), random.nextInt(0, 60));
			CommonUtils.addData(new DateTimeContainer(val1, val2));
		}
	}
	
}
