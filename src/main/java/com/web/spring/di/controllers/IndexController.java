package com.web.spring.di.controllers;

import com.web.spring.di.models.Person;
import org.springframework.beans.factory.annotation.Autowired;

public class IndexController {

    @Autowired
    private Person person;
}
