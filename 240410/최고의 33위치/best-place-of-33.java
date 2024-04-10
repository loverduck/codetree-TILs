import java.io.*;
import java.util.*;

public class Main {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static StringBuilder out = new StringBuilder();
	
	static int n;
	static int[][] map;
	
	public static void main(String[] args) throws IOException {
		n = Integer.parseInt(br.readLine());
		
		map = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int result = 0;
		for(int i = 0; i < n - 2; i++) {
			for(int j = 0; j < n - 2; j++) {
				result = Math.max(result, findCoin(i, j));
			}
		}
		System.out.println(result);
	}
	
	static int findCoin(int x, int y) {
		int coin = 0;
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if (map[x + i][y + j] == 1) coin++;
			}
		}
		return coin;
	}
}