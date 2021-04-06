package ru.net.arh.my.config

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.security.crypto.password.PasswordEncoder
import kotlin.jvm.Throws


@Configuration
@EnableWebSecurity
open class MySecurityConfig : WebSecurityConfigurerAdapter() {

    override fun configure(http: HttpSecurity) {
//        http.authorizeRequests()
//                .antMatchers("/main/ping").permitAll()
//                .antMatchers("/main/ping2").hasRole("ADMIN")
//                .anyRequest().hasRole("USER")
//                .and().httpBasic()
        http.authorizeRequests()
                .anyRequest().permitAll()
                .and().httpBasic()
    }

    @Autowired
    @Throws(Exception::class)
    open fun configureGlobal(auth: AuthenticationManagerBuilder) {
        auth.inMemoryAuthentication()
                .withUser("user")
                .password(passwordEncoder()
                        .encode("password")).roles("USER")
    }

    @Bean
    open fun passwordEncoder(): PasswordEncoder {
        return BCryptPasswordEncoder()
    }
}