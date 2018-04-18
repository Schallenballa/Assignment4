package ChangeMakingDynamic;

import java.util.*;

/**
 * Authors: Ahmed Naji, Robert Murch and Zach Schallenberger
 * Date 4/x/18
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
        
        //Statement to force expception for empty coins array:
        if(coins.length == 0){
            
            throw new IllegalArgumentException();
        }
        
        //Implement the dynamic alrgorithm here. The following link is for a great
        //YouTube tutorial on how to go about it. Be sure to watch all the way to the end
        //because it shows how to go about addressing the denominations. The way I figure,
        //you could follow his examples exactly and use two arrays and then
        //transfer the values from s[p] array into list or even better just start with two lists.
        //either way should work.
        //Here is the link: https://www.youtube.com/watch?v=rdI94aW6IWw
        
        List list = new ArrayList();
        
        return list;
    }
}
