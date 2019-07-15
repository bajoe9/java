package com.example.buletin;


import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Date;

@Controller
public class PersonControler {
    @PersistenceContext
    EntityManager entityManager;

    @GetMapping("create-person")
    @Transactional
    public String createPerson(
        @RequestParam("firstName") String firstName,
        @RequestParam("LastName") String lastName,
        @RequestParam("age") Integer age
    ){
        Person p = new Person();
        p.setFirstName(firstName);
        p.setLastName(lastName);
        p.setAge(age);

        Buletin b = new Buletin();
        b.setNumber("rp1234567");
        b.setStartDate(new Date());
        b.setEndDate(new Date());

        entityManager.persist(p);
        return "redirect:/all";
    }

}
