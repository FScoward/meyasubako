package com.github.fscoward.meyasubako

import io.kotest.core.spec.style.StringSpec
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.web.servlet.MockMvc

import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status


@WebMvcTest
class SampleControllerTest(@Autowired val mockMvc: MockMvc) : StringSpec({
  "sample controller" {
    mockMvc.perform(get("/greeting")).andExpect(status().isOk)
  }
})