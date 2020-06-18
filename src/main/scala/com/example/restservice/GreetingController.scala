package com.example.restservice

import java.util.concurrent.atomic.AtomicLong

import org.springframework.web.bind.annotation.{GetMapping, RequestParam, RestController}

@RestController
class GreetingController {
  val template = "Hello %s!"
  val counter = new AtomicLong(0L)

  @GetMapping(value = Array("/greeting"), produces = Array("application/json"))
  def greeting(@RequestParam(value = "name", defaultValue = "World") name: String): Greeting = {
    Greeting(counter.incrementAndGet(), String.format(template, name))
  }
}
