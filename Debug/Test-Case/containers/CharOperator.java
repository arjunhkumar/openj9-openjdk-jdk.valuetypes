/**
 * 
 */
package containers;

import inlineable.CharVal3D;

/**
 * @author arjun
 *
 */
public class CharOperator implements AbstractOperator {
	
	CharVal3D val1;
	CharVal3D val2;
	String result;

	/**
	 * 
	 */
	public CharOperator() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param val1
	 * @param val2
	 */
	public CharOperator(CharVal3D val1, CharVal3D val2) {
		this.val1 = val1;
		this.val2 = val2;
	}
	public CharVal3D getVal1() {
		return val1;
	}
	public void setVal1(CharVal3D val1) {
		this.val1 = val1;
	}
	public CharVal3D getVal2() {
		return val2;
	}
	public void setVal2(CharVal3D val2) {
		this.val2 = val2;
	}
	@Override
	public void performOperation() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.val1.getX());
		sb.append(this.val2.getX());
		sb.append(this.val1.getY());
		sb.append(this.val2.getY());
		sb.append(this.val1.getZ());
		sb.append(this.val2.getZ());
		result = sb.toString();
	}
	@Override
	public void initDataPoints() {
		
	}
	
}
