package ex.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.Date;
import java.util.Map;

/**
 */
@Controller
@SessionAttributes(value = { "myTest" })
public class Welcome3Controller {

    @RequestMapping("/w3")
    public String welcome(Map<String, Object> model) {
        model.put("time", new Date());
        model.put("message", model.get("myTest"));
        return "welcome";
    }

}
