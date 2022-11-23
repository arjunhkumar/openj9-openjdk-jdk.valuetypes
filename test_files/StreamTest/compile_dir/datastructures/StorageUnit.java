package datastructures;

public primitive class StorageUnit {

	int val;
	String name;
	
	/**
	 * @param val
	 * @param name
	 */
	public StorageUnit(int val, String name) {
		this.val = val;
		this.name = name;
	}
	
	/**
	 * @return the val
	 */
	public int getVal() {
		return val;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
}
