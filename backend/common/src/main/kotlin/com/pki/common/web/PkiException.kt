package com.pki.common.web

import org.springframework.http.HttpStatus

open class PkiException(
    val status: HttpStatus,
    val code: String,
    override val message: String,
    cause: Throwable? = null,
) : RuntimeException(message, cause)
