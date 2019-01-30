import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
	
	public HashMap<Integer, Superior> getSuperiorMap(List<Integer> rankList){
		HashMap<Integer, Superior> superiorRankMap = new HashMap<Integer, Superior>();

        for(int i=0; i<rankList.size(); i++) {
        	Integer superiorRank = rankList.get(i) + 1;

        	if(rankList.contains(superiorRank)) {
            	if(superiorRankMap.containsKey(superiorRank)) {
            		superiorRankMap.get(superiorRank).numberOfSoldiersReporting++;
            	}else {
            		Superior superior = new Superior();
            		superior.rank     = superiorRank;
            		superior.numberOfSoldiersReporting = 1;
            		superiorRankMap.put(superiorRank, superior);
            	}
        	}
        }
		
		return superiorRankMap;
	}
	
	
	
    public int solution(int[] ranks) {
        
    	if(ranks.length == 0)
    		return 0;
    	
        int numberOfSoldiersWithSameSuperior = 0;
        
        List<Integer> rankList = new ArrayList<Integer>();
        for(int i=0; i<ranks.length; i++) {
        	rankList.add(ranks[i]);
        }
        HashMap<Integer, Superior> superiorRankMap = getSuperiorMap(rankList);
        
        for (Integer key: superiorRankMap.keySet()){
        	numberOfSoldiersWithSameSuperior += superiorRankMap.get(key).numberOfSoldiersReporting;
        } 	
        

        
        return numberOfSoldiersWithSameSuperior;
    }
    
}
