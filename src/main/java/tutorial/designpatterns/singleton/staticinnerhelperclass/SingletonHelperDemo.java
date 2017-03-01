package tutorial.designpatterns.singleton.staticinnerhelperclass;

public class SingletonHelperDemo {

	public static void main(String[] args) {
		StaticInnerHelper sih1=StaticInnerHelper.getInstance();
		StaticInnerHelper sih2=StaticInnerHelper.getInstance();
		System.out.println(sih1);
		System.out.println(sih2);
		if(sih1==sih2) {
			System.out.println("Both point to same object");
		}

	}

}
