import java.util.HashSet;

class MissingInteger {
	public int solution(int[] A) {
		int re = -1;
		int max = 0;
		HashSet<Integer> h = new HashSet<Integer>();
		for(int i=0;i<A.length;i++) {
			if(max < A[i]) {
				max = A[i];
			}
			if(!h.contains(A[i])) {
				h.add(A[i]);
			}
		}
		
		if(max > 0) {
			boolean flag = false;
			for(int i=1;i<=max;i++) {
				if(!h.contains(i)) {
					re = i;
					flag = true;
					break;
				}
			}
			if(!flag) {
				re = max + 1;
			}
		}else {
			re = 1;
		}
		return re;
	}

	public static void main(String[] args) {
		MissingInteger o = new MissingInteger();
//		int[] A = { 1, 3, 6, 4, 1, 2 };
//		int[] A = { -1, 1, 2, 3 };
		int[] A = { -1, -3 };
//		int[] A = {1};
		System.out.println("result:" + o.solution(A));
	}
}
