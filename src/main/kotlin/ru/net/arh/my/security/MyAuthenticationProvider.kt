package ru.net.arh.my.security

import org.springframework.security.authentication.AuthenticationProvider
import org.springframework.security.core.Authentication

open class MyAuthenticationProvider: AuthenticationProvider {
    override fun authenticate(p0: Authentication?): Authentication {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun supports(p0: Class<*>?): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}