package jp.lateautumnriver.tryspringboot.payroll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping(value = "/payroll")
    public String index() {
        return "payroll/index";
    }
}
