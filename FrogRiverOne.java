import java.util.HashSet;

class FrogRiverOne {
	public int solution(int X, int[] A) {
		int re = -1;
		int total = 0;
		for(int i=1;i<=X;i++) {
			total += i;
		}
		HashSet<Integer> h = new HashSet<Integer>();
		int sum = 0;
		for(int i=0;i<A.length;i++) {
			if(!h.contains(A[i])) {
				h.add(A[i]);
				sum += A[i];
			}
			
			if(sum == total) {
				re = i;
				break;
			}
		}
		return re;
	}

	public static void main(String[] args) {
		FrogRiverOne o = new FrogRiverOne();
		int[] A = {1,3,1,4,2,3,5,4};
//		int[] A = {1};
		System.out.println("result:" + o.solution(7, A));
	}
}
