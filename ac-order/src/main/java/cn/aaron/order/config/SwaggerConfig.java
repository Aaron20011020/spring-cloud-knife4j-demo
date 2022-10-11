package cn.aaron.order.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

/**
 * 接口文档配置类
 * 主要功能是扫描接口
 * @author Aaron(谢胜瑜)
 */
@Configuration
@EnableSwagger2WebMvc
public class SwaggerConfig {

    /**
     * 创建Docket存入容器，Docket代表一个接口文档
     * @return
     */
    @Bean
    public Docket webApiConfig(){
        return new Docket(DocumentationType.SWAGGER_2)
                // 创建接口文档的具体信息
                .apiInfo(webApiInfo())
                // 创建选择器，控制哪些接口被加入文档
                .select()
                // 指定@ApiOperation标注的接口被加入文档
                // .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                // 指定包扫描
                .apis(RequestHandlerSelectors.basePackage("cn.aaron.order"))
                .build();
    }

    /**
     * 创建接口文档的具体信息，会显示在接口文档页面中
     * @return
     */
    private ApiInfo webApiInfo(){
        return new ApiInfoBuilder()
                // 文档标题
                .title("标题：订单管理系统接口文档")
                // 文档描述
                .description("描述：本文档描述了订单管理系统的接口定义")
                // 版本
                .version("1.0")
                // 联系人信息
                .contact(new Contact("aaron", "http://xieshengyu.com", "xieshengyu040@gmail.com"))
                // 版权
                .license("aaron")
                // 版权地址
                .licenseUrl("http://www.xieshengyu.com")
                .build();
    }
}
