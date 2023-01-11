package Level4;
import java.util.*;
import java.io.*;

public class n1546 {

	public static void main(String[] args) {
        FastReader fr = new FastReader(); // 문제 해결 소스 코드
        int N=fr.nextInt();
        ArrayList<Double> score=new ArrayList<Double>();
        
        for(int i=0; i<N; i++) {
        	score.add(fr.nextDouble());
        }
        
        Double M= Collections.max(score);
        double sum=0;
        for(int i=0; i<N; i++) {
        	sum+=(score.get(i)/M)*100;
        }
        
        System.out.print(sum/N);
    }


    public static class FastReader {
        BufferedReader br;
        StringTokenizer st;
        public FastReader() { br = new BufferedReader(new InputStreamReader(System.in)); }
        public FastReader(String s) throws FileNotFoundException { br = new BufferedReader(new FileReader(new File(s))); }
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try { st = new StringTokenizer(br.readLine()); }
                catch (IOException e) { e.printStackTrace(); }
            }
            return st.nextToken();
        }
        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
        double nextDouble() { return Double.parseDouble(next()); }
        String nextLine() {
            String str = "";
            try { str = br.readLine(); }
            catch (IOException e) { e.printStackTrace(); }
            return str;
        }
    }
}


