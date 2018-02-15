package com.aulaspring.aulaspring.controller;

import com.aulaspring.aulaspring.model.Client;
import com.aulaspring.aulaspring.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@SpringBootApplication
@EnableAutoConfiguration
public class MainController {

    @Autowired
    private ClientService clientService;

    @ResponseBody
    @RequestMapping("/")
    public String index(){
        return "Hello Word";
    }

    @ResponseBody
    @RequestMapping("/test")
    public Client test(){
        return clientService.create();
    }

    @ResponseBody
    @RequestMapping("/find")
    public List<Client> find(){
        return clientService.getListClient();
    }
}
