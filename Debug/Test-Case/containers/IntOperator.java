/**
 * 
 */
package containers;

import java.util.Random;

import inlineable.IntVal3D;
import utils.CommonUtils;

/**
 * @author arjun
 *
 */
public class IntOperator implements AbstractOperator{
	
	IntVal3D val1;
	IntVal3D val2;
	IntVal3D result;
	
	/**
	 * 
	 */
	public IntOperator() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param val1
	 * @param val2
	 */
	public IntOperator(IntVal3D val1, IntVal3D val2) {
		this.val1 = val1;
		this.val2 = val2;
	}
	public IntVal3D getVal1() {
		return val1;
	}
	public void setVal1(IntVal3D val1) {
		this.val1 = val1;
	}
	public IntVal3D getVal2() {
		return val2;
	}
	public void setVal2(IntVal3D val2) {
		this.val2 = val2;
	}
	
	@Override
	public void performOperation() {
		this.result = new IntVal3D(this.val1.getX() + this.val2.getX()
		, this.val1.getY() + this.val2.getY()
		, this.val1.getZ() + this.val2.getZ());
	}
	
	@Override
	public void initDataPoints() {
		CommonUtils.clearData();
		Random random = new Random();
		for(int i=0;i<5000;i++) {
			IntVal3D val1 = new IntVal3D(random.nextInt(), random.nextInt(), random.nextInt());
			IntVal3D val2 = new IntVal3D(random.nextInt(), random.nextInt(), random.nextInt());
			CommonUtils.addData(new IntOperator(val1, val2));
		}
	}
	
}
