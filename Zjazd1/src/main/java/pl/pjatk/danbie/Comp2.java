package pl.pjatk.danbie;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.beans.beancontext.BeanContext;

@Component
public class Comp2 {
    public Comp2(@Value("${my.custom.property:default value}") String custom) {
        System.out.println(custom);
    }

    public void Hello2() {
        System.out.println("Comp2: Hello");
    }

}
