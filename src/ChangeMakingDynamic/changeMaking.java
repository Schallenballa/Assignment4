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
                
                //Keeping track of lenght so I dont have to keep calling it.
                int x = coins.length;

		//Statement to force exception for empty coins array:
		if(coins.length == 0){

			throw new IllegalArgumentException();
		}

		//List for storing coins.
		List list = new ArrayList();

		//minimum # of coins for amount
		int[] cP = new int[amount + 1];

		//last coin used to make amount
		int[] sP = new int[amount + 1];
                
                //Set the first position in c to 1 to start
                cP[0] =1;
                
                //Dynamically find values by keeping track of preveious positions:
                for(int i = 0; i < amount; i++){
                    
                    //must be
                    if(cP[i] > 0)
                        
                        //loop through coins array
                        for(int j = 0; j < x; j++){
                            
                            int y;
                            y = i + coins[j];
                            
                            if(y <= amount && (cP[y] == 0 || cP[y] > cP[i]+1)){
                                
                                cP[y] = cP[i] +1;
                                sP[y] = j;
                            }
                        }
                }
                
                //Useing an array because I did this on paper with an array
                //simply convert it to the list after
                int[] result = new int[cP[amount] - 1];
                
                int newAmount = amount;
                
                while(newAmount>0){
                    
                    result[cP[newAmount] -2] = coins[sP[newAmount]];
                    
                    newAmount = newAmount - coins[sP[newAmount]];
                }

		for(int i : result){
                    
                    list.add(i);
                }

		return list;
	}
}
