package com.github.fscoward.meyasubako

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SampleController {
  @GetMapping("/greeting")
  fun greeting(): String {
    return "hello"
  }
}