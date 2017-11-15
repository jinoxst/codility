class FrogJmp {
	public int solution(int X, int Y, int D) {
		int re = 0;
		if(X < Y) {
			double d = (double)(Y - X) / D;
			re = (int)Math.ceil(d);
		}
		return re;
	}

	public static void main(String[] args) {
		FrogJmp o = new FrogJmp();
		System.out.println("result:" + o.solution(10, 85, 30));
		System.out.println("result:" + o.solution(1, 1, 30));
		System.out.println("result:" + o.solution(1, 1000000000, 1));
	}
}
