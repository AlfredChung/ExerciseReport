package net.wqn.control.service;

import java.util.ArrayList;

import net.wqn.domian.Employee;
import net.wqn.model.ReadWriteDAO;

public class ReadWrite {
	static ReadWriteDAO rw=null;
	 static{
		 try{
		  rw=(ReadWriteDAO)( Class.forName("net.wqn.model.impl.ReadWriteTxt").newInstance());     
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//反射
		
		}
public static void Write(ArrayList<Employee> e){ //把数据写入指定的文件
	StringBuffer sb=new StringBuffer();
	Employee emp=null;
	for (int i = 0; i < e.size(); i++) {
		emp=e.get(i);
		sb.append(emp.getNum()+":"+emp.getTelephoneNum()+":"+emp.getLastName()+":"+emp.getFirstName()+":"+emp.getInitial()+":"+emp.getDepartNum()+":"+emp.getJobTitle()+":"+emp.getHiringDate()+"\r\n");
	}
	rw.Write(sb.toString());   
}
	public static ArrayList<Employee> readAll(){ //返回容器的句柄
		ArrayList<Employee> e=rw.read();
		return e;
	}
}
