/*  this() : new없이 생성자를 호출하기 위한 메소드
 1. 반드시 생성자메소드에서만 사용해야 하고
 2. 생성자 메소드내의 반드시 '첫번째'줄에 와야한다.
 */
public class ConstructorDemo2 {
	public static void main(String[] args) {
		Sawon jimin = new Sawon();
		//이름만 넣어도 급여가 찍힐 수있게 월급기본값을 만들자
		//월급만 넣어도 이름이 나올 수 있게 이름기본값을 만들자
		System.out.println(jimin.name);
		System.out.println(jimin.salary);
	}
}
class Sawon{
	String name;
	int salary;
	public Sawon(String name, int salary) {//다넣어도됩니다.
		this.name = name;
		this.salary = salary;
	}
	public Sawon(String name) {//이름만 넣어도 됩니다.
		this(name,50000000);
		//new Sawon(name, 5000000); //new 사용하면 새주소가 되어 안된다. 
		//그래서 new없이 생성자를 호출하는 방법이 필요하다.
		//---> this 이다
	}
	public Sawon(int salary) {//급여만 넣어도 됩니다.
		this("Unknown",salary);
		//new Sawon("Unknown",salary);
	}
	public Sawon() {//기본생성자 입니다.
		this("Unknown",50000000);
	//new Sawon("Unknown",50000000);
	}
}