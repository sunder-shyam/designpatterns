package tutorial.designpatterns.singleton.staticinnerhelperclass;

public class StaticInnerHelper {
	
	private StaticInnerHelper() {
		
		
	}
	
	public static StaticInnerHelper getInstance() {
		return SingletonHelper.sih; 
	}
	
	private static class SingletonHelper {
		private static final StaticInnerHelper sih= new StaticInnerHelper();
		
	}

}
