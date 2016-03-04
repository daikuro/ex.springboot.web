package ex.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by daikuro on 2016/03/04.
 */

// http://spring-boot-camp.readthedocs.org/ja/latest/01-HelloWorld.html
@SpringBootApplication
public class WebMain {

    public static void main(String[] args) {
        SpringApplication.run(WebMain.class, args);
    }

}
