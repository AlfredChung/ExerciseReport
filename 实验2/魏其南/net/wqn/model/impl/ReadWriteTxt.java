package net.wqn.model.impl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import net.wqn.domian.Employee;
import net.wqn.model.ReadWriteDAO;
import net.wqn.tools.Resource;

public class ReadWriteTxt implements ReadWriteDAO {
	@Override
	public ArrayList<Employee> read() {  //���ı��ļ��ж������ݣ�����employee����
		// TODO Auto-generated method stub
		BufferedReader f=null;
		String line;
		ArrayList<Employee> e=new ArrayList<Employee>();
		try {
			f=new BufferedReader(new FileReader(Resource.getEmpInfRoad()));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			while((line=f.readLine())!=null){
				e.add(new Employee(line.split(":")));
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return e;
	}

	@Override
	public void Write(String context) {    //���ַ���������д��ָ�����ı�
		// TODO Auto-generated method stub
		BufferedWriter w=null;
		try {
			w=new BufferedWriter(new FileWriter(Resource.getEmpInfRoad()));
			//Out.print(context);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			w.write(context);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			w.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			w.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
