package com.rabitarochan.web

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class MainController() {

    @RequestMapping("/")
    fun index(model: Model): String {
        model.addAttribute("message", "Hello world!")
        return "/index"
    }

}