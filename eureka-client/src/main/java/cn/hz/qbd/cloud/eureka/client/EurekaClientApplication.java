package cn.hz.qbd.cloud.eureka.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@SpringBootApplication
@RestController
public class EurekaClientApplication extends SpringBootServletInitializer {
	
	@Value("${server.port}")
    String port;

	public static void main(String[] args) {
//		new SpringApplicationBuilder(EurekaServerApplication.class).web(true).run(args);
		
        SpringApplication.run( EurekaClientApplication.class, args );
    }
	
    @RequestMapping("/index")
    public String home(@RequestParam(value = "name", defaultValue = "qbd") String name) {
        return "hi " + name + " ,i am from port:" + port;
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        // 注意这里要指向原先用main方法执行的Application启动类
        return builder.sources(EurekaClientApplication.class);
    }
}
