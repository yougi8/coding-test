// chapter 6 - ����  ���� �⺻
public class ch6_2 {

	public static void main(String[] args) {
		int[] arr = {7,5,9,0,3,1,6,2,4,8};

		System.out.println("Original Array : ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		
		System.out.println();
		
		for(int i = 1; i < arr.length; i++) {
			  
			// ��ġ ���� index���� �����ؼ� �������� Ž��
			  for(int j=i;j>0;j--) {
				  // ��ĭ�� �������� �̵�
				  if(arr[j]<arr[j-1]) {
					  int temp=arr[j-1];
					  arr[j-1]=arr[j];
					  arr[j]=temp;
				  }
				  else
					  break;
			  }
		}

		System.out.println("Sorted Array : ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		
	}

}
