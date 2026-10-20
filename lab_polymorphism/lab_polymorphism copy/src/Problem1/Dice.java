package Problem1;

import java.util.Random;
public class Dice
extends Random
{
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
public Dice() {
       super();
   }
   @Override
   public int nextInt(int num) {
       // Calculating for the 50% each case
       int number = super.nextInt(2);
       // If zero means we need to return num -1(max)
       if(number==0) {
           return num-1;
       }
       // Otherwise normal one
       else {
           return super.nextInt(num);
       }
   }
   public static void printDiceRolls(Random randGenerator) {
       for(int i = 0;i<100;i++) {
           System.out.println(randGenerator.nextInt(6) + 1);
       }
   }
   public static void main(String args[]) {
       Random randGenerator = new Dice();
       printDiceRolls(randGenerator);
   }

}