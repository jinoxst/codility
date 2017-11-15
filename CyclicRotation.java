class CyclicRotation {
	public int[] solution(int[] A, int K) {
		for(int i=0;i<K;i++) {
			if(A.length > 0) {
				int ref = A[A.length-1];
				for(int j=0;j<A.length;j++) {
					int tmp = A[j];
					A[j] = ref;
					ref = tmp;
				}
			}
		}
		return A;
	}
	
	public static void print(int[] A) {
		for(int i=0;i<A.length;i++) {
			System.out.println(i + ":" + A[i]);
		}
	}
	public static void main(String[] args) {
		CyclicRotation o = new CyclicRotation();
//		int[] A = {3, 8, 9, 7, 6};
		int[] A = {};
		int[] B = o.solution(A, 3);
		print(B);
	}
}
