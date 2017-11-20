class CountDiv {
	public int solution(int A, int B, int K) {
		int A1 = A - 1;
		if(A1 > 0) {
			A1 = A1 / K;
		}
		int A2 = B / K;

		return A2 - A1;
	}

	public static void main(String[] args) {
		long l1 = System.currentTimeMillis();
		CountDiv o = new CountDiv();
		System.out.println(o.solution(100,2000000000,2));//999999951
		System.out.println(o.solution(11, 345, 17));//20
		System.out.println(o.solution(0, 1, 17));//1
		long l2 = System.currentTimeMillis();
		System.out.println((l2-l1) / 1000 + " sec");
	}
}
