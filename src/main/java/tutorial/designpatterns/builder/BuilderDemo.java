package tutorial.designpatterns.builder;

public class BuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Computer c=new Computer.ComputerBuilder("500GB","4GB").setBluetoothEnabled(true).setGraphicsEnabled(false).build();
		System.out.println(c);

	}

}
