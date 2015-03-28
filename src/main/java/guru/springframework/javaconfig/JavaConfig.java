package guru.springframework.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by jt on 3/28/15.
 */
@Configuration
public class JavaConfig {
    @Bean
    public JavaConfigBean javaConfigBean(){
        return new JavaConfigBean();
    }
}
