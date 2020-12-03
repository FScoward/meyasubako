package com.github.fscoward.meyasubako

import io.kotest.core.spec.style.StringSpec
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

@WebMvcTest
class CreateMeyasubakoController(@Autowired val mockMvc: MockMvc) : StringSpec({
    "create meyasubako" {
        mockMvc.perform(post("/create")).andExpect(status().isOk)
    }
})
