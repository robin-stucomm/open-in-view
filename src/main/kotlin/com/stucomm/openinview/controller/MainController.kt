package com.stucomm.openinview.controller

import com.stucomm.openinview.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@RequestMapping("/")
@Controller
class MainController @Autowired constructor(
        val userRepository: UserRepository
) {
    @GetMapping
    fun main(model: Model): String {
        val users = userRepository.findAll()
        model.addAttribute("users", users)
        return "index.html"
    }
}