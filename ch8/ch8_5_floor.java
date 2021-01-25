// chapter 8 ���̳��� ���α׷��� - �ٴ� ����

import java.util.*;

public class ch8_5_floor {

	public static void main(String[] args) {
		/* �ǽ� �ð� : �����ɸ� ���� ����
		 * �� dp �Ӽ����̰�~ ���̷��� ��ƴ�~ ��ȭ�� ����~
		 * �����ʺ��� Ÿ���� ä�������ٰ� �� ��, ������ ����� ���� �� 5�����̴�. �� �� ǥ�� �� ���� ��찡 2���� 2���� �ִ�.
		 * */
		
		Scanner keyboard = new Scanner(System.in);
		int n = keyboard.nextInt();
		int[] dp = new int[1001];
		
		/* �ڵ� ����ð� ��� */
		long beforeTime = System.currentTimeMillis(); 
		
		dp[1] = 1;
		dp[2] = 3;
		for(int i=3;i<=n;i++) {
			dp[i] = (dp[i-1] + 2*dp[i-2]) % 796796; // 2*dp[i-2] : ǥ��� ���� ��� 2���� 2��
		}
		
		System.out.println(dp[n]);
		
	   /* �ڵ� ����ð� ��� */
       long afterTime = System.currentTimeMillis();
       long secDiffTime = (afterTime - beforeTime) / 1000;
       System.out.println("\n����ð�(second) : " + secDiffTime);

	}

}
