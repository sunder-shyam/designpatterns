package tutorial.designpatterns.singleton.eagerstaticblock;

public class EagerInitStaticBlockSingletonDemo {
	public static void main(String args[]) {
		EagerInitStaticBlockSingleton eibs1=EagerInitStaticBlockSingleton.getInstance();
		EagerInitStaticBlockSingleton eibs2=EagerInitStaticBlockSingleton.getInstance();
		System.out.println(eibs1);
		System.out.println(eibs2);
		if(eibs1 == eibs2) {
			System.out.println("Both point to same object");
		}
		
	}

}
