package net.wqn.tools;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import net.wqn.domian.Employee;

public class Comparable {
	public static void sortByFName(ArrayList<Employee> e){   //根据名字的字母来排列对象
		Comparator<Employee> comp=new Comparator<Employee>(){
			public int compare(Employee e1,Employee e2){
				return e1.getFirstName().compareTo(e2.getFirstName());			}
		};
		Collections.sort(e,comp);
	}
	public static boolean isMatch(String content,String exp){ //判断字符串是否匹配正则表达式
		Pattern p;Matcher m;
		 p = Pattern.compile(exp); 
		 m = p.matcher(content); 
		 if(m.matches()){
			 return true;
		 }else{
			 return false;
		 }
	}
}
