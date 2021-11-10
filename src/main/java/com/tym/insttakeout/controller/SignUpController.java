package com.tym.insttakeout.controller;

import com.tym.insttakeout.entity.Customer;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class SignUpController {
    @RequestMapping(value="/signup", method= RequestMethod.POST)
    @ResponseStatus(value= HttpStatus.CREATED)
    // @RequestBody is equal to using ObjectMapper to convert json response
    // from Jackson library
    public void signup(@RequestBody Customer customer) {

    }
}
