package com.aerospace.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/home")
class Dashboard {

    @GetMapping("/")
    fun getAirportDetails(): List<String> {
        return listOf("Mumbai", "Rajesthan")
    }

    @GetMapping("/recent")
    fun getRecentActivities(): List<String> {
        return listOf("Mumbai", "Rajesthan")
    }

}