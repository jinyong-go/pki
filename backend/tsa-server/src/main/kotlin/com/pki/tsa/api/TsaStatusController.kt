package com.pki.tsa.api

import com.pki.common.web.ApiResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/tsa")
class TsaStatusController {

    @GetMapping("/status")
    fun status(): ApiResponse<Map<String, String>> =
        ApiResponse.ok(mapOf("service" to "TSA", "status" to "UP"))
}
