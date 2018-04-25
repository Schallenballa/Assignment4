/*
 * JUnit 4.x test bench for changeMaking.java. This bench contains x tests. The first of which will test the exception
 * statement (lines 19-22).
 * 
 * Authors: Ahmed Naji, Robert Murch and Zach Schallenberger
 * Date: 4/24/18 
 */
package ChangeMakingDynamic;

import java.util.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class changeMakingTest {
    
    public changeMakingTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of minCoins method, of class changeMaking.
     */
    
    @Test(expected = IllegalArgumentException.class)
    public void testMinCoinsIllegalException() {
        System.out.println("Test if IllegalArgumentException is thrown properly.");
        int[] coins = {};
        int amount = 10;
        changeMaking instance = new changeMaking();
        List<Integer> expResult = new ArrayList<>();
        expResult.add(10);
        List result = instance.minCoins(coins, amount);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testMinCoins1() {
        System.out.println("Test 1");
        int[] coins = {25,10,5,1};
        int amount = 50;
        changeMaking instance = new changeMaking();
        List<Integer> expResult = new ArrayList<>();
        expResult.add(25);
        expResult.add(25);
        List result = instance.minCoins(coins, amount);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testMinCoins2() {
        System.out.println("Test 2");
        int[] coins = {25,10,5,1};
        int amount = 10;
        changeMaking instance = new changeMaking();
        List<Integer> expResult = new ArrayList<>();
        expResult.add(10);
        List result = instance.minCoins(coins, amount);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testMinCoins3() {
        System.out.println("Test 3");
        int[] coins = {10,5};
        int amount = 25;
        changeMaking instance = new changeMaking();
        List<Integer> expResult = new ArrayList<>();
        expResult.add(5);
        expResult.add(10);
        expResult.add(10);
        List result = instance.minCoins(coins, amount);
        assertEquals(expResult, result);
    }
    
    
}
