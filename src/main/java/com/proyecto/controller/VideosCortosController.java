
package com.proyecto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class VideosCortosController {
    
    @RequestMapping("/videoscortos")
    public String videoscortos() {
        return "videoscortos/listado"; 
    } 
    
}
