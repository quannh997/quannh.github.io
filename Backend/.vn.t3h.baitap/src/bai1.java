import java.util.Arrays;

public class bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		chenGiaTri();
		xoaPhanTu();
		chenMang();
	}
	public static void chenGiaTri() {
		int[] arr = {90, 90, 20 ,27, 35, 2, 2, 10, 8, 8};
		int[] arr1 = new int[arr.length + 1];
		int j = 0;
		for(int i = 0; i < arr1.length; i++) {
			if(i != 2) {
				arr1[i] = arr[j];
				j++;
			}else {
				arr1[i] = 100;
			}
		}
		System.out.println("arr1: ");
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
	}
	public static void xoaPhanTu() {
		int[] arr = {90, 90, 20 ,27, 35, 2, 2, 10, 8, 8};
//		if (arr.length == 0 || arr.length == 1)
//			return 0;
		int[] sortArr = arr;
		int[] arr1 = new int[arr.length];
		int j = 0;
		Arrays.sort(sortArr);
//		System.out.println("sortArr: ");
//		for(int i=0;i<sortArr.length;i++) {
//			System.out.print(sortArr[i] + " ");
//		}
			
		for ( int i = 0; i < arr.length-1; i++) {
			if(sortArr[i] != sortArr[i+1]) {
				 arr1[j] = sortArr[i] ;
				 j++;
			} 
		}
		arr1[j]  = sortArr[arr.length-1];
//		System.out.println();
//		System.out.println("j =  " + j);
//		System.out.print("Sap xep: ");
//		for(int i=0;i<arr1.length;i++) {
//			System.out.print(arr1[i] + " ");
//	}
		int[] arr2 = new int[j];
		for(int n = 0; n < j; n++) {
			arr2[n] = arr1[n];
		}
		System.out.println("Mang sau xoa: " + Arrays.toString(arr2));
		
	}	
	private static void chenMang() {
		int[] arr = {90, 90, 20 ,27, 35, 2, 2, 10, 8, 8};
		int n = arr.length + 1;
		int[] newarr = new int[n];
		int position = 2;
		int valueofEnd = arr[arr.length -1 ];
		int value = 100;
		for(int i = arr.length -1 ; i > position; i--) {
			arr[i] = arr[i-1];
		}
		arr[position] = value;
		for (int j = 0; j < arr.length; j++) {
			newarr[j] = arr[j];
		}
		newarr[newarr.length -1] = valueofEnd;
		System.out.println("");
		System.out.println("Mang sau chen: " + Arrays.toString(newarr));
	}
	
}
