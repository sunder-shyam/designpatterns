package tutorial.designpatterns.singleton.lazyinitthreadsafe;

public class LazyInitThreadSafe {
	private static LazyInitThreadSafe lits;
	
	private LazyInitThreadSafe() {
		
	}
	
	public synchronized static LazyInitThreadSafe getInstance() {
		if(lits == null ) {
			lits = new LazyInitThreadSafe();
		}
		
		return(lits);
	}

}
