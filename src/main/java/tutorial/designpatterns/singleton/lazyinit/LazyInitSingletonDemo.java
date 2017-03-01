package tutorial.designpatterns.singleton.lazyinit;

public class LazyInitSingletonDemo {
	public static void main(String args[]) {
		LazyInitSingleton lis1 = LazyInitSingleton.getInstance();
		LazyInitSingleton lis2 = LazyInitSingleton.getInstance();
		System.out.println(lis1);
		System.out.println(lis2);
		if(lis1 == lis2) {
			System.out.println("Both point to same variable");
		}
		
	}

}
