
public class Employee {
	private String empno;
	private String name;
	private int salary;
	private String hiredate;
	
	Employee(String empno, String name){
		System.out.println("방금 객체가 생성 되었습니다.");
		this.empno = empno;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
	public void myPrint() {
		System.out.printf("%s, %s, %d, %s\n",this.empno,this.name,this.salary,this.hiredate);
	}
	

}
