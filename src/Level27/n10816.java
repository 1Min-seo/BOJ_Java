package Level27;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class n10816 {
	public static int lowerBound(int []my, int target) {
		int lo=0;
		int hi=my.length;
		while(lo<hi) {
			int mid=(lo+hi)/2;
			if(target<=my[mid]) {
				hi=mid;
			}else {
				lo=mid+1;
			}
		}
		return lo;
	}
	
	public static int upperBound(int []my, int target) {
		int lo=0;
		int hi=my.length;
		while(lo<hi) {
			int mid=(lo+hi)/2;
			if(target<my[mid]) {
				hi=mid;
			}else {
				lo=mid+1;
			}
		}
		return lo;
	}
	
	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		int []my=new int[N];
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			my[i]=Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(my);
		
		int M=Integer.parseInt(br.readLine());
		st=new StringTokenizer(br.readLine());
		int []arr=new int[M];
			
		for(int i=0; i<M; i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		StringBuilder sb=new StringBuilder();
		
		for(int i=0; i<M; i++) {
			sb.append(upperBound(my,arr[i])-lowerBound(my,arr[i])).append(' ');
		}
		
		System.out.println(sb);
	}
	

}
