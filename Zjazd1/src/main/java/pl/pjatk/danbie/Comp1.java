package pl.pjatk.danbie;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Comp1 {
    public Comp1(Comp2 comp2) {
        comp2.Hello2();

    }
    public void Hello1(){
        System.out.println("Comp1: Hello");
    }



}
