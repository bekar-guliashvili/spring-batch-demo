package com.example.springbatchdemo.cofig;

import com.example.springbatchdemo.entity.Person;
import org.springframework.batch.item.ItemProcessor;

public class PersonProcessor implements ItemProcessor<Person, Person> {
    @Override
    public Person process(Person person) throws Exception {
        return person;
    }
}
