package com.source.read.component;

import org.springframework.stereotype.Component;

/**
 * <p>
 *
 * </p>
 *
 * @author zhāngshìchāng
 * @date 2021/3/22 11:19 上午
 */
@Component
public class ComponentX {


	public ComponentX() {
		System.out.println("实例化 ComponentX");
	}

	public void sayHello() {
		System.out.println("hello !!!!");
	}

}
