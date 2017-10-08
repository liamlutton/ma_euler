package euler.problems;

import euler.core.Problem;

public class Problem30 extends Problem {

	//While this solution does work, it is
	//very inefficient. There is likely a
	//more appropriate way to handle this
	//problem. This solution also assumes
	//that the greatest solution occurs
	//under 1000000, which may be a
	//dangerous assumption (it was not
	//in this case, but it is bad practice)
	
	@Override
	protected void onRun() {
		long total = 0;
		outer: for(int i = 2; i < 200000; i++){
			String str = i + "";
			int sum = 0;
			for(int l = 0; l < str.length(); l++){
				sum += Math.pow(Integer.parseInt(str.charAt(l) + ""), 5);
				if(sum > i){
					continue outer;
				}
			}
			if(sum == i){
				total += i;
			}
		}
		System.out.println(total);
	}

}
