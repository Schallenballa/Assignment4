package ChangeMakingDynamic;

import java.util.*;

/**
 * Authors: Ahmed Naji, Robert Murch and Zach Schallenberger
 * Date 4/22/18
 * Overview: Program addresses the question of finding the minimum
 * number of coins that add up to a given amount of money, including
 * their respective denominations
 * Instructions: This program does not use a driver to run 
 * Instead, it uses a JUnit test class (changeMakingTest.java) in order to drive inputs
 * Please run program by running the changeMakingTest.java test bench
 */

public class changeMaking {

	//Class of type list returns a list of Integers:
	public <Integer> List<Integer> minCoins(int[] coins, int amount){

		//Statement to force exception for empty coins array:
		if(coins.length == 0){

			throw new IllegalArgumentException();
		}

		//Dynamic Algorithm
		List list = new ArrayList();

		//minimum # of coins for amount
		int[] c = new int[amount];

		//last coin used to make amount
		int[] s = new int[amount];

		//runs the loops to populate the arrays
		for (int i = 0; i<amount; i++){
			if (amount == 0){
				c[amount] = 0;
			}
			else{
				c[amount] = (c[amount-coins[i]]+1);
			}
		}

		//adds the coins used to the list
		int i = amount;
		while (s[i] != 0){
			list.add(s[i]);
			amount = amount - s[i];
		}

		return list;
	}
}
