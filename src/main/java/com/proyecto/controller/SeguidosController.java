
package com.proyecto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class SeguidosController {
    
    @RequestMapping("/seguidos")
    public String seguidos() {
        return "seguidos/listado"; 
    }     
}
