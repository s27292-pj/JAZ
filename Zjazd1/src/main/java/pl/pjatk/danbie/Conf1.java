package pl.pjatk.danbie;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class Conf1 {
    @Bean
    public POJO pojo(List<String> defaultData){
        System.out.println(defaultData);
        return new POJO();
    }
    @Bean
    public List<String> defaultData(){
        return List.of("Jeden","Dwa","Trzy","Cztery","Piec");
    }
}
