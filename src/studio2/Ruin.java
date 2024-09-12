package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What is your starting amount of money?");
		int startAmount = in.nextInt();
		System.out.println("What is the probability that you win in a single play?");
		double winChance = in.nextDouble();
		System.out.println("What amount of money would you be happy leaving with?");
		int winLimit = in.nextInt();
		//
		while (startAmount< winLimit && startAmount>0) {
			if (Math.random()>winChance) {
				startAmount--;
			}
			else {
				startAmount++;
			}
		
		}
		if (startAmount==winLimit)  {
			System.out.println("You win!");
		}
		else
			System.out.println("You lose!");
		}
	}


