//7개의 피보나치 수열을 출력하시오.  1 1 2 3 5 8 13
public class Q1 {
	public static void main(String[] args) {
		//재귀호출 이용
		for(int i =1; i <= 7; i++) {
			System.out.print(fibo(i)+"\t");
		}
		//반복문 이용
//		int a =1; int b =1;
//		int f;
//		System.out.print(a+"\t");
//		System.out.print(b+"\t");
//		int i =1;
//		while(i<=5){
//			f = a+b;
//			a = b;
//			b = f;
//			System.out.print(f+"\t");
//		 i++;
//		}
		
	}
	static int fibo(int n) {
		if(n==1 || n ==2)return 1;
		else return fibo(n-1)+fibo(n-2);
	}

}
