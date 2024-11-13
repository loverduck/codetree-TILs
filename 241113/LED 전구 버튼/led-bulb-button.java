import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder out = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        long b = Integer.parseInt(st.nextToken());

        int[] lights = new int[n];

        for(int i = 0; i < n; i++) {
            lights[i] = Integer.parseInt(br.readLine());
        }

        for(long i = 0; i < b; i++) {
            int[] newLights = new int[n];
            newLights[0] = lights[n - 1] == 1 ? ( lights[0] == 1 ? 0 : 1) : lights[0];
            for(int j = 1; j < n; j++) {
                newLights[j] = lights[j - 1] == 1 ? ( lights[j] == 1 ? 0 : 1) : lights[j];
            }
            lights = newLights.clone();
        }

        for(int i = 0; i < n; i++) {
            out.append(lights[i]).append("\n");
        }

        System.out.println(out);
    }
}