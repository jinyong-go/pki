package com.pki.common.config

import jakarta.annotation.PostConstruct
import org.bouncycastle.jce.provider.BouncyCastleProvider
import org.springframework.context.annotation.Configuration
import java.security.Security

@Configuration
class BouncyCastleConfig {

    @PostConstruct
    fun registerProvider() {
        if (Security.getProvider(BouncyCastleProvider.PROVIDER_NAME) == null) {
            Security.addProvider(BouncyCastleProvider())
        }
    }
}
