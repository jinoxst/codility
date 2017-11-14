import java.util.*;

class OddOccurrencesInArray {
	public int solution(int[] A) {		
		HashSet<Integer> h = new HashSet<Integer>();
		for(int i=0;i<A.length;i++) {
			if(h.contains(A[i])) {
				h.remove(A[i]);
			}else {
				h.add(A[i]);
			}
		}
		if(h.size() == 1) {
			Iterator<Integer> it = h.iterator();
			return it.next();
		}else {
			return 0;
		}
	}

	public static void main(String[] args) {
		OddOccurrencesInArray s = new OddOccurrencesInArray();
		int[] A = { 9, 3, 9, 3, 9, 7, 9 };
		System.out.println("result:" + s.solution(A));
	}
}
