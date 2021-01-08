// chapter 6 - �� ���� (pivot�����°�)
public class ch6_3 {
	public static int[] arr = {7,5,9,0,3,1,6,2,4,8};
	
	public static void quick(int[] array,int start, int end) {
		if(start>=end) return; // ���Ұ� �ϳ��� ���� 
		int pivot = start;
		int left = start+1;
		int right = end;
		
		// pivot ��ġ ������Ű�� (�����ϱ�)
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
		
		quick(arr,start,right-1); // ���� �� ����
		quick(arr,right+1,end);  // ���� �� ������
	}
	public static void main(String[] args) {
		

		System.out.println("Original Array : ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		
		System.out.println();
		
		// ���ʿ������� pivot���� ū ��, �����ʿ������� pivot���� ���� �� �� �� �ٲ�  -> �����Ǵ� ���� ���� ���� pivot�ٲ�
		quick(arr,0,arr.length-1);

		
		System.out.println("Sorted Array : ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		
	}

}
