// chapter 6 - 퀵 정렬 (pivot나오는거)
public class ch6_3 {
	public static int[] arr = {7,5,9,0,3,1,6,2,4,8};
	
	public static void quick(int[] array,int start, int end) {
		if(start>=end) return; // 원소가 하나면 종료 
		int pivot = start;
		int left = start+1;
		int right = end;
		
		// pivot 위치 고정시키기 (분할하기)
		while(left<=right) {
			while(left<=end && arr[left] <= arr[pivot])
				left++;
			
			while(right > start && arr[right] >= arr[pivot])
				right--;
			
			if(left > right) {
				int temp = arr[pivot];
				arr[pivot] = arr[right];
				arr[right] = temp;
			}
			
			else {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
			}
		}
		
		quick(arr,start,right-1); // 분할 후 왼쪽
		quick(arr,right+1,end);  // 분할 후 오른쪽
	}
	public static void main(String[] args) {
		

		System.out.println("Original Array : ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		
		System.out.println();
		
		// 왼쪽에서부터 pivot보다 큰 값, 오른쪽에서부터 pivot보다 작은 값 고른 후 바꿈  -> 교차되는 순간 작은 값과 pivot바꿈
		quick(arr,0,arr.length-1);

		
		System.out.println("Sorted Array : ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		
	}

}
