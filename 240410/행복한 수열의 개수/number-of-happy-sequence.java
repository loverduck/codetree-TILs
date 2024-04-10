import java.io.*;
import java.util.*;

public class Main {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static StringBuilder out = new StringBuilder();
	
	static int n, m;
	static int[][] map;
	
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		map = new int[n][n];
		int result = 0;
		
		int preNum = 0;
		int count = 1;
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			preNum = 0;
			count = 1;
			for(int j = 0; j < n; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				if(preNum == map[i][j]) count++;
				else {
					preNum = map[i][j];
					count = 1;
				}
			}
			
			if(count >= m) result++;
		}
		
		
		for(int i = 0; i < n; i++) {
			preNum = 0;
			count = 1;
			for(int j = 0; j < n; j++) {
				if(preNum == map[j][i]) {
					count++;
					
				}
				else {
					preNum = map[j][i];
					count = 1;
				}
				if(count >= m) {
					result++;
					break;
				};
			}
			
			
		}
		System.out.println(result);
	}

}