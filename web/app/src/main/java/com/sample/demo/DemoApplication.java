package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

    @RequestMapping("/")
    public String home() {
        int test = 1;
        test++;

        return "Hello Docker World!!!!" + test;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}