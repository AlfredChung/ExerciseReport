package net.wqn.control;

import java.util.ArrayList;

import net.wqn.domian.Employee;
import net.wqn.tools.In;
import net.wqn.tools.Out;

public class Search {
	public static void search(ArrayList<Employee> e){//以名字为关键字查找某个对象
		Out.printLn("Enter keyword:");
		String input=null;
		Employee emp=null;
		input=In.scan();
		while(input.length()==0){      //名字输入合法性的判断，不能为空
			Out.printLn("No keyword entered – try again…");
			input=In.scan();
		}
		for (int i = 0; i < e.size(); i++) { //根据名字找到对象后输出
			emp=e.get(i);
			if(input.compareToIgnoreCase(emp.getLastName())==0){
				Out.printLn(emp.getNum()+":"+emp.getTelephoneNum()+":"+emp.getFirstName()+":"+emp.getLastName()+":"+emp.getInitial()+":"+emp.getDepartNum()+":"+emp.getJobTitle()+":"+emp.getHiringDate());
				Out.printLn("Press Enter to continue...");
				In.waitEnterkey();
				return;
			}
		}
		Out.printLn("Keyword – "+input+" - not found\nPress Enter to continue...");
		In.waitEnterkey();
	}
}
