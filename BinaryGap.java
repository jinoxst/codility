class BinaryGap {

	public int solution(int A) {
		int max = 0;
		int cnt = 0;
		String s = Integer.toBinaryString(A);

		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == '1' && s.charAt(i + 1) == '0') {
				cnt = 0;
				boolean flag = false;
				for (int j = i + 1; j < s.length() - 1; j++) {
					if (s.charAt(j) == '0') {
						cnt++;
						if (s.charAt(j + 1) == '1') {
							i = j;
							flag = true;
							break;
						}
					}
				}
				if (flag && max < cnt) {
					max = cnt;
				}
				cnt = 0;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		BinaryGap s = new BinaryGap();
		System.out.println("result:" + s.solution(1041));
	}
}
