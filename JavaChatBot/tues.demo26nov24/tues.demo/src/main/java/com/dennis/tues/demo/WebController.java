package com.dennis.tues.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    /**
     * Maps the root URL ("/") to the index.html file in the static folder.
     *
     * @return the name of the index.html file.
     */
    @GetMapping("/")
    public String index() {
        // Spring Boot will look for this file in src/main/resources/static/
        return "index.html";
    }
}