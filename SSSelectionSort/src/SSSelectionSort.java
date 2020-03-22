import java.util.ArrayList;

/**
 * @author - Sohail Shaik
 * @Date - Mar 21, 2020
 * @Assignment - SSSelectionSort
 */
public class SSSelectionSort {

	public static int[] selectionSort(ArrayList<String> arr) {
		int compare = 0;
		int assignment = 0;
		int itteration = 0;
		for (int i = 0; i < arr.size(); i++) {
			int swapPlace = i;
			for (int j = i; j < arr.size(); j++) {
				compare++;
				if (arr.get(j).compareTo(arr.get(swapPlace)) < 0)
					swapPlace = j;
			}

			if(i != swapPlace) {
				assignment++;
				String min = arr.get(swapPlace);
				assignment++;
				arr.set(swapPlace, arr.get(i));
				assignment++;
				arr.set(i, min);
			}
			
			itteration++;
		}
		
		int[] nums = {compare, assignment, itteration};
		return nums;
	}
	
	public static void insertionSortArrayList(ArrayList<String> list) {
	    for (int j = 1; j < list.size(); j++) {
	        String current = list.get(j);
	        int i = j-1;
	        while ((i > -1) && ((list.get(i).compareTo(current)) == 1)) {
	            list.set(i+1, list.get(i));
	            i--;
	        }
	        list.set(i+1, current);
	    }
	}
	
	@Override
	public String toString() {
		return "";
	}
}

