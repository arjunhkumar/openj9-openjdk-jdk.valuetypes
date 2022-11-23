/**
 * 
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import datastructures.NonValueStorageUnit;
import datastructures.StorageUnit;

/**
 * @author arjun
 *
 */
public class StreamTest {

	public static void main(String args[]) {
		testRefParam((new StorageUnit(1,"x")));
		testStream(true);
		testStream();
	}

	private static void testStream() {
		System.out.println("Executing test in VT model");
		List<StorageUnit.ref> unitsList = new ArrayList<>();
		insertData(unitsList);
		Object listObj = unitsList.stream().filter(s -> s.getVal()>25);
//		if(listObj instanceof List) {
//			System.out.println("Instance of List");
//		}else {
//			System.out.println("Not an instance of List");
//			System.out.println(listObj.toString());
//		}
		List<StorageUnit.ref> resultList = unitsList.stream().filter(s -> s.getVal()>25).collect(Collectors.toList());
		printList(resultList);
		System.out.println("Completed execution test in VT model");
	}

	private static void testStream(boolean isNonValueTypeModel) {
		System.out.println("Executing test in NonVT model");
		List<NonValueStorageUnit> unitsList = new ArrayList<>();
		insertData(unitsList,true);
		Object listObj = unitsList.stream().filter(s -> s.getVal()>25);
		List<NonValueStorageUnit> resultList = unitsList.stream().filter(s -> s.getVal()>25).collect(Collectors.toList());
//		printList(resultList,true);
		System.out.println("Completed execution test in Non-VT model");
	}

	private static void insertData(List<StorageUnit.ref> unitsList) {
		if(unitsList == null) {
			unitsList = new ArrayList<>();
		}
		for(int i=0;i<50;i++) {
			String key = createRandomString();
			StorageUnit unit = new StorageUnit(i, key);
			unitsList.add(unit);
		}
	}
	
	private static void insertData(List<NonValueStorageUnit> unitsList, boolean isNonValueTypeModel) {
		if(unitsList == null) {
			unitsList = new ArrayList<>();
		}
		for(int i=0;i<50;i++) {
			String key = createRandomString();
			NonValueStorageUnit unit = new NonValueStorageUnit(i, key);
			unitsList.add(unit);
		}
	}

	/**
	 * @return 
	 * 
	 */
	private static String createRandomString() {
		int leftLimit = 97; // letter 'a'
	    int rightLimit = 122; // letter 'z'
	    int targetStringLength = 5;
	    Random random = new Random();

	    return random.ints(leftLimit, rightLimit + 1)
	      .limit(targetStringLength)
	      .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
	      .toString();
	}
	
	private static void printList(List<StorageUnit.ref> resultList) {
		if(null!=resultList && !resultList.isEmpty()) {
			for(StorageUnit unit:resultList) {
				System.out.println(unit.getName()+" : "+unit.getVal());
			}
		}
	}
	
	private static void printList(List<NonValueStorageUnit> resultList, boolean isNonValueTypeModel) {
		if(null!=resultList && !resultList.isEmpty()) {
			for(NonValueStorageUnit unit:resultList) {
				System.out.println(unit.getName()+" : "+unit.getVal());
			}
		}
	}
	
	private static boolean testRefParam(StorageUnit.ref refVal) {
		System.out.println(refVal.getVal());
		return true;
	}
	
}
