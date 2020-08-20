package cn.hz.qbd.cloud.eureka.client.mybatis;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;

import cn.hz.qbd.cloud.eureka.client.mybatis.entity.Config;
import cn.hz.qbd.cloud.eureka.client.mybatis.service.ConfigService;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableEurekaClient
@RestController
@MapperScan("cn.hz.qbd.cloud.eureka.client.mybatis.mapper")
public class EurekaClientMybatisApplication {
	
	@Resource
	private ConfigService configService;

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientMybatisApplication.class, args);
	}
	
	@Value("${server.port}")
    String port;
	
    @RequestMapping("/index")
    public String index(@RequestParam(value = "name", defaultValue = "forezp") String name) {
    	PageInfo<Config> configs = configService.findAll();
    	System.out.println(configs);
        return "hi " + name + " ,i am from port:" + port + ":" + configs;
    }
}
