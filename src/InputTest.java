/*import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class InputTest {
	Student jimin;
	
	
	@Before // Before라는 라벨이 붙으면 항상 Test 전에한다.
	public void init() {
		jimin = new Student();
		
	}
	@Test //JUnit Annotation 검사하려는 Method위에 사용한다. 
	public void testInput() {
		Input input = new Input();
		input.input(jimin);
		assertEquals("한지민",jimin.name); // (확증)assertEquals(기대값, 실제값) 같으면 초록색, 다르면 빨간색이 나옴
	}
	
	@Test
	public void testCalc() {
		Calc calc = new Calc();
		jimin.kor = 100;
		jimin.eng = 90;
		jimin.mat = 80;
		calc.calc(jimin);
		//assertEquals(270, jimin.tot);
		//assertEquals((int)(270/3.) ,(int)(jimin.avg));
		assertEquals('B',jimin.grade); //실제값은 A이지만 기대값을 B로 입력하여 빨간색 바가 나온다.
	}
}*/
