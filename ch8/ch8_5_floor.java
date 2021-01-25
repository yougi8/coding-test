// chapter 8 다이나믹 프로그래밍 - 바닥 공사

import java.util.*;

public class ch8_5_floor {

	public static void main(String[] args) {
		/* 실습 시간 : 오래걸림 아주 많이
		 * 아 dp 머선일이고~ 왜이렇게 어렵니~ 점화식 뭔데~
		 * 오른쪽부터 타일을 채워나간다고 할 때, 가능한 경우의 수는 총 5가지이다. 그 중 표면 상 같은 경우가 2개씩 2쌍이 있다.
		 * */
		
		Scanner keyboard = new Scanner(System.in);
		int n = keyboard.nextInt();
		int[] dp = new int[1001];
		
		/* 코드 실행시간 계산 */
		long beforeTime = System.currentTimeMillis(); 
		
		dp[1] = 1;
		dp[2] = 3;
		for(int i=3;i<=n;i++) {
			dp[i] = (dp[i-1] + 2*dp[i-2]) % 796796; // 2*dp[i-2] : 표면상 같은 경우 2개씩 2쌍
		}
		
		System.out.println(dp[n]);
		
	   /* 코드 실행시간 계산 */
       long afterTime = System.currentTimeMillis();
       long secDiffTime = (afterTime - beforeTime) / 1000;
       System.out.println("\n실행시간(second) : " + secDiffTime);

	}

}
