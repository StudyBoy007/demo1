package com.example.demo1.config;

import com.example.demo1.Service.HelloService;
import com.example.demo1.entity.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import javax.annotation.Resource;

/**
 * Create by czq
 * time on 2020/6/1  17:25
 */
//表明该类是配置类
@Configuration
@PropertySource(value = "classpath:person.properties")
public class MyAppConfig {

    @Resource
    Environment env;


    //将放回值对象注入到容器中，注入bean的id名为方法名
    //方法名不可以和通过注解注入的名称一样，不然报错，比如下面不可以叫person
    //这里注入了person到容器，Person类中也通过@component注入了,然后通过@resources引用的person对象会是后者@component
    //
    @Bean
    public Person getPerson() {
        Person person = new Person();
        person.setAge(Integer.valueOf(env.getProperty("person.age")));
        return person;
    }

}
