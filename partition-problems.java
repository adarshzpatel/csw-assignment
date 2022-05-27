import java.util.ArrayList;
import java.util.Arrays;

public class PartitionProblems {
	// write a program to arrange a set of 0s and 1s in an array.
	// such that all the zeroes are stored at the left hand side followed by all the ones.
	// time complexity should be O(n);
	
	public static void swap(int[] arr, int i,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void twoPartition(int[] arr) {
		int i = 0 ,j = arr.length-1;
		
		while(i<j) {
			while(arr[i] == 0) i++;
			while(arr[j] == 1) j--;
			if(i<j) {				
				swap(arr,i,j);
				i++;j--;
			}
		}
	}	
	
	public static void threePartition(int[] arr) {
		int left = 0, i = 0, right = arr.length - 1;
		while(i <= right) {
			if(arr[i] == 0) {
				swap(arr,i,left);
				left++;
				i++;
			} else if(arr[i] == 2) {
				swap(arr,i,right);
				right--;
			} else {
				i++;
			}
		}
	}
	
	public static void rangePartition(int[] arr,int lower,int upper) {
		int left = 0, i = 0, right = arr.length - 1 ;
		while(i <= right) {
			if(arr[i] < lower) {
				swap(arr,i,left);
				left++;i++;
			} else if(arr[i] > upper) {
				swap(arr,i,right);
				right--;
			} else {
				i++;
			}
		}
	}
	
	public static void getUnionIntersection(int[] a,int[] b) {
		ArrayList<Integer> union = new ArrayList<Integer>();
		ArrayList<Integer> intersection = new ArrayList<Integer>();
		Arrays.sort(a);Arrays.sort(b);
		int n1 =  a.length;
		int n2 = b.length;
		int i=0,j=0;
		
		while(i< n1 && j < n2) {
			if(a[i] == b[j]) {
				intersection.add(a[i]);
				union.add(a[i]);
				i++;j++;
			} else {
				if(a[i] < b[j]) {
					union.add(a[i]);i++;
				} else {
					union.add(a[j]);j++;
				}
			}
		}
		while(i < n1){
			union.add(a[i]);
		}
		while(i < n2){
			union.add(a[j]);
		}
		
		System.out.println("Union : " + union.toString());
		System.out.println("Intersection : " + intersection.toString());
		
		
	}
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {3,4,5,6,7};
		getUnionIntersection(arr1,arr2);
	}

}
