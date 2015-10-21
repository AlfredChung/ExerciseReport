package net.wqn.control;

import java.util.ArrayList;

import net.wqn.domian.Employee;
import net.wqn.tools.Comparable;
import net.wqn.tools.In;
import net.wqn.tools.Out;

public class AddAndDelect {
	public static void add(ArrayList<Employee> e){//添加一个对象
		boolean b=true;
		while(b){
		Out.printLn("Adfaith Consulting – Employee Records:\n======================================\nEmployee Record Additions:\n\nEnter the following details of the new employee:");
		Out.printLn("Employee 3 digit payroll number\nPhone Number\nLast Name\nFirst Name\nMiddle Init\nDept #\nJob Title\nDate Hired");
		String s[] = new String[8];
		s[0]=inputNum(e,true);
		s[1]=inputCheck("Enter Phone Number (02-12345678):","Invalid phone number – try again","phone number","0[2-8]-[1-9][0-9]{7}");
		s[2]=inputCheck("Enter Last Name: ","Last name can contain only alphabetical characters and spaces ","Last Name","([a-zA-Z]+\\s*)+");
		s[3]=inputCheck("Enter First Name:","First name can contain only alphabetical characters and spaces ","First Name","([a-zA-Z]+\\s*)+");
		s[4]=inputCheck("Enter Middle Init:","Middle Init can contain only alphabetical characters and spaces ","Middle Init","([a-zA-Z]+\\s*)+");
		s[5]=inputCheck("Enter Dept #:", "Dept # can contain only digits with no spaces", "Dept #", "[1-9][0-9]");
		s[6]=inputCheck("Enter Job Title: ", "Job title can contain only alphabetical characters and spaces ","Job title" , "([a-zA-Z]+\\s*)+");
		s[7]=inputCheck("Enter Date Hired (yyyy-mm-dd)", "Invalid Date Hired", "Date Hired", "^((\\d{2}(([02468][048])|([13579][26]))[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])))))|(\\d{2}(([02468][1235679])|([13579][01345789]))[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|(1[0-9])|(2[0-8]))))))");
		e.add(new Employee(s));
		Out.printLn("add success");
		Out.printLn("Add another employee record?");
		b=In.isContinue();
	}}
	public static void delect(ArrayList<Employee> e){  //删除一个对象
		boolean b=true;
		String input=null;
		int index=-1;
		while(b){
			Out.printLn("Adfaith Consulting – Employee Records:\n======================================\nEmployee Record Deletion:Enter employee’s 3 digit payroll number to enable file deletion" );
			input=inputNum(e,false);
			if(input!=null){
			index=printALine(e,Integer.parseInt(input));	
			Out.printLn("Confirm record deletion, ");
			if(In.isContinue()){
				e.remove(index);
				Out.printLn("Record deleted.\nDelete another?");
				b=In.isContinue();
			}else{
				return;
			}
		}else{
			Out.printLn("Press Enter to continue ...");
			In.waitEnterkey();
			return;
		}
	}
}
	private static String inputNum(ArrayList<Employee> e,boolean isadd){ //员工号的判断，分为添加和查找两种情况，用参数isadd来区分
		String input=null;
		while(true){
			Out.printLn("Enter employee 3 digit payroll number:");
			input=In.scan();
			if(input.length()==0){
				Out.printLn("No payroll number entered – try again");
			}else if(input.length()!=3){
				Out.printLn("the length of payroll number must be 3 – try again");
			}else if(!isNum(input,3)){
				Out.printLn("Payroll number can contain only numerical characters");
			}else if(isExist(e, input)){
				if(isadd){
				Out.printLn("the number has existed");}else{
					return input;
				}				
			}else{
				if(isadd){
				return input;	
				}else{
					Out.printLn("Employee record for "+input+" not found!");
					return null;
				}
			}
		}
	}
	private static String inputCheck(String a,String b,String c,String exp){ //调用正则表达式来对输入进行合法性检查
		String input=null;
		while(true){
			Out.printLn(a);
			input=In.scan();
			if(input.length()!=0){
			if(Comparable.isMatch(input,exp )){
				return input;
			}else{
				Out.printLn(b);
			}}else{
				Out.printLn("No"+c+"entered – try again");
			}
		}
	}

	private static boolean isNum(String s,int k){  //判断是否为三位数字
		for (int i = 0; i < k; i++) {
			if(s.charAt(i)>'9'||s.charAt(i)<'0'){
				return false;
			}
		}
		return true;
	}
	private static boolean isExist(ArrayList<Employee> e,String s){ //判断员工号是否已经存在
		Employee emp=null;
		for (int i = 0; i < e.size(); i++) {
			emp=e.get(i);
			if(emp.getNum()==Integer.parseInt(s)){
				return true;
			}
		}
		return false;
	}
	private static int printALine(ArrayList<Employee> e,int num){ //输出员工号为num的一行数据
		Employee emp=null;
		for (int i = 0; i <e.size() ; i++) {
			emp=e.get(i);
			if(emp.getNum()==num){
				Out.printLn(emp.getNum()+":"+emp.getTelephoneNum()+":"+emp.getFirstName()+":"+emp.getLastName()+":"+emp.getInitial()+":"+emp.getDepartNum()+":"+emp.getJobTitle()+":"+emp.getHiringDate());
				return i;
			}
		}
		return -1;
	}
}
