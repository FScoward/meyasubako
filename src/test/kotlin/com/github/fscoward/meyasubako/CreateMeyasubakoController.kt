package com.github.fscoward.meyasubako

import io.kotest.core.spec.style.StringSpec
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

class CreateMeyasubakoController(@Autowired val mockMvc: MockMvc) : StringSpec({
    "create meyasubako" {
        mockMvc.perform(post("/meyasubako")).andExpect(status().isOk)
    }
})
