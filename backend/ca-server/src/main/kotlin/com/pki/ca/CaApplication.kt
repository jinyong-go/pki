package com.pki.ca

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["com.pki.common", "com.pki.ca"])
class CaApplication

fun main(args: Array<String>) {
    runApplication<CaApplication>(*args)
}
