package com.ivoronline.controller;

import com.ivoronline.entity.PersonEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  //================================================================
  // GET PERSON
  //================================================================
  @RequestMapping("Hello")
  String hello() {

    //CREATE ENTITY
    PersonEntity personEntity = new PersonEntity(); //name = "unknown"
                 personEntity.age  = 20;

    //RETURN ENTITY
    return personEntity.name + " is " + personEntity.age + " years old";

  }

}

