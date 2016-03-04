package ex.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * http://localhost:8080/hello
 * <p/>
 * Created by daikuro on 2016/03/04.
 */
@RestController
public class HelloRest {

    @RequestMapping(value = "/hello")
    String hello() {
        return "Hello World!";
    }

}
