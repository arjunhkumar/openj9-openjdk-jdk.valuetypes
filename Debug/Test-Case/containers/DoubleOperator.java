/**
 * 
 */
package containers;

import java.util.Random;

import inlineable.DoubleVal3D;
import utils.CommonUtils;

/**
 * @author arjun
 *
 */
public class DoubleOperator implements AbstractOperator{
	
	DoubleVal3D val1;
	DoubleVal3D val2;
	DoubleVal3D result;
	
	/**
	 * 
	 */
	public DoubleOperator() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param val1
	 * @param val2
	 */
	public DoubleOperator(DoubleVal3D val1, DoubleVal3D val2) {
		this.val1 = val1;
		this.val2 = val2;
	}
	public DoubleVal3D getVal1() {
		return val1;
	}
	public void setVal1(DoubleVal3D val1) {
		this.val1 = val1;
	}
	public DoubleVal3D getVal2() {
		return val2;
	}
	public void setVal2(DoubleVal3D val2) {
		this.val2 = val2;
	}
	@Override
	public void performOperation() {
		this.result = new DoubleVal3D(this.val1.getX() + this.val2.getX()
		, this.val1.getY() + this.val2.getY()
		, this.val1.getZ() + this.val2.getZ());
	}
	
	@Override
	public void initDataPoints() {
		CommonUtils.clearData();
		Random random = new Random();
		for(int i=0;i<5000;i++) {
			DoubleVal3D val1 = new DoubleVal3D(random.nextDouble(), random.nextDouble(), random.nextDouble());
			DoubleVal3D val2 = new DoubleVal3D(random.nextDouble(), random.nextDouble(), random.nextDouble());
			CommonUtils.addData(new DoubleOperator(val1, val2));
		}
	}
	
}
