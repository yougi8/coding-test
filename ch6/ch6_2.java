// chapter 6 - 삽입  정렬 기본
public class ch6_2 {

	public static void main(String[] args) {
		int[] arr = {7,5,9,0,3,1,6,2,4,8};

		System.out.println("Original Array : ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		
		System.out.println();
		
		for(int i = 1; i < arr.length; i++) {
			  
			// 위치 정할 index부터 시작해서 왼쪽으로 탐색
			  for(int j=i;j>0;j--) {
				  // 한칸씩 왼쪽으로 이동
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
