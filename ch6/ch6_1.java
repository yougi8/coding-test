// chapter 6 - ���� ���� �⺻
public class ch6_1 {

	public static void main(String[] args) {
		int[] arr = {7,5,9,0,3,1,6,2,4,8};

		System.out.println("Original Array : ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		
		System.out.println();
		
		for(int i=0;i<arr.length;i++) {

			int index = i; // �ּҰ��� index
			
			for(int j=i;j<arr.length;j++) {
				if(arr[j]<arr[index])
					index = j;
			}
			
			// �ּҰ��� �� �� �� �ٲٱ�
			int temp = arr[i];
			arr[i] = arr[index];
			arr[index] = temp;
			
			
		}

		System.out.println("Sorted Array : ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}

}
