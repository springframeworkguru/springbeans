package guru.springframework.xml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by jt on 3/28/15.
 */
@SpringBootApplication
@ImportResource("classpath*:spring/spring-config.xml")
public class XmlApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(XmlApplication.class, args);
        XmlBean bean = (XmlBean) ctx.getBean("xmlBean");
        bean.sayHello();
    }
}
