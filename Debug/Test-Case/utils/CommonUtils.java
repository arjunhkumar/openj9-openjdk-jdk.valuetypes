/**
 * 
 */
package utils;

import java.util.LinkedList;
import java.util.List;

import containers.AbstractOperator;

/**
 * @author arjun
 *
 */
public class CommonUtils {

	/**
	 * @param args
	 */
	public static List<AbstractOperator> dataList;

	public static void addData(AbstractOperator listData) {
			if(dataList == null) {
				dataList = new LinkedList<>();
			}
			dataList.add(listData);
		}

	public static void clearData() {
		if(dataList == null) {
			dataList = new LinkedList<>();
		}
		dataList.clear();
	}

	public static void performOperation() {
		if(dataList != null) {
			for(AbstractOperator operator: dataList) {
				operator.performOperation();
			}
		}
	}

}
