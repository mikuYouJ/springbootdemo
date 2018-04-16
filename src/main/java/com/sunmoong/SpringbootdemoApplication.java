package com.sunmoong;

import com.sunmoong.config.AuthorSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringbootdemoApplication {


	@Value("${book.author}")
	private String bookAuthor;

	@Value("${book.name}")
	private String bookName;

	@Autowired
	private AuthorSettings authorSettings;

	@RequestMapping("/")
	String index(){
		return "Hello Spring Boot"+ bookAuthor+":"+bookName+"and author age is "+ authorSettings.getAge();
	}


	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(SpringbootdemoApplication.class);
		app.run(args);
//		SpringApplication.run(SpringbootdemoApplication.class, args);
	}
}
