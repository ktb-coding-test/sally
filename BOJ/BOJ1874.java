import java.util.*;
import java.io.*;

public class BOJ1874 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();
		int check = 0, current = 1;
		boolean possible = true;
		
		for(int i =0; i< n; i++) {
			check = Integer.parseInt(br.readLine());
			while(current<=check) {
				stack.push(current);
				sb.append("+\n");
				current++;
			}
			if(stack.peek()==check) {
				stack.pop();
				sb.append("-\n");
			}else {
				possible = false;
				break;
			}
		}
		if(possible)
			System.out.println(sb);
		else
			System.out.println("NO");
		
	}

}
