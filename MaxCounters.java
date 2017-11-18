import java.util.*;

class MaxCounters {
	public int[] solution(int N, int[] A) {
		int[] R = new int[N];
		int max = 0;
		int lastMaxCounter = 0;
		int lastMaxIdx = 0;
		HashSet<Integer> h = new HashSet<Integer>();
		
		for(int i=0;i<A.length;i++) {
			if(A[i] >= 1 && A[i] <= N) {
				if(lastMaxCounter > 0) {
					if(!h.contains(A[i] - 1)) {
						h.add(A[i] - 1);
						R[A[i] - 1] = lastMaxCounter + 1;
					}else {
						R[A[i] - 1]++;
					}
				}else {
					R[A[i] - 1]++;
				}
				
				if(max < R[A[i] - 1]) {
					max = R[A[i] - 1];
				}
			}else if(A[i] == N + 1) {
				if(lastMaxCounter < max) {
					lastMaxCounter = max;
				}
				lastMaxIdx = i;
				h.clear();
			}
		}

		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i=(lastMaxIdx+1);i<A.length;i++) {
			arr.add(A[i] - 1);
		}
		if(lastMaxCounter > 0) {
			for(int j=0;j<R.length;j++) {
				R[j] = lastMaxCounter;
			}
			for(int i : arr) {
				R[i] += 1;
			}
		}
		
		return R;
	}
	
	public static void print(int[] A) {
		for(int i=0;i<A.length;i++) {
			System.out.print(A[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		MaxCounters o = new MaxCounters();
		print(o.solution(5, new int[]{ 3, 4, 4, 6, 1, 4, 4 }));//32242
		print(o.solution(5, new int[]{ 1, 2, 1, 1, 6, 6, 3, 6 }));//44444
		print(o.solution(5, new int[]{ 1, 1, 6 ,2, 6, 6, 1, 3, 4}));//43443
		print(o.solution(5, new int[]{ 1, 1, 6 ,2, 6, 6, 1, 3, 4, 6}));//44444
		print(o.solution(5, new int[]{ 1, 1, 2, 6, 3, 4, 5, 5, 5}));//22335
		print(o.solution(5, new int[]{ 1, 1, 2, 6, 3, 4, 5, 5, 5, 6}));//55555
	}
}
