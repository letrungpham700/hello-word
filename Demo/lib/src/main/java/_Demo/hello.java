package _Demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
public class hello {
	
	private static final long start = System.currentTimeMillis();

    @GetMapping("/add")
    public String sayHello() {
        long millis = System.currentTimeMillis() - start;
        String uptime = String.format("%02d:%02d",
                                      TimeUnit.MILLISECONDS.toMinutes(millis),
                                      TimeUnit.MILLISECONDS.toSeconds(millis) -
                                      TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millis)));
        return String.format("Hello, Spring! (up %s, %s)", uptime, System.getenv("BUILD_PROFILE"));
    }

//    public static void main(String[] args) {
//        SpringApplication.run(HelloController.class, args);
//    }
    public static void main(String args[]){
		student.studentInfo(args);
		number.numberInfo(args);
		SpringApplication.run(hello.class, args);
	}
}
