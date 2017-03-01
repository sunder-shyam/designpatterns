package tutorial.designpatterns.builder;

public class Computer {
	private String HDD;
	private String RAM;
	
	private boolean isBluetoothEnabled;
	private boolean isGraphicsEnabled;
	
	private Computer(ComputerBuilder cb) {
		this.HDD=cb.HDD;
		this.RAM=cb.RAM;
		this.isBluetoothEnabled=cb.isBluetoothEnabled;
		this.isGraphicsEnabled=cb.isGraphicsEnabled;
	}
	
	public String getHDD() {
		return HDD;
	}
	public String getRAM() {
		return RAM;
	}
	public boolean isBluetoothEnabled() {
		return isBluetoothEnabled;
	}
	public boolean isGraphicsEnabled() {
		return isGraphicsEnabled;
	}
	
	public String toString() {
		return(HDD+","+RAM+","+isBluetoothEnabled+","+isGraphicsEnabled);
	}
	
	public static class ComputerBuilder {
		private String HDD;
		private String RAM;
		
		private boolean isBluetoothEnabled;
		private boolean isGraphicsEnabled;
		public ComputerBuilder(String hDD, String rAM) {
			super();
			HDD = hDD;
			RAM = rAM;
		}
		public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
			this.isBluetoothEnabled = isBluetoothEnabled;
			return this;
		}
		public ComputerBuilder setGraphicsEnabled(boolean isGraphicsEnabled) {
			this.isGraphicsEnabled = isGraphicsEnabled;
			return this;
		}
		
		public Computer build() {
			return new Computer(this);
		}
	}

}
