package test0730;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class Test1 {
	
	@Test
	public void testAdd() {
		//断言
		assertEquals(3, new Calculate().add(1, 2));
	}
	
	
	@Test
	public void testSubtract() {
		assertEquals(5, new Calculate().subtract(8, 3));
	}
	
}
