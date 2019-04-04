package com.pubs_api.controllers;

import com.pubs_api.entities.Pub;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import com.pubs_api.services.PubService;

import java.util.List;

@RestController
public class HelloController {


    @Autowired
    private PubService pubService;

    @RequestMapping("/")
    public String index() {
        String result = "";
        List<Pub> pubList = pubService.getAllPubs();
        for (Pub pub : pubList) {
            result += ( pub.toString() + " ");
        }

        return "Greetings from Spring Boot! Available pubs: " + result;
    }

}