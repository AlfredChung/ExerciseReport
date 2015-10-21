package net.wqn.control;

import java.util.ArrayList;

import net.wqn.domian.Employee;
import net.wqn.tools.Comparable;
import net.wqn.tools.In;
import net.wqn.tools.Out;

public class Show {
	public static void printAll(ArrayList<Employee> e){  //输出所有对象
		Employee emp=null;
		for (int i = 0; i < e.size(); i++) {
			emp=e.get(i);
			Out.printLn(emp.getNum()+":"+emp.getTelephoneNum()+":"+emp.getFirstName()+":"+emp.getLastName()+":"+emp.getInitial()+":"+emp.getDepartNum()+":"+emp.getJobTitle()+":"+emp.getHiringDate());
		}
		Out.printLn("Press Enter to continue... ");
		In.waitEnterkey();
	}
	public static void printAll_Formatted(ArrayList<Employee> e){//按名字排序后以一定的格式输出所有对象
		Employee emp=null;
		Comparable.sortByFName(e);
		for (int i = 0; i < e.size(); i++) {
			emp=e.get(i);
			//Out.printLn(emp.getFirstName()+":"+emp.getLastName()+":"+emp.getInitial()+":"+emp.getNum()+":"+emp.getTelephoneNum()+":"+emp.getDepartNum()+":"+emp.getJobTitle()+":"+emp.getHiringDate());		
			System.out.printf("%-10s%-10s%-3s%-5d%-14s%-4d%-20s%-12s\n",emp.getFirstName(),emp.getLastName(),emp.getInitial(),emp.getNum(),emp.getTelephoneNum(),emp.getDepartNum(),emp.getJobTitle(),emp.getHiringDate());
		}
		Out.printLn("Press Enter to continue... ");
		In.waitEnterkey();
	}
	public static void printNameAndPhoneNum(ArrayList<Employee> e){  //输出名字和号码
		Employee emp=null;
		for (int i = 0; i < e.size(); i++) {
			emp=e.get(i);
			Out.printLn(emp.getFirstName()+":"+emp.getLastName()+":"+emp.getTelephoneNum());
		}
		Out.printLn("Press Enter to continue... ");
		In.waitEnterkey();
	}
	public static void printNameAndPhoneNum_formatted(ArrayList<Employee> e){//按名字排序后以一定的格式输出名字和号码
		Employee emp=null;
		Comparable.sortByFName(e);
		for (int i = 0; i < e.size(); i++) {
			emp=e.get(i);
			//Out.printLn(emp.getFirstName()+":"+emp.getLastName()+":"+emp.getTelephoneNum());
			System.out.printf("%-10s%-10s%-14s\n",emp.getFirstName(),emp.getLastName(),emp.getTelephoneNum());
		}
		Out.printLn("Press Enter to continue... ");
		In.waitEnterkey();
	}
}
