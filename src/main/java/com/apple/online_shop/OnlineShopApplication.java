package com.apple.online_shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OnlineShopApplication {


	public static void main(String[] args) {
		SpringApplication.run(OnlineShopApplication.class, args);
		var p1 = new Friend("kim");
		var p2 = new Friend("park");
		System.out.println(p1.name);
		System.out.println(p2.name);

		BasicInfo bi = new BasicInfo("서미영", 20);
		bi.changeAge(25);
		bi.incrementAge();

		System.out.println("이름: " + bi.getName());
		System.out.println("최종 나이: " + bi.getAge());


	}

}

class Friend {
	String name = "seo";
	int age = 26;
	Friend(String 구멍) { // constructor(object 뽑을 때 초기값 생성)
		// new Friend()할 때 자동 생성됨
		this.name = 구멍;
	}
}
