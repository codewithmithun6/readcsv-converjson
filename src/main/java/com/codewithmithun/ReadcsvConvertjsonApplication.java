package com.codewithmithun;

import com.codewithmithun.main.ResultExample;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ReadcsvConvertjsonApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ReadcsvConvertjsonApplication.class, args);
		ResultExample resultExample = context.getBean(ResultExample.class);
		resultExample.execute();
	}

}
