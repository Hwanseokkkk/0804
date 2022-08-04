
public class ThisDemo1 {
	public static void main(String[] args) {
		Lion lion = new Lion();
		Lion another = lion.getLion();//주소복사
		System.out.println(another.name);
		System.out.println(another.age);
	}
}
class Lion{
	String name = "한지민";
	int age = 26;
	Lion getLion(){
		return this; //자기 주소통채로 넘긴다는 의미.
		//return name;//나의 이름만 넘겨줄꺼야(Lion이아니라 String으로 변경하여야함.)
		
	}
		
}