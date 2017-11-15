import java.util.*;

class PermMissingElem {
	public int solution(int[] A) {
        int re = 0;
        HashSet<Integer> h = new HashSet<Integer>();
        for(int i=0;i<A.length;i++) {
        		h.add(A[i]);
        }
        for(int i=1;i<=A.length+1;i++) {
        		if(h.contains(i)) {
        			h.remove(i);
        		}else {
        			re = i;
        			break;
        		}
        }
        return re;
    }
	
	public static void main(String[] args) {
		PermMissingElem o = new PermMissingElem();
//		int[] A = {2,3,1,5};
		int[] A = {2,1};
		System.out.println("result:" + o.solution(A));
	}
}
