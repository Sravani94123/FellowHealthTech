package StepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;

//hOOKS:
public class hooks {
	@Before("@SmokeTest")
	public static void login() {
		System.out.println("execute before scenario's and backgroud");
	}
	@After("@SmokeTest")
	public static void teardown() {
		System.out.println("execute after scenario's and backgroud");
		}
}
