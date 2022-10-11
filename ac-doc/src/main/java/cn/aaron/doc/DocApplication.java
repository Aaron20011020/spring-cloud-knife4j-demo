package cn.aaron.doc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Aaron(谢胜瑜)
 */
@SpringBootApplication
@ComponentScan("cn.aaron")
public class DocApplication {

    public static void main(String[] args) {
        SpringApplication.run(DocApplication.class);
    }
}
