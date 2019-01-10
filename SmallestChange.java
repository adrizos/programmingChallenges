import java.util.*;

public class SmallestChange {

  public static long count = 0;
  public static void main (String[] args){


    int[] coins = {25,10,5,1}; //reverse order will go quicker
    int x = 70;

    System.out.println("min number of coins is: " + change(x, coins));
    System.out.println("number of recursive calls: " + count); //over 3 billion recursive calls at x = 70...


  }

  public static int change(int x, int[] coins){
    count++;
    if (x == 0) return 0; //no more change needed (base case)
    int min = x; // maximum number of coins can't be bigger than x

    for (int coin : coins){
      if (x-coin >= 0) { //skip if subtraction would cause value to be negative (too much change taken out)
        int c = change(x - coin, coins);
        if (min > c + 1) min = c + 1;
      }
    }
    return min;

  }
}
