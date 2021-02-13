package com.jieun.springrecipes.sequence.config;

import com.jieun.springrecipes.sequence.DatePrefixGenerator;
import com.jieun.springrecipes.sequence.SequenceGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SequenceConfiguration {
    @Bean
    public DatePrefixGenerator datePrefixGenerator(){
        DatePrefixGenerator dpg = new DatePrefixGenerator();
        dpg.setPattern("yyyyMMdd");
        return dpg;
    }
    @Bean
    public SequenceGenerator sequenceGenerator(){
        SequenceGenerator sequence = new SequenceGenerator();
        sequence.setInitial(10000);
        sequence.setSuffix("A");
        sequence.setPrefixGenerator(datePrefixGenerator());
        return sequence;
    }
}
