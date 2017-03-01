package tutorial.designpatterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class EmployeePrototype implements Cloneable {
	private List<String> emplist;
	
	public EmployeePrototype(List<String> ls) {
		emplist=ls;
	}
	
	public EmployeePrototype() {
		emplist=new ArrayList<String> ();
	}
	
	public void loadData() {
		emplist.add("pankaj");
		emplist.add("raj");
		emplist.add("david");
		emplist.add("lisa");
	}
	
	public List<String> getEmplist() {
		return this.emplist;
	}
	
	public Object clone() throws CloneNotSupportedException {
		List<String> temp = new ArrayList<String>();
		for(String s:this.getEmplist()) {
			temp.add(s);
			
		}
		return new EmployeePrototype(temp);
	}

}
