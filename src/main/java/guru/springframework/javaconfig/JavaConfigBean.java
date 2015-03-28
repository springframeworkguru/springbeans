package guru.springframework.javaconfig;

import guru.springframework.hello.HelloBean;

/**
 * Created by jt on 3/28/15.
 */
public class JavaConfigBean implements HelloBean {
    @Override
    public void sayHello() {
        System.out.println("Hello, I'm a Java Config bean");
    }
}
