import java.util.HashSet;

class PermCheck {
	public int solution(int[] A) {
		int re = 0;
		int max = A[0];
		HashSet<Integer> h = new HashSet<Integer>();
		for(int i=0;i<A.length;i++) {
			h.add(A[i]);
			if(max < A[i]) {
				max = A[i];
			}
		}
		if(h.size() == A.length) {
			for(int i=1;i<=max;i++) {
				if(h.contains(i)) {
					h.remove(i);
				}else{
					break;
				}
			}
			if(h.size() == 0) {
				re = 1;
			}
		}
		
		return re;
	}

	public static void main(String[] args) {
		PermCheck o = new PermCheck();
//		int[] A = {4,1,3,2};
		int[] A = {1,1};
		System.out.println("result:" + o.solution(A));
	}
}
