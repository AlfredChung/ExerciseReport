package net.wqn.tools;

import java.util.ResourceBundle;

public class Resource {
	private static String empInfRoad;  //从配置文件中得到保存数据的文件路径
	static ResourceBundle rb=ResourceBundle.getBundle("net.wqn.tools.config");
	public static String getEmpInfRoad(){
		empInfRoad=rb.getString("empInfRoad");
		return empInfRoad;
	}
}
