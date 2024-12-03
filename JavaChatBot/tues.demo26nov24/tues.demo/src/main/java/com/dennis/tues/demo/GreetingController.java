package com.dennis.tues.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @RequestMapping("/")
    public String getMyGreeting() {
        String myReturnMessage;
        myReturnMessage = "***** Welcome to my website ****" +
                "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <title>Poem: Building a Spring Boot App</title>\n" +
                "    <style>\n" +
                "        body {\n" +
                "            font-family: Arial, sans-serif;\n" +
                "            background-color: #f9f9f9;\n" +
                "            padding: 20px;\n" +
                "            line-height: 1.8;\n" +
                "        }\n" +
                "        .line1 { color: #FF5733; } /* Red-Orange */\n" +
                "        .line2 { color: #33FF57; } /* Green */\n" +
                "        .line3 { color: #3357FF; } /* Blue */\n" +
                "        .line4 { color: #FF33A1; } /* Pink */\n" +
                "        .line5 { color: #A633FF; } /* Purple */\n" +
                "        .line6 { color: #FFC300; } /* Yellow */\n" +
                "        .line7 { color: #33FFF6; } /* Teal */\n" +
                "        .line8 { color: #FF6F61; } /* Coral */\n" +
                "    </style>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <h1>Building a Spring Boot App</h1>\n" +
                "    <p class=\"line1\">With Java’s power, we start the quest,</p>\n" +
                "    <p class=\"line2\">A Spring Boot app to build our best.</p>\n" +
                "    <p class=\"line3\">The framework strong, with tools so sleek,</p>\n" +
                "    <p class=\"line4\">APIs we’ll craft, unique and chic.</p>\n" +
                "\n" +
                "    <p class=\"line5\">Controllers guide the flow with care,</p>\n" +
                "    <p class=\"line6\">Models keep the data square.</p>\n" +
                "    <p class=\"line7\">Services work their magic bright,</p>\n" +
                "    <p class=\"line8\">Making logic run just right.</p>\n" +
                "\n" +
                "    <p class=\"line1\">The RESTful path, so clean and pure,</p>\n" +
                "    <p class=\"line2\">With JSON calls, our apps endure.</p>\n" +
                "    <p class=\"line3\">From local host to cloud deploy,</p>\n" +
                "    <p class=\"line4\">Spring Boot apps bring coding joy.</p>\n" +
                "\n" +
                "    <p class=\"line5\">So write the code, and test with zeal,</p>\n" +
                "    <p class=\"line6\">Your Spring Boot app’s a full-stack deal.</p>\n" +
                "    <p class=\"line7\">In Java’s world, your skills will grow,</p>\n" +
                "    <p class=\"line8\">A masterpiece for all to show.</p>\n" +
                "</body>\n" +
                "</html>\n" +
                "<br>" +
                "<i> and this <br>is italics </i>";
        return myReturnMessage;
    }
}
