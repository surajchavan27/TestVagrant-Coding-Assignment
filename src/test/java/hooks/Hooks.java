package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	@Before("@Sanity")
	public void start()
	{
		System.out.println("Login Start");
	}
	@After("@Sanity")
	public void end()
	{
		System.out.println("Login End");

	}

}
