package euler.problems;

import euler.core.Problem;

public class Problem1 extends Problem {

	//Example class to show how problems can be solved
	
	@Override
	public void onRun() {
		//Sum of all the divisible numbers
		int sum = 0;
		//Looping through all numbers from 1 to 999
		for(int i = 1; i < 1000; i++){
			//Checking if the number is
			//either divisible by 3 or 5
			if(i % 3 == 0 || i % 5 == 0){
				//If true, add the number to sum
				sum += i;
			}
		}
		//Print the sum when done
		System.out.println(sum);
	}
	
}
