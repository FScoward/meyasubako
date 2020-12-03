package com.github.fscoward.meyasubako

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class CreateMeyasubakoController {
    @PostMapping("/create")
    fun create(): String {
        return "ok"
    }
}
