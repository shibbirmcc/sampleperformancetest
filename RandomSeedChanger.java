import java.util.Random;

public class RandomSeedChanger {
public static void main(String[] args) {
	
	 Integer lowerRange = 0;
	 Integer higherRange = 1000000000;
	
	
	int N = 50;

	int seedCount = (int)(N*.10); // 20%
	long seeds[]   = new long[seedCount];
	for(int i=0; i<seedCount; i++)
		seeds[i] = i;

	Random rand = new Random();

	
	int ranks[] = new int[N];
	for(int i=0; i<N; i++) {
		
		rand.setSeed(System.currentTimeMillis());
		
		// setting a seed
		if(rand.nextBoolean()) {
			System.out.print("Setting a Fixed Seed: ");
			int seedIndex = rand.nextInt(seedCount);
			rand.setSeed(seeds[seedIndex]);
			System.out.println(seeds[seedIndex]);
		}

		ranks[i] = rand.nextInt(higherRange+1);
		System.out.println(ranks[i]);
	}
	
	
	
	Solution s = new Solution();
	long startTime = System.currentTimeMillis();
	int numberOfSoldiersWithSameSuperior = s.solution(ranks);
	long endTime = System.currentTimeMillis();
	System.out.println("TimeTest10      : "+(endTime - startTime)+" milliseconds"+" ; result: "+numberOfSoldiersWithSameSuperior);
}
}
