package Level23;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n11053 {

	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		int []A=new int[N];
		int []dp=new int[N];
		
		for(int i=0; i<N; i++) {
			A[i]=Integer.parseInt(st.nextToken());
			dp[i]=1;
		}
		
		
		int max=1;
		
		for(int i=1; i<N; i++) {
			for(int j=0; j<i; j++) {
				if(A[i]>A[j] && dp[i]<=dp[j]) {
					dp[i]=dp[j]+1;
				}
			}
			max=Math.max(dp[i], max);
		}
		System.out.println(max);
		
	}

}
