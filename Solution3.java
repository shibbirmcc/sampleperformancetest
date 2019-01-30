public class Solution3 {
	
    public int solution(int[] ranks) {
        
    	if(ranks.length == 0)
    		return 0;
    	
        int numberOfSoldiersWithSameSuperior = 0;
        
        QuickSort q = new QuickSort();
        q.sort(ranks, 0, ranks.length-1);
        Integer max = ranks[ranks.length-1];
        
        Integer previousRank = -1;
        Integer previousRankCount = 0;
        
        for(int i=0; i<ranks.length; i++) {
        	Integer currentRank = ranks[i];

        	// Nothing to be done for First Eelement
        	if(i == 0) {
        		previousRank = currentRank;
        		previousRankCount++;
        	}else if(currentRank != previousRank) {
        		// Rank has been changed
        		
        		// Check if this current Rank is a superior for the previous Rank.
        		if(currentRank == previousRank+1) { // superior Exists
        			// If  current Rank is a superior of the previous rank then add to the totalNumber
        			numberOfSoldiersWithSameSuperior += previousRankCount;
        		}
        		// Change the previousRank to CurrentRank
        		previousRank = currentRank;
        		// Set the previous Rank count to 1
        		previousRankCount = 1;
        	}else {
        		previousRankCount++;
        	}
        }
        return numberOfSoldiersWithSameSuperior;
    }
}
