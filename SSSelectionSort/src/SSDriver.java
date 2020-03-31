import java.util.ArrayList;

/**
 * @author - Sohail Shaik
 * @Date - Mar 21, 2020
 * @Assignment - SSSelectionSort
 */
public class SSDriver {
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();
//		the order it should print out
//		list1.add("apple");
//		list1.add("ball");
//		list1.add("cat");
//		list1.add("doll");
//		list1.add("elf");
//		list1.add("fire");
//		list1.add("golf");
//		list1.add("hill");
//		list1.add("ice");
//		list1.add("lion");

//		<-------------Test 1----------------->
//		list1.add("apple");
//		list1.add("ball");
//		list1.add("cat");
//		list1.add("doll");
//		list1.add("elf");
//		list1.add("fire");
//		list1.add("golf");
//		list1.add("hill");
//		list1.add("ice");
//		list1.add("lion");
//		
//		System.out.println(list1);
//		int[] arr = SSSelectionSort.selectionSort(list1);
//		for(int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
//		System.out.println();
//		System.out.println(list1);
//		
////		<-------------insertion----------------->
//		
//		list2.add("apple");
//		list2.add("ball");
//		list2.add("cat");
//		list2.add("doll");
//		list2.add("elf");
//		list2.add("fire");
//		list2.add("golf");
//		list2.add("hill");
//		list2.add("ice");
//		list2.add("lion");
//		
//		System.out.println(list2);
//		int[] arr1 = SSSelectionSort.insertionSortArrayList(list2);
//		for(int i = 0; i < arr1.length; i++) {
//			System.out.print(arr1[i] + " ");
//		}
//		System.out.println();
//		System.out.println(list2);
		
		
		
		
//		<-------------Test 2----------------->
		list1.add("hill");
		list1.add("doll");
		list1.add("ice");
		list1.add("golf");
		list1.add("cat");
		list1.add("apple");
		list1.add("fire");
		list1.add("ball");
		list1.add("elf");
		list1.add("lion");
		
		System.out.println(list1);

		
		int[] arr = SSSelectionSort.selectionSort(list1);
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println(list1);
//		<-------------insertion----------------->
		list2.add("hill");
		list2.add("doll");
		list2.add("ice");
		list2.add("golf");
		list2.add("cat");
		list2.add("apple");
		list2.add("fire");
		list2.add("ball");
		list2.add("elf");
		list2.add("lion");
		
		System.out.println(list2);
		int[] arr1 = SSSelectionSort.insertionSortArrayList(list2);
		for(int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		System.out.println(list2);
		

		
	}
	
	/*
	 * as you can see with test number 1 when the selection sort gets an already sorted list it will compare 55 times
	 * where as the insertion list will not compare at all it will although itterate 9 times where as the selection sort will 
	 * itterate 10 times. the insertion sort Big O is O(n) which is less that the selection sort Bog O(n^2).
	 * 
	 *  so overall I think that insertion sort is better than selection sort.
	 */ 
}
