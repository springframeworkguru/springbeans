package guru.springframework.xml;

import guru.springframework.hello.HelloBean;

/**
 * Created by jt on 3/28/15.
 */
public class XmlBean implements HelloBean {
    @Override
    public void sayHello() {
        System.out.println("Hello, I'm a XML Bean");
    }
}
