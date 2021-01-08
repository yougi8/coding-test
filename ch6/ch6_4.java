// chapter 6 - 계수 정렬
public class ch6_4 {

	public static void main(String[] args) {
		
		int[] arr = {7,5,9,0,3,1,6,2,4,8};
		int[] count = new int[arr.length];
		
		System.out.println("Original Array : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			count[i]=0;
		}
		System.out.println();
		
		for(int i=0;i<arr.length;i++) {
			count[arr[i]]++;
		}
		
		System.out.println("Sorted Array : ");
		for(int i=0;i<count.length;i++) {
			if(count[i]==0)
				continue;
			for(int j=0;j<count[i];j++) {
				System.out.print(i+" ");
			}
		}
		

	}

}
