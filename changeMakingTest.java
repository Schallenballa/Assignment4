import static org.junit.Assert.*;

import org.junit.Test;


public class changeMakingTest {

	@Test
	public void testMinCoins2() {
		System.out.println("Test1");
		int[] coins = {25,10,5,1};
	    int amount = 10;
	    changeMaking instance = new changeMaking();
	    List<Integer> expResult = new ArrayList<>();
	    expResult.add(10);
	   List Result= instance.minCoins (coins, amount);
	  assertEquals(expResult, result);
		
	}
	
	@Test
	public void testMinCoin3(){
		System.out.println("Test1");
		int[] coins = {10,5};
	    int amount = 25;
	    changeMaking instance = new changeMaking();
	    List<Integer> expResult = new ArrayList<>();
	    expResult.add(5);
	    expResult.add(10);
	    expResult.add(10);
	   List Result= instance.minCoins (coins, amount);
	  assertEquals(expResult, result);
		
		
	}
	
}
