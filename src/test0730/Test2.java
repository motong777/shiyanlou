package test0730;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Test2 {
	/**
	 * 类被加载时调用
	 */
	@BeforeClass
	public static void testBeforeClass() {
		System.out.println("beforeClass....");
	}
	/**
	 * 测试方法之前调用
	 */
	@Before
	public void testBefore() {
		System.out.println("before...");
	}
	@Test
	public void testTest1() {
		System.out.println("test1....");
	}
	@Test
	public void testTest2() {
		System.out.println("test2....");
	}
	/**
	 * 测试方法之后调用
	 */
	@After
	public void testAfter() {
		System.out.println("after....");
	}
	/**
	 * 类被销毁时调用
	 */
	@AfterClass
	public static void testAfterClass() {
		System.out.println("afterClass....");
	}

}
