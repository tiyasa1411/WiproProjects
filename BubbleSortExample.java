package bubble;
import java.util.Arrays;
public class BubbleSortExample {
	public static void bubbleSort(int arr[]) {
		int temp, n = arr.length;
		for (int i = 0; i < n-1; i++) {//0
			for (int j = 0; j < n - i-1; j++) {//j=1 (7-0-1=6
				if (arr[j] > arr[j + 1]) {// arr[1] >arr[2]//arr[0]>arr[0+1}_
					temp = arr[j];//5
					arr[j] = arr[j + 1]; //arr[j]=3
					arr[j + 1] = temp;
				}
				
				System.out.println(Arrays.toString(arr));
			}
		}
	}
 
	public static void main(String args[]) {
		int arr[] = { 5, 3, 4 };
		bubbleSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
 
}



