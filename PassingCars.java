import java.util.HashSet;

class PassingCars {
	public int solution(int[] A) {
		int R = 0;
		HashSet<Integer> h = new HashSet<Integer>();
		for(int i=0;i<A.length;i++) {
			if(A[i] == 0) {
				h.add(i);
			}else {
				R += h.size();
			}
			if(R > 1000000000) {
				R = -1;
				break;
			}
		}
		
		return R;
	}

	public static void main(String[] args) {
		long l1 = System.currentTimeMillis();
		PassingCars o = new PassingCars();
		System.out.println(o.solution(new int[] {0, 1, 0, 1, 1}));// 
		long l2 = System.currentTimeMillis();
		System.out.println((l2 - l1) / 1000 + " sec");
	}
}
