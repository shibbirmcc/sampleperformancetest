import static org.junit.Assert.assertTrue;

import java.util.concurrent.ThreadLocalRandom;

import org.junit.Test;

public class Solution3Test {

	private Integer lowerRange = 0;
	private Integer higherRange = 1000000000;

	@Test
	public void TimeTest10() {
		int N = 10;
		int ranks[] = new int[N];
		for(int i=0; i<N; i++) {
			ranks[i] = ThreadLocalRandom.current().nextInt(lowerRange, higherRange+1);
		}
		Solution3 s = new Solution3();
		long startTime = System.currentTimeMillis();
		int numberOfSoldiersWithSameSuperior = s.solution(ranks);
		long endTime = System.currentTimeMillis();
		System.out.println("TimeTest10      : "+(endTime - startTime)+" milliseconds");
		assertTrue(numberOfSoldiersWithSameSuperior >= 0);
	}
	
	@Test
	public void TimeTest50() {
		int N = 50;
		int ranks[] = new int[N];
		for(int i=0; i<N; i++) {
			ranks[i] = ThreadLocalRandom.current().nextInt(lowerRange, higherRange+1);
		}
		Solution3 s = new Solution3();
		long startTime = System.currentTimeMillis();
		int numberOfSoldiersWithSameSuperior = s.solution(ranks);
		long endTime = System.currentTimeMillis();
		System.out.println("TimeTest50      : "+(endTime - startTime)+" milliseconds");
		assertTrue(numberOfSoldiersWithSameSuperior >= 0);
	}
	
	@Test
	public void TimeTest100() {
		int N = 100;
		int ranks[] = new int[N];
		for(int i=0; i<N; i++) {
			ranks[i] = ThreadLocalRandom.current().nextInt(lowerRange, higherRange+1);
		}
		Solution3 s = new Solution3();
		long startTime = System.currentTimeMillis();
		int numberOfSoldiersWithSameSuperior = s.solution(ranks);
		long endTime = System.currentTimeMillis();
		System.out.println("TimeTest100     : "+(endTime - startTime)+" milliseconds");
		assertTrue(numberOfSoldiersWithSameSuperior >= 0);
	}
	
	@Test
	public void TimeTest200() {
		int N = 200;
		int ranks[] = new int[N];
		for(int i=0; i<N; i++) {
			ranks[i] = ThreadLocalRandom.current().nextInt(lowerRange, higherRange+1);
		}
		Solution3 s = new Solution3();
		long startTime = System.currentTimeMillis();
		int numberOfSoldiersWithSameSuperior = s.solution(ranks);
		long endTime = System.currentTimeMillis();
		System.out.println("TimeTest200     : "+(endTime - startTime)+" milliseconds");
		assertTrue(numberOfSoldiersWithSameSuperior >= 0);
	}
	
	
	@Test
	public void TimeTest300() {
		int N = 300;
		int ranks[] = new int[N];
		for(int i=0; i<N; i++) {
			ranks[i] = ThreadLocalRandom.current().nextInt(lowerRange, higherRange+1);
		}
		Solution3 s = new Solution3();
		long startTime = System.currentTimeMillis();
		int numberOfSoldiersWithSameSuperior = s.solution(ranks);
		long endTime = System.currentTimeMillis();
		System.out.println("TimeTest300     : "+(endTime - startTime)+" milliseconds");
		assertTrue(numberOfSoldiersWithSameSuperior >= 0);
	}
	
	@Test
	public void TimeTest400() {
		int N = 400;
		int ranks[] = new int[N];
		for(int i=0; i<N; i++) {
			ranks[i] = ThreadLocalRandom.current().nextInt(lowerRange, higherRange+1);
		}
		Solution3 s = new Solution3();
		long startTime = System.currentTimeMillis();
		int numberOfSoldiersWithSameSuperior = s.solution(ranks);
		long endTime = System.currentTimeMillis();
		System.out.println("TimeTest400     : "+(endTime - startTime)+" milliseconds");
		assertTrue(numberOfSoldiersWithSameSuperior >= 0);
	}
	
	@Test
	public void TimeTest1000() {
		int N = 1000;
		int ranks[] = new int[N];
		for(int i=0; i<N; i++) {
			ranks[i] = ThreadLocalRandom.current().nextInt(lowerRange, higherRange+1);
		}
		Solution3 s = new Solution3();
		long startTime = System.currentTimeMillis();
		int numberOfSoldiersWithSameSuperior = s.solution(ranks);
		long endTime = System.currentTimeMillis();
		System.out.println("TimeTest1000    : "+(endTime - startTime)+" milliseconds");
		assertTrue(numberOfSoldiersWithSameSuperior >= 0);
	}

	@Test
	public void TimeTest5000() {
		int N = 5000;
		int ranks[] = new int[N];
		for(int i=0; i<N; i++) {
			ranks[i] = ThreadLocalRandom.current().nextInt(lowerRange, higherRange+1);
		}
		Solution3 s = new Solution3();
		long startTime = System.currentTimeMillis();
		int numberOfSoldiersWithSameSuperior = s.solution(ranks);
		long endTime = System.currentTimeMillis();
		System.out.println("TimeTest5000    : "+(endTime - startTime)+" milliseconds");
		assertTrue(numberOfSoldiersWithSameSuperior >= 0);
	}
	
	@Test
	public void TimeTest10000() {
		int N = 10000;
		int ranks[] = new int[N];
		for(int i=0; i<N; i++) {
			ranks[i] = ThreadLocalRandom.current().nextInt(lowerRange, higherRange+1);
		}
		Solution3 s = new Solution3();
		long startTime = System.currentTimeMillis();
		int numberOfSoldiersWithSameSuperior = s.solution(ranks);
		long endTime = System.currentTimeMillis();
		System.out.println("TimeTest10000   : "+(endTime - startTime)+" milliseconds");
		assertTrue(numberOfSoldiersWithSameSuperior >= 0);
	}
	
	@Test
	public void TimeTest50000() {
		int N = 50000;
		int ranks[] = new int[N];
		for(int i=0; i<N; i++) {
			ranks[i] = ThreadLocalRandom.current().nextInt(lowerRange, higherRange+1);
		}
		Solution3 s = new Solution3();
		long startTime = System.currentTimeMillis();
		int numberOfSoldiersWithSameSuperior = s.solution(ranks);
		long endTime = System.currentTimeMillis();
		System.out.println("TimeTest50000   : "+(endTime - startTime)+" milliseconds");
		assertTrue(numberOfSoldiersWithSameSuperior >= 0);
	}
	
	@Test
	public void TimeTest100000() {
		int N = 100000;
		int ranks[] = new int[N];
		for(int i=0; i<N; i++) {
			ranks[i] = ThreadLocalRandom.current().nextInt(lowerRange, higherRange+1);
		}
		Solution3 s = new Solution3();
		long startTime = System.currentTimeMillis();
		int numberOfSoldiersWithSameSuperior = s.solution(ranks);
		long endTime = System.currentTimeMillis();
		System.out.println("TimeTest100000  : "+(endTime - startTime)+" milliseconds");
		assertTrue(numberOfSoldiersWithSameSuperior >= 0);
	}
}
