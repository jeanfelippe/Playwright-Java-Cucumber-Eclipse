package steps;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;

public class Hooks {
	
	
	
	@BeforeAll
	public static void before_all() {
		System.out.println("@BeforeAll - create DB Conn");
		
	}
	
	@AfterAll
	public static void after_all() {
		System.out.println("@AfterAll - Close DB Conn");
	}
	
	@Before
	public void setUp() {
		System.out.println("@Before hook - launching Browser");
		
	}
	
	@After
	public void tearDown() {
		System.out.println("@After hook - Quit browser");
	}
	
	@BeforeStep
	public void before_step() {
		System.out.println("@Before step - adding a log");
		
	}
	
	@AfterStep
	public void after_step() {
		System.out.println("@After step - adding a log");
		
	}

}
