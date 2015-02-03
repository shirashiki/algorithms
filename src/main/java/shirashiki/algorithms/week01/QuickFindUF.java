package shirashiki.algorithms.week01;

public class QuickFindUF {
	private int[] id;
	
	public QuickFindUF(int N) {
		
		// set id of each object to itself
		id = new int[N];
		for (int i = 0; i < N; i++){
			id[i] = i;
		}
	}
	
	/**
	 * Check whether and q are in the same component
	 * (2 array accesses)
	 * @param p
	 * @param q
	 * @return
	 */
	public boolean connected (int p, int q) {
	
		return id[p] == id[q];
	}
	
	/**
	 * Changes all entries with id[p] to id[q]
	 * @param p
	 * @param q
	 */
	public void union(int p, int q) {
	
		int pid = id[p];
		int qid = id[q];
		
		for (int i=0; i < id.length; i++)
			if (id[i] == pid) id[i] = qid;
		
	}

}
