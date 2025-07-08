
package com.proyecto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VideosController {
    
    @RequestMapping("/videos")
    public String videos() {
        return "videos/listado"; 
    } 
    
}
