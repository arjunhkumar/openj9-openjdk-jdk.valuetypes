/**
 * 
 */
package containers;

import java.util.Random;

import inlineable.FloatVal3D;
import utils.CommonUtils;

/**
 * @author arjun
 *
 */
public class FloatOperator implements AbstractOperator{
	
	FloatVal3D val1;
	FloatVal3D val2;
	FloatVal3D result;
	
	
	/**
	 * 
	 */
	public FloatOperator() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param val1
	 * @param val2
	 */
	public FloatOperator(FloatVal3D val1, FloatVal3D val2) {
		this.val1 = val1;
		this.val2 = val2;
	}
	public FloatVal3D getVal1() {
		return val1;
	}
	public void setVal1(FloatVal3D val1) {
		this.val1 = val1;
	}
	public FloatVal3D getVal2() {
		return val2;
	}
	public void setVal2(FloatVal3D val2) {
		this.val2 = val2;
	}
	@Override
	public void performOperation() {
		this.result = new FloatVal3D(this.val1.getX() + this.val2.getX()
		, this.val1.getY() + this.val2.getY()
		, this.val1.getZ() + this.val2.getZ());
		
	}
	
	@Override
	public void initDataPoints() {
		CommonUtils.clearData();
		Random random = new Random();
		for(int i=0;i<5000;i++) {
			FloatVal3D val1 = new FloatVal3D(random.nextFloat(), random.nextFloat(), random.nextFloat());
			FloatVal3D val2 = new FloatVal3D(random.nextFloat(), random.nextFloat(), random.nextFloat());
			CommonUtils.addData(new FloatOperator(val1, val2));
		}
	}
	
}
