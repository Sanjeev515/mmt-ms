package com.example.mmt_ms;

import org.springframework.web.bind. annotation. GetMapping;
import org. springframework. web.bind. annotation. RestController;

@RestController
public class hotels {
    @GetMapping("/hotels")
    public String getData() {
        return "Please book hotels at 20% discount from mmts";
    }