package net.wqn.model;

import java.util.ArrayList;
import net.wqn.domian.Employee;

public interface ReadWriteDAO {  //�ӿ�
	ArrayList<Employee> read();	
	void Write(String context);
}
