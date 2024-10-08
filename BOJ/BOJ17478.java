import java.util.*;
import java.io.*;
public class BOJ17478 {
	static StringBuilder sb;	
	static BufferedWriter bw;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		bw.write("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.\n");
		recursion(n);
		bw.flush();
		bw.close();
		
	}
	static String line = "";
	static void recursion(int n) throws IOException {
		String underbar = line;
		if(n == 0) {
			bw.write(underbar+"\"재귀함수가 뭔가요?\"\n"+
					underbar+"\"재귀함수는 자기 자신을 호출하는 함수라네\"\n"+
					underbar+"라고 답변하였지.\n");
			return;
		}
		bw.write(underbar+"\"재귀함수가 뭔가요?\"\n"+
				underbar+"\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.\n"+
				underbar+"마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.\n"+
				underbar+"그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"\n");
		line += "____";
		recursion(n-1);
		bw.write(underbar+"라고 답변하였지.\n");
	}

}


