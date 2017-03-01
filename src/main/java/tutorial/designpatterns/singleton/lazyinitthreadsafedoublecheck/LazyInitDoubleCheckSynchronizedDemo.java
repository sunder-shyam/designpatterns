package tutorial.designpatterns.singleton.lazyinitthreadsafedoublecheck;

public class LazyInitDoubleCheckSynchronizedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LazyInitDoubleCheckSynchronized lidcs1=LazyInitDoubleCheckSynchronized.getInstance() ;
		LazyInitDoubleCheckSynchronized lidcs2=LazyInitDoubleCheckSynchronized.getInstance() ;
		System.out.println(lidcs1);
		System.out.println(lidcs2);
		if(lidcs1 == lidcs2) {
			System.out.println("Both are pointing to the same object");
		}

	}

}
