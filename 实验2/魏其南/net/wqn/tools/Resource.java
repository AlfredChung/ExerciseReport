package net.wqn.tools;

import java.util.ResourceBundle;

public class Resource {
	private static String empInfRoad;  //�������ļ��еõ��������ݵ��ļ�·��
	static ResourceBundle rb=ResourceBundle.getBundle("net.wqn.tools.config");
	public static String getEmpInfRoad(){
		empInfRoad=rb.getString("empInfRoad");
		return empInfRoad;
	}
}
