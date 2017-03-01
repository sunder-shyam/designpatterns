package tutorial.designpatterns.singleton.lazyinitthreadsafe;

public class LazyInitThreadSafeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LazyInitThreadSafe lits1=LazyInitThreadSafe.getInstance();
		LazyInitThreadSafe lits2=LazyInitThreadSafe.getInstance();
		System.out.println(lits1);
		System.out.println(lits2);
		if(lits1==lits2) {
			System.out.println("Both are pointing to the same object");
		}

	}

}
