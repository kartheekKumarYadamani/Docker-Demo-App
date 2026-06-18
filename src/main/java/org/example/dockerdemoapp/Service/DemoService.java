package org.example.dockerdemoapp.Service;

import org.springframework.stereotype.Service;

@Service
public class DemoService {

    public String getMessage(){
        return "Hello Buddy! Welcome to Docker Demo";
    }

}
