package net.wqn.tools;

import java.util.Scanner;

public class In {
	static Scanner sc=new Scanner(System.in);
	public static String scan(){
		String s=null;
		s=sc.nextLine();
		return s;
	}
	public static void waitEnterkey(){    //�ȴ�����һ��enter��
		    	String s=In.scan();
		    	while(s.length()!=0){
		    		s=In.scan();
		    }  
	}
	public static void waitAnykey(){      //�ȴ�����һ�������
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
	public static boolean isContinue(){ //�Ƿ����������һy��ͷ���ַ���Ϊ�棬����Ϊ��
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
