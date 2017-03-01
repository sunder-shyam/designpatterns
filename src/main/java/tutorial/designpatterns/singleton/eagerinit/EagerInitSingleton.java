package tutorial.designpatterns.singleton.eagerinit;

public class EagerInitSingleton {
	public static EagerInitSingleton eis=new EagerInitSingleton();
	private EagerInitSingleton() {
		
	}
	
	public static EagerInitSingleton getInstance() {
		return eis;
	}

}
