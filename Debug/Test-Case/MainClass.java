
import containers.CharOperator;
import containers.DateTimeContainer;
import containers.DoubleOperator;
import containers.FloatOperator;
import containers.IntOperator;
import utils.CommonUtils;

/**
 * 
 */

/**
 * @author arjun
 *
 */
public class MainClass {

	public static void main(String[] args) {
		intializeDataPoints();
	}

	private static void intializeDataPoints() {
		IntOperator iOp = new IntOperator();
		iOp.initDataPoints();
		CommonUtils.performOperation();
		System.out.println("Result: "+CommonUtils.dataList.hashCode());
		
		FloatOperator fOp = new FloatOperator();
		fOp.initDataPoints();
		CommonUtils.performOperation();
		System.out.println("Result: "+CommonUtils.dataList.hashCode());
		
		DoubleOperator dOp = new DoubleOperator();
		dOp.initDataPoints();
		CommonUtils.performOperation();
		System.out.println("Result: "+CommonUtils.dataList.hashCode());
		
		CharOperator cOp = new CharOperator();
		cOp.initDataPoints();
		CommonUtils.performOperation();
		System.out.println("Result: "+CommonUtils.dataList.hashCode());
		
		DateTimeContainer dtOp = new DateTimeContainer();
		dtOp.initDataPoints();
		CommonUtils.performOperation();
		System.out.println("Result: "+CommonUtils.dataList.hashCode());
		
	}

}
