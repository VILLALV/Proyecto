
package com.proyecto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UsuarioController {
    
    @RequestMapping("/usuario")
    public String videos() {
        return "usuario/listado"; 
    } 
}
