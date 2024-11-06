package com.example.mmt_ms;

import org.springframework.web.bind. annotation. GetMapping;
import org. springframework. web.bind. annotation. RestController;

@RestController
public class trains {
    @GetMapping("/trains")
    public String getData() {
        return "Please book trains at 8% discount from mmts";
    }
}