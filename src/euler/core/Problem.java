package euler.core;

public abstract class Problem {

	/**
	 * Wrapping {@link #onRun()} in order to add a time of run. 
	 */
	public void run(){
		long now = System.currentTimeMillis();
		onRun();
		String[] strs = this.getClass().getName().split("\\.");
		System.out.println(strs[strs.length - 1] + " took " + (System.currentTimeMillis() - now) + "ms to run.");
	}
	
	/**
	 * Called when the problem is run. This does not have a return,
	 * therefore you must print your results to analyze them and
	 * test them.
	 */
	protected abstract void onRun();
	
}
