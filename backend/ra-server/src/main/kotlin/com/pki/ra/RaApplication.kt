package com.pki.ra

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["com.pki.common", "com.pki.ra"])
class RaApplication

fun main(args: Array<String>) {
    runApplication<RaApplication>(*args)
}
