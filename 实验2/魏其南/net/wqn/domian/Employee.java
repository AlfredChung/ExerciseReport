package net.wqn.domian;

public class Employee {   //employee对象的定义
	int num;
	String telephoneNum;
	String lastName;
	String firstName;
	char initial;
	int departNum;
	String jobTitle;
	String hiringDate;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(String s[]){
		this.num=Integer.parseInt(s[0]);
		this.telephoneNum=s[1];
		this.lastName=s[2];
		this.firstName=s[3];
		this.initial=s[4].charAt(0);
		this.departNum=Integer.parseInt(s[5]);
		this.jobTitle=s[6];
		this.hiringDate=s[7];
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getTelephoneNum() {
		return telephoneNum;
	}
	public void setTelephoneNum(String telephoneNum) {
		this.telephoneNum = telephoneNum;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public char getInitial() {
		return initial;
	}
	public void setInitial(char initial) {
		this.initial = initial;
	}
	public int getDepartNum() {
		return departNum;
	}
	public void setDepartNum(int departNum) {
		this.departNum = departNum;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getHiringDate() {
		return hiringDate;
	}
	public void setHiringDate(String hiringDate) {
		this.hiringDate = hiringDate;
	}
}
