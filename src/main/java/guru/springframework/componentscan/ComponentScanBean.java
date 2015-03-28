package guru.springframework.componentscan;

import guru.springframework.hello.HelloBean;
import org.springframework.stereotype.Component;

/**
 * Created by jt on 3/28/15.
 */
@Component
public class ComponentScanBean implements HelloBean {
    public void sayHello(){
        System.out.println("Hello, I'm a Component Scan Bean");
    }
}
