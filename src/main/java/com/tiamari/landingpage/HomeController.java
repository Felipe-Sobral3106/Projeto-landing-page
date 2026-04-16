package com.tiamari.landingpage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    
    @GetMapping("/") //É o que define que é a pag inicial
    public String home() {
        return "index"; // Manda o java procurar o arquivo index.html
    }
}
