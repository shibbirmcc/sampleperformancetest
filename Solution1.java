import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution1 {

	public HashMap<Integer, Superior> getSuperiorMap(int[] ranks){
		HashMap<Integer, Superior> superiorRankMap = new HashMap<Integer, Superior>();

		Integer max = 0;
		
        for(int i=0; i<ranks.length; i++) {
        	Integer superiorRank = ranks[i] + 1;

            	if(superiorRankMap.containsKey(superiorRank)) {
            		superiorRankMap.get(superiorRank).numberOfSoldiersReporting++;
            	}else {
            		Superior superior = new Superior();
            		superior.rank     = superiorRank;
            		superior.numberOfSoldiersReporting = 1;
            		superiorRankMap.put(superiorRank, superior);
            	}
        }
		
		return superiorRankMap;
	}
	
	
	
    public int solution(int[] ranks) {
        
    	if(ranks.length == 0)
    		return 0;
    	
        int numberOfSoldiersWithSameSuperior = 0;
        
        List<Integer> uniqueRankList = new ArrayList<Integer>();
        for(int i=0; i<ranks.length; i++) {
        	if(!uniqueRankList.contains(ranks[i]))
        		uniqueRankList.add(ranks[i]);
        }
        HashMap<Integer, Superior> superiorRankMap = getSuperiorMap(ranks);
        
        for (Integer key: superiorRankMap.keySet()){
        	if(uniqueRankList.contains(key))
        		numberOfSoldiersWithSameSuperior += superiorRankMap.get(key).numberOfSoldiersReporting;
        }
        return numberOfSoldiersWithSameSuperior;
    }
}
