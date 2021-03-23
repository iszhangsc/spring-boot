package com.source.read;

import com.source.read.component.ComponentX;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * <p>
 * 入口类
 * </p>
 *
 * @author zhāngshìchāng
 * @date 2021/3/22 11:07 上午
 */
public class MainApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
		ComponentX bean = run.getBean(ComponentX.class);
		bean.sayHello();
	}

}
