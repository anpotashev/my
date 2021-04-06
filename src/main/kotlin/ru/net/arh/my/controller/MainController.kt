package ru.net.arh.my.controller

import org.springframework.security.access.annotation.Secured
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/main")
open class MainController {

    @GetMapping("/ping")
    fun ping() : String {
        return "pong"
    }

    @Secured("ADMIN")
    @GetMapping("/ping2")
    fun ping2() : String {
        return "pong2"
    }

    @Secured("USER")
    @GetMapping("/ping3")
    fun ping3() : String {
        return "pong3"
    }
}