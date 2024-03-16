package pl.pjatk.danbie;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Comp3 {
    public Comp3(ApplicationContext applicationContext) {
        Comp1 comp1 = applicationContext.getBean("comp1",Comp1.class);
        Comp2 comp2 = applicationContext.getBean("comp2",Comp2.class);
        comp1.Hello1();
        comp2.Hello2();
    }
}
