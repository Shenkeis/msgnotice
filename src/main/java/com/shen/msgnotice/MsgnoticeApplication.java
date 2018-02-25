package com.shen.msgnotice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MsgnoticeApplication {

	@RequestMapping("/")
	String home() {
		return "消息通知处理回调服务已经启动";
	}

	public static void main(String[] args) {
		SpringApplication.run(MsgnoticeApplication.class, args);
	}
}
