package com.example.student.Controller;

import com.example.student.Services.Helloservices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class Hello {
    @Autowired
    Helloservices hel;

    @GetMapping("/api")
    public String getGreetings() {
        return hel.getmethod();
    }
    @PutMapping("/put")
    public String Putmethod(){
        return hel.Putmethod();
    }
    @DeleteMapping("/del")
    public String deletegreet(){
        return hel.Deletemethod();
    }
}

controller