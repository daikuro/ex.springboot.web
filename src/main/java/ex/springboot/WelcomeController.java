package ex.springboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.Date;
import java.util.Map;

@Controller
@SessionAttributes(value = { "myTest" })
public class WelcomeController {

    @Value("${application.message:Hello World}")
    private String message = "Hello World";

    @RequestMapping("/")
    public String welcome(Map<String, Object> model) {
        model.put("time", new Date());
        model.put("message", this.message);
        model.put("myTest", "aaaa");
        return "welcome";
    }

    @RequestMapping("/w2")
    public String welcome2(Map<String, Object> model) {
        model.put("time", new Date());

        Object myTest = model.get("myTest");
        System.out.println("myTest = " + myTest);

        model.put("message", myTest);
        return "welcome";
    }

}