import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
// import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
// import de.codecentric.boot.admin.config.EnableAdminServer;

/**
 * 程序入口类
 *
 * @author Deament
 * @date 2017/1/1
 */
@EnableScheduling
@ComponentScan(basePackages = { "com.ybg", "cn", "org.mybatis", "com.egzosn" }) // 扫描注解
@EnableAutoConfiguration
// @EnableAdminServer
public class App {
    
    /**
     * @EnableAutoConfiguration //这个注解可以根据你依赖的包自动生成相关配置
     * @EnableAdminServer spring boot admin监控 ，不喜欢可以不要
     **/
    public static void main(String[] args){
        // 禁用重启
        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(App.class, args);
    }
}
