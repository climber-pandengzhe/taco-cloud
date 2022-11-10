package tacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication是一个组合注解.组合了三个其他的注解
 *      @SpringBootConfiguration: 将该类声明为配置类. 这个注解实际上是@Configuration注解的特殊形式.
 *      @EnableAutoConfiguration: 启用Spring Boot的自动配置.告诉Spring Boot自动配置的它认为我们会用到的组件.
 *      @ComponentScan:启用组件臊面.这样我们能够通过像@Component,@Controller,@Service这样的注解声明其他类.Spring会自动发现他们并将他们注册为Spring应用上下文中的组件.
 */
@SpringBootApplication
public class TacoCloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(TacoCloudApplication.class, args);
    }

}
