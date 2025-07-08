
package com.proyecto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class VistaVideoController {
    
    @RequestMapping("/vistavideo")
    public String vistavideo() {
        return "vistavideo/listado"; 
    } 
    
}
