package com.jieun.springrecipes.shop.config;

import com.jieun.springrecipes.shop.Battery;
import com.jieun.springrecipes.shop.Disc;
import com.jieun.springrecipes.shop.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ShopConfiguration {
    @Bean
    public Product aaa(){
        Battery b1 = new Battery("AAA", 2.5);
        b1.setRechargeable(true);
        return b1;
    }

    @Bean
    public Product cdrw(){
        Disc d1 = new Disc("CD-RW", 1.5);
        d1.setCapacity(700);
        return d1;
    }
}
