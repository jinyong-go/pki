package com.pki.tsa

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["com.pki.common", "com.pki.tsa"])
class TsaApplication

fun main(args: Array<String>) {
    runApplication<TsaApplication>(*args)
}
