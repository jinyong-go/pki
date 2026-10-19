package com.pki.common.web

import java.time.Instant

data class ApiResponse<T>(
    val success: Boolean,
    val data: T? = null,
    val error: ErrorBody? = null,
    val timestamp: Instant = Instant.now(),
) {
    data class ErrorBody(val code: String, val message: String)

    companion object {
        fun <T> ok(data: T): ApiResponse<T> = ApiResponse(success = true, data = data)
        fun fail(code: String, message: String): ApiResponse<Nothing> =
            ApiResponse(success = false, error = ErrorBody(code, message))
    }
}
