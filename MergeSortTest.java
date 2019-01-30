import static org.junit.Assert.*;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import org.junit.Test;

public class MergeSortTest {
	private Integer lowerRange = 0;
	private Integer higherRange = 1000000000;

	@Test
	public void TimeTest10() {
		int N = 10;

		int seedCount = (int)(N*.20); // 20%
		long seeds[]   = new long[seedCount];
		for(int i=0; i<seedCount; i++)
			seeds[i] = i;

		Random rand = new Random();

		
		int ranks[] = new int[N];
		for(int i=0; i<N; i++) {
			// setting a seed
			int seedIndex = rand.nextInt(seedCount);
			rand.setSeed(seeds[seedIndex]);

			ranks[i] = rand.nextInt(higherRange+1);
			
//			ranks[i] = ThreadLocalRandom.current().nextInt(lowerRange, higherRange+1);
		}

		long startTime = System.currentTimeMillis();
		MergeSort m = new MergeSort();
		m.sort(ranks, 0, N-1);
		long endTime = System.currentTimeMillis();
		System.out.println("TimeTest10      : "+(endTime - startTime)+" milliseconds");
	}
	
	@Test
	public void TimeTest50() {
		int N = 50;
		int ranks[] = new int[N];
		for(int i=0; i<N; i++) {
			ranks[i] = ThreadLocalRandom.current().nextInt(lowerRange, higherRange+1);
		}
		long startTime = System.currentTimeMillis();
		MergeSort m = new MergeSort();
		m.sort(ranks, 0, N-1);
		long endTime = System.currentTimeMillis();
		System.out.println("TimeTest50      : "+(endTime - startTime)+" milliseconds");
	}
	
	@Test
	public void TimeTest100() {
		int N = 100;
		int ranks[] = new int[N];
		for(int i=0; i<N; i++) {
			ranks[i] = ThreadLocalRandom.current().nextInt(lowerRange, higherRange+1);
		}
		long startTime = System.currentTimeMillis();
		MergeSort m = new MergeSort();
		m.sort(ranks, 0, N-1);
		long endTime = System.currentTimeMillis();
		System.out.println("TimeTest100     : "+(endTime - startTime)+" milliseconds");
	}
	
	@Test
	public void TimeTest200() {
		int N = 200;
		int ranks[] = new int[N];
		for(int i=0; i<N; i++) {
			ranks[i] = ThreadLocalRandom.current().nextInt(lowerRange, higherRange+1);
		}
		long startTime = System.currentTimeMillis();
		MergeSort m = new MergeSort();
		m.sort(ranks, 0, N-1);
		long endTime = System.currentTimeMillis();
		System.out.println("TimeTest200     : "+(endTime - startTime)+" milliseconds");
	}
	
	
	@Test
	public void TimeTest300() {
		int N = 300;
		int ranks[] = new int[N];
		for(int i=0; i<N; i++) {
			ranks[i] = ThreadLocalRandom.current().nextInt(lowerRange, higherRange+1);
		}
		long startTime = System.currentTimeMillis();
		MergeSort m = new MergeSort();
		m.sort(ranks, 0, N-1);
		long endTime = System.currentTimeMillis();
		System.out.println("TimeTest300     : "+(endTime - startTime)+" milliseconds");
	}
	
	@Test
	public void TimeTest400() {
		int N = 400;
		int ranks[] = new int[N];
		for(int i=0; i<N; i++) {
			ranks[i] = ThreadLocalRandom.current().nextInt(lowerRange, higherRange+1);
		}
		long startTime = System.currentTimeMillis();
		MergeSort m = new MergeSort();
		m.sort(ranks, 0, N-1);
		long endTime = System.currentTimeMillis();
		System.out.println("TimeTest400     : "+(endTime - startTime)+" milliseconds");
	}
	
	@Test
	public void TimeTest1000() {
		int N = 1000;
		int ranks[] = new int[N];
		for(int i=0; i<N; i++) {
			ranks[i] = ThreadLocalRandom.current().nextInt(lowerRange, higherRange+1);
		}
		long startTime = System.currentTimeMillis();
		MergeSort m = new MergeSort();
		m.sort(ranks, 0, N-1);
		long endTime = System.currentTimeMillis();
		System.out.println("TimeTest1000    : "+(endTime - startTime)+" milliseconds");
	}

	@Test
	public void TimeTest5000() {
		int N = 5000;
		int ranks[] = new int[N];
		for(int i=0; i<N; i++) {
			ranks[i] = ThreadLocalRandom.current().nextInt(lowerRange, higherRange+1);
		}
		long startTime = System.currentTimeMillis();
		MergeSort m = new MergeSort();
		m.sort(ranks, 0, N-1);
		long endTime = System.currentTimeMillis();
		System.out.println("TimeTest5000    : "+(endTime - startTime)+" milliseconds");
	}
	
	@Test
	public void TimeTest10000() {
		int N = 10000;
		int ranks[] = new int[N];
		for(int i=0; i<N; i++) {
			ranks[i] = ThreadLocalRandom.current().nextInt(lowerRange, higherRange+1);
		}
		long startTime = System.currentTimeMillis();
		MergeSort m = new MergeSort();
		m.sort(ranks, 0, N-1);
		long endTime = System.currentTimeMillis();
		System.out.println("TimeTest10000   : "+(endTime - startTime)+" milliseconds");
	}
	
	@Test
	public void TimeTest50000() {
		int N = 50000;
		int ranks[] = new int[N];
		for(int i=0; i<N; i++) {
			ranks[i] = ThreadLocalRandom.current().nextInt(lowerRange, higherRange+1);
		}
		long startTime = System.currentTimeMillis();
		MergeSort m = new MergeSort();
		m.sort(ranks, 0, N-1);
		long endTime = System.currentTimeMillis();
		System.out.println("TimeTest50000   : "+(endTime - startTime)+" milliseconds");
	}
	
	@Test
	public void TimeTest100000() {
		int N = 100000;
		int ranks[] = new int[N];
		for(int i=0; i<N; i++) {
			ranks[i] = ThreadLocalRandom.current().nextInt(lowerRange, higherRange+1);
		}
		
		long startTime = System.currentTimeMillis();
		MergeSort m = new MergeSort();
		m.sort(ranks, 0, N-1);
		long endTime = System.currentTimeMillis();
		System.out.println("TimeTest100000  : "+(endTime - startTime)+" milliseconds ");
	}
}
