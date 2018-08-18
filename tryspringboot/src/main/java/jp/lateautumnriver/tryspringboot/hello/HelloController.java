package jp.lateautumnriver.tryspringboot.hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/hellospringboot")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
