package net.wqn.view;

import java.util.ArrayList;

import net.wqn.control.Switch;
import net.wqn.control.service.ReadWrite;
import net.wqn.domian.Employee;
import net.wqn.tools.Out;

public class Cui {

	/**
	 * @param args
	 */
	public static void main(String[] args) {//������
		// TODO Auto-generated method stub
//		Out.printLn(args[1]);
		ArrayList<Employee> e=ReadWrite.readAll();
		if(e.size()==0){     //����ı��е�����Ϊ��
			System.out.println("Required file �C records, does not exist.");
			return;
		}
		Switch.chooseMenu(e);
		return;
	}

}
