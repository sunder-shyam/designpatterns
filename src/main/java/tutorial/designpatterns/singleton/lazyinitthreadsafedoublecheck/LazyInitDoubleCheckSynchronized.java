package tutorial.designpatterns.singleton.lazyinitthreadsafedoublecheck;

public class LazyInitDoubleCheckSynchronized {
	
	private static LazyInitDoubleCheckSynchronized lidcs;
	
	private LazyInitDoubleCheckSynchronized() {
		
	}
	
	public static LazyInitDoubleCheckSynchronized getInstance() {
		if(lidcs == null) {
			synchronized(LazyInitDoubleCheckSynchronized.class) {
				if(lidcs == null) {
					lidcs = new LazyInitDoubleCheckSynchronized();
				}
			}
		}
		
		return(lidcs);
	}

}
