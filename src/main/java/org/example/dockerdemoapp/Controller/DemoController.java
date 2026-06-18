package org.example.dockerdemoapp.Controller;

import org.example.dockerdemoapp.Service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/v1")
 class DemoController {


    private final DemoService demoService;

    DemoController(DemoService demoService){
        this.demoService=demoService;
    }


    @GetMapping
    public String firstMessage(){
        return demoService.getMessage();
    }

}
