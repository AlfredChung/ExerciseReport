package net.wqn.tools;

import java.util.Scanner;

public class In {
	static Scanner sc=new Scanner(System.in);
	public static String scan(){
		String s=null;
		s=sc.nextLine();
		return s;
	}
	public static void waitEnterkey(){    //等待输入一个enter键
		    	String s=In.scan();
		    	while(s.length()!=0){
		    		s=In.scan();
		    }  
	}
	public static void waitAnykey(){      //等待输入一个任意键
		String s=null;
		while(true){
			s=In.scan();
			if(s.length()==0){
				break;
			}else{
				break;
			}
		}
	}
	public static boolean isContinue(){ //是否继续，输入一y开头的字符就为真，否则为假
		Out.printLn("(y)es or (n)o:" );
			String	input=null;
			char	c;
				//Out.print(input);		
			input=In.scan();
			if(input.length()!=0){
			c=input.charAt(0);
				if(c=='y'){
					return true;
				}
			}
			return false;
	}
}
