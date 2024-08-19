import java.util.*;
import java.io.*;

public class BOJ9663 {
	static int n;
	static int[] arr;
	static int count;
	
	public static void main(String[] args) throws IOException {
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	 StringTokenizer st = new StringTokenizer(br.readLine());
	 
	 n = Integer.parseInt(st.nextToken());
	 arr = new int[n];
	 count = 0;
	 
	 recursion(0);
	 bw.flush();
	 bw.write(String.valueOf(count));
	 bw.close();
	 

	}
	static void recursion(int depth) {
		if(depth == n) { 
			count++;
			return;
		}
		for(int i = 0; i<n; i++) {
			arr[depth] = i;
			if(possible(depth))
				recursion(depth+1);
		}
	}
	static boolean possible(int col) {
		for(int i =0; i<col; i++) {
			if(arr[i]==arr[col])
				return false;
			else if(Math.abs(col-i) == Math.abs(arr[col]-arr[i]))
				return false;
		}
		return true;
	}
}
