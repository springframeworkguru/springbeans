package guru.springframework.componentscan;

import src.main.java.guru.springframework.hello.HelloBean;


/**
 * Created by jt on 3/28/15.
 */
@Component
public class ComponentScanBean implements HelloBean
{
	public void sayHello()
	{
		System.out.println("Hello, I'm a Component Scan Bean!!");
		System.out.println("Hello,");
	}
}
