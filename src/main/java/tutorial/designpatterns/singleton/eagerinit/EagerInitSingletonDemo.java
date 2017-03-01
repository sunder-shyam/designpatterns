package tutorial.designpatterns.singleton.eagerinit;

public class EagerInitSingletonDemo {
	public static void main(String args[]) {
		EagerInitSingleton eis1=EagerInitSingleton.getInstance();
		System.out.println(eis1);
		
		EagerInitSingleton eis2=EagerInitSingleton.getInstance();
		System.out.println(eis2);
		
		if(eis1 == eis2) {
			System.out.println("Both point to same object");
		}
	}

}
