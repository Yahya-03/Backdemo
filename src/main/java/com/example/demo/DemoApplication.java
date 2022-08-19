package com.example.demo;

		import org.springframework.boot.SpringApplication;
		import org.springframework.boot.autoconfigure.SpringBootApplication;
		import org.springframework.http.MediaType;
		import org.springframework.web.bind.annotation.CrossOrigin;
		import org.springframework.web.bind.annotation.GetMapping;
		import org.springframework.web.bind.annotation.RequestMapping;
		import org.springframework.web.bind.annotation.RestController;

		import java.util.HashMap;
		import java.util.Map;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@SpringBootApplication
@RestController
public class DemoApplication {

	//@RequestMapping("/")
	//@GetMapping(path = "/", produces= MediaType.APPLICATION_JSON_VALUE)
	//public String home() {
	//	return "Hello Docker World smart next version  3";
	//}
	@GetMapping("/")
	public Map<String, Object> get() {
		Map<String, Object> map = new HashMap<>();
		map.put("id",1);
		map.put("content", "hello spring ");
		return map;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
