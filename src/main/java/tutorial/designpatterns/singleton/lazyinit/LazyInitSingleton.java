package tutorial.designpatterns.singleton.lazyinit;

public class LazyInitSingleton {
	private static LazyInitSingleton lis;
	private LazyInitSingleton() {
		
	}
	
	public static LazyInitSingleton getInstance() {
		if(lis==null) {
			lis = new LazyInitSingleton();
		}
		return(lis);
	}

}
