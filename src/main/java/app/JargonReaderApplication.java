package main.java.app;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;


/**
 * Created by snu on 2018-02-15.
 */

@SpringBootApplication
public class JargonReaderApplication {

    public static void main(String[] args) {
String s = "Hello";
String t = new String(s);
if("Hello".equals(s)) System.out.println("one");
        if(t == s) System.out.println("two");
        if("Hello" == s) System.out.println("three");
        if("Hello" == t) System.out.println("four");
        if(t.equals(s)) System.out.println("five");

        new SpringApplicationBuilder(JargonReaderApplication.class).run(args);
    }
}
