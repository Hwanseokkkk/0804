/*
 생성자의 역할은 멤버변수(필드,Property)의 초기화
 파라미터가 없는 생성자를 기본 생성자라고 한다.
 파라미터가 없는 기본 생성자는 어떻게 멤버변수를 초기화 할 것인가???
 0, 0.0, false, '\0' or '\u0000', null
 기본생성자는 항상 해당 클래스의 생성자가 한 개도 없을 때 자동으로 만들어준다.
 만일 한 개라도 생성자가 존재하면 컴파일러는 자동으로 생성하지 않는다.
 */
public class ConstructorDemo3 {
	public static void main(String[] args) {
		//Tiger tiger = new Tiger(); //기본생성자
		//System.out.println(tiger.name);
		MyCalender mc = new MyCalender(2002,4,5);//생성자가 존재하기 때문에 기본생성자가 되지 않는다.
		System.out.println(mc.year);
		
	}

}
class MyCalender{
	int year, month, day;
	public MyCalender() {}
	public MyCalender(int year) {}
	public MyCalender(int year, int month) {}
	public MyCalender(int year, int month, int day) { //기본생성자가 아님. 
		//Override(재정의)라고한다 -->기본생성자(0년0달0일은 존재하지 않기때문에 컴파일러가 정수형 0으로 만들면 안되기때문에 임의로 정해주어야한다.)
		this.year = year;
		this.month = month;
		this.day = day;
	}
}

class Tiger{ //어떻게 얘들은 초기화 할 것인가?
	//이미 배웠다. 정수형은 =0으로 초기화 실수는 =0.0 
	//논리는 false, char는 null값, String은 null주소
	String name;
	int age;
	boolean flag;
	double weight;
	char grade;
}