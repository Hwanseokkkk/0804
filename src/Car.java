
public class Car {
	private String name;
	private int price;
	
	public Car() {
		System.out.println("방금 객체가 생성되었습니다.")
		;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void myPrint() {
		System.out.println(this);
	}
}
