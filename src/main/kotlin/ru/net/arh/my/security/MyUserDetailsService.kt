package ru.net.arh.my.security

import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService

open class MyUserDetailsService : UserDetailsService {
    override fun loadUserByUsername(p0: String?): MyUserDetails {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}