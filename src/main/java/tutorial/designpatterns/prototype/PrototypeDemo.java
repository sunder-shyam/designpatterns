package tutorial.designpatterns.prototype;

import java.util.List;

public class PrototypeDemo {
	public static void main(String args[]) throws CloneNotSupportedException {
		EmployeePrototype ep=new EmployeePrototype();
		ep.loadData();
		
		EmployeePrototype ep1 = (EmployeePrototype) ep.clone();
		List<String> l1=ep1.getEmplist();
		l1.add("john");
		EmployeePrototype ep2 = (EmployeePrototype) ep.clone();
		List<String> l2=ep2.getEmplist();
		l2.remove("pankaj");

		System.out.println(ep.getEmplist());
		System.out.println(l1);
		System.out.println(l2);
	}

}
