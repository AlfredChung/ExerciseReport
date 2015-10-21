package net.wqn.control;

import java.util.ArrayList;

import net.wqn.domian.Employee;
import net.wqn.tools.In;
import net.wqn.tools.Out;

public class Search {
	public static void search(ArrayList<Employee> e){//������Ϊ�ؼ��ֲ���ĳ������
		Out.printLn("Enter keyword:");
		String input=null;
		Employee emp=null;
		input=In.scan();
		while(input.length()==0){      //��������Ϸ��Ե��жϣ�����Ϊ��
			Out.printLn("No keyword entered �C try again��");
			input=In.scan();
		}
		for (int i = 0; i < e.size(); i++) { //���������ҵ���������
			emp=e.get(i);
			if(input.compareToIgnoreCase(emp.getLastName())==0){
				Out.printLn(emp.getNum()+":"+emp.getTelephoneNum()+":"+emp.getFirstName()+":"+emp.getLastName()+":"+emp.getInitial()+":"+emp.getDepartNum()+":"+emp.getJobTitle()+":"+emp.getHiringDate());
				Out.printLn("Press Enter to continue...");
				In.waitEnterkey();
				return;
			}
		}
		Out.printLn("Keyword �C "+input+" - not found\nPress Enter to continue...");
		In.waitEnterkey();
	}
}
