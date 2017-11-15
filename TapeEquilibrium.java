class TapeEquilibrium {
	public int solution(int[] A) {
        int re = 0;
        int p1 = 0;
        int p2 = 0;
        for(int i=0;i<A.length;i++) {
        		p2 += A[i];
        }
        for(int i=0;i<A.length-1;i++) {
	    		p1 += A[i];
	    		p2 -= A[i];
	    		int tmp = Math.abs(p1 - p2);
	    		if(i == 0) {
	    			re = tmp;
	    		}else {
	    			if(tmp < re) {
		    			re = tmp;
		    		}
	    		}
	    }
        return re;
    }
	
	public static void main(String[] args) {
		TapeEquilibrium o = new TapeEquilibrium();
//		int[] A = {3,1,2,4,3};
		int[] A = {-1,2};
		System.out.println("result:" + o.solution(A));
	}
}
