import java.util.*;
import java.io.*;

public class BOJ11053 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int[] arr = new int[n+1];
		int[] dp = new int[n+1];
		
		st = new StringTokenizer(br.readLine());
		
		for(int i =1; i<=n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			dp[i] = 1;
		}
		int max = 1;
		for(int i =1; i<=n; i++) {
			for(int j = 1; j<i;j++) {
				if(arr[i]>arr[j]) {
					dp[i] = Math.max(dp[i], dp[j]+1);
				}
				max = Math.max(max, dp[i]);
			}

		}
		System.out.println(max);
	}

}