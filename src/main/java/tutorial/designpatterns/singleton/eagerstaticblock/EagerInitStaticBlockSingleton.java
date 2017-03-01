package tutorial.designpatterns.singleton.eagerstaticblock;

public class EagerInitStaticBlockSingleton {
	
	private static EagerInitStaticBlockSingleton eibs;
	static {
		eibs =new EagerInitStaticBlockSingleton();
		
	}
	
	private EagerInitStaticBlockSingleton() {
		
	}
	
	public static EagerInitStaticBlockSingleton getInstance() {
		return(eibs);
	}

}
