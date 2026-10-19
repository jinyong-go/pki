package com.pki.ra.api

import com.pki.common.web.ApiResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/ra")
class RaStatusController {

    @GetMapping("/status")
    fun status(): ApiResponse<Map<String, String>> =
        ApiResponse.ok(mapOf("service" to "RA", "status" to "UP"))
}
