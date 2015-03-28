package springbeans;

import guru.springframework.componentscan.ComponentScanBean;
import guru.springframework.hello.HelloBean;
import guru.springframework.javaconfig.JavaConfigBean;
import guru.springframework.xml.XmlBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@ComponentScan("guru.springframework")
@ImportResource("classpath*:spring/spring-config.xml")
public class SpringBeansApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SpringBeansApplication.class, args);

        List<HelloBean> helloBeans = new ArrayList<HelloBean>();
        helloBeans.add((ComponentScanBean) ctx.getBean("componentScanBean"));
        helloBeans.add((JavaConfigBean) ctx.getBean("javaConfigBean"));
        helloBeans.add((XmlBean) ctx.getBean("xmlBean"));

        for(HelloBean helloBean : helloBeans){
            helloBean.sayHello();
        }
    }
}
